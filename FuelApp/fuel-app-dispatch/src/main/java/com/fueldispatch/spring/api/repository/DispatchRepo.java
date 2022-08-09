package com.fueldispatch.spring.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fueldispatch.spring.api.model.Dispatch;

@Repository
public interface DispatchRepo extends MongoRepository<Dispatch, Integer> {

}
