package com.fuelinvent.spring.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fuelinvent.spring.api.model.Available;
import com.fuelinvent.spring.api.repository.AvailableDetailRepository;

@Service
public class AvailableDetailServiceImpl implements AvailableDetailService {

	@Autowired 
	AvailableDetailRepository availableDetailRepository;
	
	@Autowired
	ReservedDetailService reservedDetailService;
	
	
	@Override
	public ResponseEntity<Available> saveAvailableFuelDetail(Available available) {
		availableDetailRepository.save(available);
		
		return ResponseEntity.status(HttpStatus.OK).body(available);
	}

	@Override
	public Available getOrderCapacity(String fuelType, int fuelCapacity, int referenceOrderId) {
		
		Available availableFuelType = availableDetailRepository.findByFuelType(fuelType);
		int avalableStock = availableFuelType.getAmount();
		String status = "Order Allocated";
		
		if(avalableStock >= fuelCapacity) {
			int availableAmmountCapacity  = avalableStock - fuelCapacity;
			availableFuelType.setAmount(availableAmmountCapacity);
			saveAvailableFuelDetail(availableFuelType);
			reservedDetailService.getFromAvailableDetails(referenceOrderId, fuelType, fuelCapacity);
		}
		
		return availableFuelType;
	}

}
