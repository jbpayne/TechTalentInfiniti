package com.tti;

public class Client {
	
	private String FullName;
	private String PhoneNumber;
	private String Address;
	private String TypeOfSale;
	private int VehicleStockNumber;
	
	Client(String fullName, String phoneNumber, String address, String typeOfSale, int vehicleStockNumber) {
		this.FullName = fullName;
		this.PhoneNumber = phoneNumber;
		this.Address = address;
		this.TypeOfSale = typeOfSale;
		this.VehicleStockNumber = vehicleStockNumber;
	}
	
	public String getFullName() {
		return this.FullName;
	}

	public void setFullName(String fullName) {
		this.FullName = fullName;
	}

	public String getPhoneNumber() {
		return this.PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.PhoneNumber = phoneNumber;
	}

	public String getAddress() {
		return this.Address;
	}

	public void setAddress(String address) {
		this.Address = address;
	}

	public String getTypeOfSale() {
		return this.TypeOfSale;
	}

	public void setTypeOfSale(String typeOfSale) {
		this.TypeOfSale = typeOfSale;
	}

	public int getVehicleStockNumber() {
		return this.VehicleStockNumber;
	}

	public void setVehicleStockNumber(int vehicleStockNumber) {
		this.VehicleStockNumber = vehicleStockNumber;
	}
}
