package com.fuelschedule.spring.api.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Schedule")
public class Schedule {
	
	@Id
	private int orderRefId;
	private LocalDate date;
	
	public Schedule() {
	
	}

	public Schedule(int orderRefId, LocalDate date) {
		this.orderRefId = orderRefId;
		this.date = date;
	}

	public int getOrderRefId() {
		return orderRefId;
	}

	public void setOrderRefId(int orderRefId) {
		this.orderRefId = orderRefId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	
	
	
	

}
