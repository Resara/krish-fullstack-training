package com.fuelinvent.spring.api.service;

import com.fuelinvent.spring.api.model.Reserve;

public interface ReservedDetailService {
	
	public Reserve addReserveDetails(Reserve reserve);
	public Reserve getFromAvailableDetails(int referenceOrderId, String fuelType, int fuelCapacity );
}