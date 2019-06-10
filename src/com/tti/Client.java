package com.tti;


interface IClient {
	
	public int getId();

	public String getFullName();

	public void setFullName(String fullName);

	public String getPhoneNumber();

	public void setPhoneNumber(String phoneNumber);

	public String getAddress();

	public void setAddress(String address);
	
}


public class Client implements IClient {
	
	private static int idCounter = 0;
		
	private int id;
	private String fullName;
	private String phoneNumber;
	private String address;
		
	Client(String fullName, String phoneNumber, String address) {
		this.id = createID();
		this.setFullName(fullName);
		this.setPhoneNumber(phoneNumber);
		this.setAddress(address);
	}
	
	public int getId() {
		return id;
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
	
	private static int createID() {
	    return idCounter += 1;
	}
}
