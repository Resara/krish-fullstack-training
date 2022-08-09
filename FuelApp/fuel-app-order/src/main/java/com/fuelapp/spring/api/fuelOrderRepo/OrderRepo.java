package com.fuelapp.spring.api.fuelOrderRepo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fuelapp.spring.api.fuelOrderModel.FuelOrder;

public interface OrderRepo extends MongoRepository<FuelOrder,Integer> {
	
	public List<FuelOrder> findBysID(int id);

}
