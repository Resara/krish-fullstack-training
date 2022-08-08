package com.fuelinvent.spring.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Reserve")
public class Reserve {

	@Id
	private int id;
	private String fuelType;
	private int amountReserve;
	
	public Reserve() {
		
	}

	public Reserve(int id, String fuelType, int amountReserve) {
		super();
		this.id = id;
		this.fuelType = fuelType;
		this.amountReserve = amountReserve;
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

	public int getAmountReserve() {
		return amountReserve;
	}

	public void setAmountReserve(int amountReserve) {
		this.amountReserve = amountReserve;
	}
	
	
	
}
