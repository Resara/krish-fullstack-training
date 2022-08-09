package com.fuelapp.spring.api.fuelOrderModel;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString


@Document(collection = "GasStationOrder")
public class FuelOrder {
	
	
	@Id
	private int orderID;


	private int sID;
	private String stationName;
	private String fuelType;
	private int fuelQTY;
	private String status = "Pending";
	private String date = "Pending";
	
	
	
	
	public int getOrderID() {
		return orderID;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getsID() {
		return sID;
	}
	public void setsID(int sID) {
		this.sID = sID;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getFuelQTY() {
		return fuelQTY;
	}
	public void setFuelQTY(int fuelQTY) {
		this.fuelQTY = fuelQTY;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	

	
}
