package com.fuelschedule.spring.api.service;

import java.util.List;

import com.fuelschedule.spring.api.model.Schedule;

public interface ScheduleService {
	public Schedule saveSchedule(Schedule schedule);
	public Schedule deliveryDate(int orderRefId);
	public List<Schedule> getAllDeliveryDates();

}