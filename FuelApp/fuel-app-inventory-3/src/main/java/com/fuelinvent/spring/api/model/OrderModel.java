package com.fuelinvent.spring.api.model;

public class OrderModel {
	private int id;
	private int orderReferenceId;
	private String stationName;
	private String stationId;
	private String fuelType;
	private int fuelAmmount;
	private String requestDate;
	private String status;
	
	public OrderModel() {
		
	}

	public OrderModel(int id, int orderReferenceId, String stationName, String stationId, String fuelType,
			int fuelAmmount, String requestDate, String status) {
		super();
		this.id = id;
		this.orderReferenceId = orderReferenceId;
		this.stationName = stationName;
		this.stationId = stationId;
		this.fuelType = fuelType;
		this.fuelAmmount = fuelAmmount;
		this.requestDate = requestDate;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderReferenceId() {
		return orderReferenceId;
	}

	public void setOrderReferenceId(int orderReferenceId) {
		this.orderReferenceId = orderReferenceId;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getStationId() {
		return stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getFuelAmmount() {
		return fuelAmmount;
	}

	public void setFuelAmmount(int fuelAmmount) {
		this.fuelAmmount = fuelAmmount;
	}

	public String getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
	

}