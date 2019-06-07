package com.tti;

public class Client {
	
	private String FullName;
	private int PhoneNumber;
	private String Address;
	
	Client(String fullName, int phoneNumber, String address) {
		this.setFullName(fullName);
		this.setPhoneNumber(phoneNumber);
		this.setAddress(address);
	}

	public int getPhoneNumber() {
		return this.PhoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.PhoneNumber = phoneNumber;
	}

	public String getFullName() {
		return this.FullName;
	}

	public void setFullName(String fullName) {
		this.FullName = fullName;
	}

	public String getAddress() {
		return this.Address;
	}

	public void setAddress(String address) {
		this.Address = address;
	}
}
