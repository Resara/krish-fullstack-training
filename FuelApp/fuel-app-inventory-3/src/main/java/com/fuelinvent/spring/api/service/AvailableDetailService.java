package com.fuelinvent.spring.api.service;

import org.springframework.http.ResponseEntity;

import com.fuelinvent.spring.api.model.Available;

public interface AvailableDetailService {

	public ResponseEntity<Available> saveAvailableFuelDetail(Available available);
	
	public Available getOrderCapacity(String fuelType, int fuelCapacity, int referenceOrderId);
}
