package com.fuelinvent.spring.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fuelinvent.spring.api.model.Reserve;

public interface ReservedDetailRepository extends MongoRepository<Reserve, Integer> {

}
