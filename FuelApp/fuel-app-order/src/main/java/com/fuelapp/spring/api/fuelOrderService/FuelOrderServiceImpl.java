package com.fuelapp.spring.api.fuelOrderService;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fuelapp.spring.api.fuelOrderConfig.KafkaTopicConfig;
import com.fuelapp.spring.api.fuelOrderModel.FuelOrder;
import com.fuelapp.spring.api.fuelOrderRepo.OrderRepo;

@Service
public class FuelOrderServiceImpl implements FuelOrderService {

	
	@Autowired
	OrderRepo orderRepo;
	
	@Autowired
	KafkaTemplate<String, FuelOrder> kafkaTemplate;
	
	
	@Override
	public ResponseEntity<FuelOrder> saveOrder(FuelOrder fuelOrder) {
		
		Random random = new Random();
		int refId  = random.nextInt(2500);
		 //refId = refId+1;
			
		fuelOrder.setOrderID(refId);
		kafkaTemplate.send(KafkaTopicConfig.MESSAGE_TOPIC, fuelOrder);
		orderRepo.save(fuelOrder);
			
		return ResponseEntity.status(HttpStatus.OK).body(fuelOrder);
		
	}
	

	@Override
	public ResponseEntity<List<FuelOrder>> getOrder(int shedId) {
	
		return ResponseEntity.status(HttpStatus.OK).body(orderRepo.findBysID(shedId));
	}
	

	@Override
	public ResponseEntity<List<FuelOrder>> getAllOrders() {
		
		return ResponseEntity.status(HttpStatus.OK).body(orderRepo.findAll());
	}
	

	@Override
	public ResponseEntity<FuelOrder> orderReceived(int id, String status) {
		
		Optional<FuelOrder> byId = orderRepo.findById(id);
		if(byId.isPresent()) {
			FuelOrder order = byId.get();
			order.setStatus(status);
			
			orderRepo.save(order);
			
			return ResponseEntity.status(HttpStatus.OK).body(order);
			
		}else {
		    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		  }
	}
	
	
	@Override
	public ResponseEntity<FuelOrder> orderReceived(int id, String status, String date) {
		
		Optional<FuelOrder> byId = orderRepo.findById(id);
		if(byId.isPresent()) {
			FuelOrder order = byId.get();
			order.setStatus(status);
			order.setDate(date);
			
			orderRepo.save(order);
			
			return ResponseEntity.status(HttpStatus.OK).body(order);
			
		}else {
		    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		  }
	}
	
	


}