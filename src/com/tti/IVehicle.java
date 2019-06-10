package com.tti;

public interface IVehicle {

	public int getID();

    public int getStockNumber();

    public int getWholesaleCost();

    public void setWholesaleCost(int wholesaleCost);

    public int getRetailPrice();
    
    public void setRetailPrice(int retailPrice);
    
    public int getModelYear();
    
    public void setModelYear(int modelYear);
    
    public String getMake();
    
    public void setMake(String make);
    
    public String getModel();
    
    public void setModel(String model);
    
    public String getColor();
    
    public void setColor(String color);
    
    public String getVin();
    
    public void setVin(String vin);
    
    public String getVehicleType();
    
    public void setVehicleType(String vehicleType);
    
    public boolean isLeasable();
    
    public void setLeasable(boolean isLeasable);
    
    public int getLeaseTerm();
    
    public void setLeaseTerm(int leaseTerm);
    
    public int getMaxMilesPerYear();
    
    public void setMaxMilesPerYear(int maxMilesPerYear);
    
    public float getMileagePenalty();
    
}
