package com.tti;

/**
 * SalesRequest Class implements the ISaleRequest.java Class, which abstracts the 
 * corresponding variables and methods. The SalesRequest.java class constructs the 
 * SalesRequest object, with parameters (Vehicle Object, Type of Sale String and 
 * Client Object). The SalesRequest Object will then be used to match a customer 
 * to a vehicle.
 */

public class SaleRequest implements ISaleRequest {
	
	private static int idCounter = 0;
	
	private int ticketID;
	private Object client; 
	private String typeOfSale;
	private Object vehicle;
	
	SaleRequest(Object client, String typeOfSale, Object vehicle) {
		this.ticketID = createID();
		this.setClient(client);
		this.setTypeOfSale(typeOfSale);
		this.setVehicle(vehicle);
	}

	public int getTicketID() {
		return ticketID;
	}

	public Client getClient() {
		return (Client) client;
	}

	public void setClient(Object client) {
		this.client = client;
	}

	public String getTypeOfSale() {
		return typeOfSale;
	}

	public void setTypeOfSale(String typeOfSale) {
		this.typeOfSale = typeOfSale;
	}

	public Vehicle getVehicle() {
		return (Vehicle) vehicle;
	}

	public void setVehicle(Object vehicle) {
		this.vehicle = vehicle;
	}
	
	private static int createID() {
	    return idCounter += 1;
	}
}
