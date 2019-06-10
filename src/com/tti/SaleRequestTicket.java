package com.tti;


interface ISaleRequest {
	
	public int getTicketID();

	public Object getClient();

	public void setClient(Object client);

	public String getTypeOfSale();

	public void setTypeOfSale(String typeOfSale);

	public Object getVehicle();

	public void setVehicle(Object vehicle);

}


public class SaleRequestTicket implements ISaleRequest {
	
	private static int idCounter = 0;
	
	private int ticketID;
	private Object client; 
	private String typeOfSale;
	private Object vehicle;
	
	SaleRequestTicket(Object client, String typeOfSale, Object vehicle) {
		this.ticketID = createID();
		this.setClient(client);
		this.setTypeOfSale(typeOfSale);
		this.setVehicle(vehicle);
	}

	public int getTicketID() {
		return ticketID;
	}

	public Object getClient() {
		return client;
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

	public Object getVehicle() {
		return vehicle;
	}

	public void setVehicle(Object vehicle) {
		this.vehicle = vehicle;
	}
	
	private static int createID() {
	    return idCounter += 1;
	}
}
