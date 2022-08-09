package com.fuelapp.spring.api.fuelOrderService;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.fuelapp.spring.api.fuelOrderModel.FuelOrder;

public interface FuelOrderService {
	
	public ResponseEntity<FuelOrder> saveOrder(FuelOrder fuelOrder);
	public ResponseEntity<List<FuelOrder>> getOrder(int shedId);
	public ResponseEntity<List<FuelOrder>> getAllOrders();
	public ResponseEntity<FuelOrder> orderReceived(int id, String status);
	public ResponseEntity<FuelOrder> orderReceived(int id, String status, String date);

}
