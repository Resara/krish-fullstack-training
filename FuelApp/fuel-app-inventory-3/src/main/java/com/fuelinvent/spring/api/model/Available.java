package com.fuelinvent.spring.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Available")
public class Available {
	
	@Id
	private int id;
	private String fuelType;
	private int amountAvailable;
	public Available() {
		
	}
	public Available(int id, String fuelType, int amount) {
		super();
		this.id = id;
		this.fuelType = fuelType;
		this.amountAvailable = amount;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getAmount() {
		return amountAvailable;
	}
	public void setAmount(int amount) {
		this.amountAvailable = amount;
	}
	
	

}

