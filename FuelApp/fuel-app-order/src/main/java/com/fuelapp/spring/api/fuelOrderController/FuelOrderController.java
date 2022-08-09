package com.fuelapp.spring.api.fuelOrderController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fuelapp.spring.api.fuelOrderModel.FuelOrder;
import com.fuelapp.spring.api.fuelOrderService.FuelOrderService;


@RestController

@RequestMapping
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class FuelOrderController {
	
	@Autowired
	FuelOrderService fuelOrderService;


	@PostMapping("/saveOrder")
	public ResponseEntity<FuelOrder> placeOrder(@RequestBody FuelOrder fuelOrder) {
		return fuelOrderService.saveOrder(fuelOrder);
	}
	
	@GetMapping("/{shedId}")
	public ResponseEntity<List<FuelOrder>> getOrder(@PathVariable int shedId){
		return fuelOrderService.getOrder(shedId);
	}
	
	@PutMapping("/{id}/{status}")
	public ResponseEntity<FuelOrder> orderReceived(@PathVariable int id, @PathVariable String status) {
		return fuelOrderService.orderReceived(id,status);
	}
	
	@GetMapping
	public ResponseEntity<List<FuelOrder>> getAllOrders(){
		return fuelOrderService.getAllOrders();
	}
	
	
}

