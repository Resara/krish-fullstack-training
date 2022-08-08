package com.fuelschedule.spring.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fuelschedule.spring.api.model.Schedule;
import com.fuelschedule.spring.api.service.ScheduleService;



@RestController
@RequestMapping("api/viewSchedule/schedules")
public class ScheduleController {
	
	@Autowired
	ScheduleService scheduleService;
	
	@GetMapping("/allSchedules")
	public List<Schedule> getAllDeliveryDates() {
		return scheduleService.getAllDeliveryDates();
	
	}

}