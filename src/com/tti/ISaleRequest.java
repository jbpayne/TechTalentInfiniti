package com.tti;

public interface ISaleRequest {
	
	public int getTicketID();

	public Object getClient();

	public void setClient(Object client);

	public String getTypeOfSale();

	public void setTypeOfSale(String typeOfSale);

	public Object getVehicle();

	public void setVehicle(Object vehicle);
}
