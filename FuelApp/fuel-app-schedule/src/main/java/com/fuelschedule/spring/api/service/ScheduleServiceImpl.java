package com.fuelschedule.spring.api.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fuelschedule.spring.api.model.Schedule;
import com.fuelschedule.spring.api.repository.ScheduleRepo;



@Service
public class ScheduleServiceImpl implements ScheduleService {
	
	@Autowired
	ScheduleRepo scheduleRepo;

	@Override
	public Schedule saveSchedule(Schedule schedule) {
		return scheduleRepo.save(schedule);
	}

	@Override
	public Schedule deliveryDate(int orderRefId) {
		
		Schedule schedule = new Schedule();
		schedule.setOrderRefId(orderRefId);
		schedule.setDate(LocalDate.now().plusDays(1));
		saveSchedule(schedule);
		
		return schedule;
	}

	@Override
	public List<Schedule> getAllDeliveryDates() {
		return scheduleRepo.findAll();
	
	}

	
}
