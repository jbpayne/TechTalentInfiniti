package com.tti;

public class Client {
	
	private String fullName;
	private String phoneNumber;
	private String address;
	private String typeOfSale;
	private int vehicleStockNumber;
	
	Client(String fullName, String phoneNumber, String address, String typeOfSale, int vehicleStockNumber) {
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.typeOfSale = typeOfSale;
		this.vehicleStockNumber = vehicleStockNumber;
	}
	
	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTypeOfSale() {
		return this.typeOfSale;
	}

	public void setTypeOfSale(String typeOfSale) {
		this.typeOfSale = typeOfSale;
	}

	public int getVehicleStockNumber() {
		return this.vehicleStockNumber;
	}

	public void setVehicleStockNumber(int vehicleStockNumber) {
		this.vehicleStockNumber = vehicleStockNumber;
	}
}
