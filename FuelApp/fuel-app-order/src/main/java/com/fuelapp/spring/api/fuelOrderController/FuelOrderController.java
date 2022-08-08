package com.fuelapp.spring.api.fuelOrderController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fuelapp.spring.api.fuelOrderModel.FuelOrder;
import com.fuelapp.spring.api.fuelOrderService.FuelOrderService;


@RestController
public class FuelOrderController {
	
	@Autowired
	private FuelOrderService fuelOrderService;

	@Autowired
	private KafkaTemplate <String, FuelOrder> kafkaTemplate;

	private static final String TOPIC = "orderTopic";


	//Save Order
	@PostMapping("/saveOrder")
	public String saveOrder(@RequestBody FuelOrder fuelOrder) {
		
		fuelOrderService.save(fuelOrder);

		kafkaTemplate.send(TOPIC, fuelOrder);
		
		return "Order Saved With ID:" +fuelOrder.getOrderID();
		
	} 
	
	
	@GetMapping("/getOrder/{id}")
	public Optional<FuelOrder> getOrder(@PathVariable int id){

		return fuelOrderService.findById(id);
	}
	
	@GetMapping("/getAllOrder")
	public List<FuelOrder> getAllOrder(){
		
		return fuelOrderService.findAll();
	}
	
	
	@PutMapping("/confirmOrder/{id}")
	public ResponseEntity<FuelOrder> orderComplete(@PathVariable int id){
		
		Optional<FuelOrder> byId = fuelOrderService.findById(id);
		if (byId.isPresent()) {
			
			FuelOrder fuelOrder = byId.get();
			fuelOrder.setOrderID(fuelOrder.getOrderID());
			fuelOrder.setsID(fuelOrder.getsID());
			fuelOrder.setFuelQTY(fuelOrder.getFuelQTY());
			fuelOrder.setFuelType(fuelOrder.getFuelType());
			fuelOrder.setStationName(fuelOrder.getStationName());
			fuelOrder.setStatus("Complete");
			
			fuelOrderService.save(fuelOrder);
			
			return ResponseEntity.status(HttpStatus.OK).body(fuelOrder);
			
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	
}
