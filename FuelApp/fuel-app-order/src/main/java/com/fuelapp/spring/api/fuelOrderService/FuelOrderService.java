package com.fuelapp.spring.api.fuelOrderService;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fuelapp.spring.api.fuelOrderModel.FuelOrder;

public interface FuelOrderService extends MongoRepository<FuelOrder, Integer> {

}
