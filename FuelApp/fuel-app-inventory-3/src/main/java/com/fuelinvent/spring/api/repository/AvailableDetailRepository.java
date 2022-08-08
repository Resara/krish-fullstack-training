package com.fuelinvent.spring.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fuelinvent.spring.api.model.Available;

@Repository
public interface AvailableDetailRepository extends MongoRepository<Available, Integer> {
	//Available selectFuelType(String type);
	Available findByFuelType(String type);
}
