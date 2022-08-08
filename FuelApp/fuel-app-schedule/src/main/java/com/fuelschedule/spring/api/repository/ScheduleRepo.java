package com.fuelschedule.spring.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fuelschedule.spring.api.model.Schedule;

@Repository
public interface ScheduleRepo extends MongoRepository<Schedule, Integer> {

}
