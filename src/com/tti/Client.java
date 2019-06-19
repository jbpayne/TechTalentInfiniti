package com.tti;

/**
 * Client.java class implements the IClient.java interface. The Client Class then 
 * constructs the Client Object, which is used to store Client information. Client 
 * information (Full Name, Address, Phone, Number and id number) is then stored in 
 * the Client object. Getter and Setter functions are created within the class in 
 * order to make the data available within the package.
 */

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
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	private static int createID() {
	    return idCounter += 1;
	}
}
