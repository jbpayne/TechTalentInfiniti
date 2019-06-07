package com.tti;

public class Vehicle {

    private int vehicleID;
    private int stockNumber;
    private int wholesaleCost;
    private int retailPrice;
    private int modelYear;
    private String make;
    private String model;
    private String color;
    private String vin;
    private String vehicleType;// Placeholder until functionality added (Using enum)
    private boolean isLeasable;
    private int leaseTerm;
    private int maxMilesPerYear;


    Vehicle(int vehicleID, int stockNumber,
            int wholesaleCost, int retailPrice,
            int modelYear, String make, String model,
            String color, String vin,  String vehicleType,
            boolean isLeasable, int leaseTerm,
            int maxMilesPerYear){
        this.vehicleID = vehicleID;
        this.stockNumber = stockNumber;
        this.wholesaleCost = wholesaleCost;
        this.retailPrice = retailPrice;
        this.model = model;
        this.color = color;
        this.vin = vin;
        this.vehicleType = vehicleType;
        this.isLeasable = isLeasable;
        this.leaseTerm = leaseTerm;
        this.maxMilesPerYear = maxMilesPerYear;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public int getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(int stockNumber) {
        this.stockNumber = stockNumber;
    }

    public int getWholesaleCost() {
        return wholesaleCost;
    }

    public void setWholesaleCost(int wholesaleCost) {
        this.wholesaleCost = wholesaleCost;
    }

    /**
     * @return the retailPrice
     */
    public int getRetailPrice() {
        return retailPrice;
    }

    /**
     * @param retailPrice the retailPrice to set
     */
    public void setRetailPrice(int retailPrice) {
        this.retailPrice = retailPrice;
    }

    /**
     * @return the modelYear
     */
    public int getModelYear() {
        return modelYear;
    }

    /**
     * @param modelYear the modelYear to set
     */
    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the vin
     */
    public String getVin() {
        return vin;
    }

    /**
     * @param vin the vin to set
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
     * @return the vehicleType
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * @param vehicleType the vehicleType to set
     */
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * @return the isLeasable
     */
    public boolean isLeasable() {
        return isLeasable;
    }

    /**
     * @param isLeasable the isLeasable to set
     */
    public void setLeasable(boolean isLeasable) {
        this.isLeasable = isLeasable;
    }

    /**
     * @return the leaseTerm
     */
    public int getLeaseTerm() {
        return leaseTerm;
    }

    /**
     * @param leaseTerm the leaseTerm to set
     */
    public void setLeaseTerm(int leaseTerm) {
        this.leaseTerm = leaseTerm;
    }

    /**
     * @return the maxMilesPerYear
     */
    public int getMaxMilesPerYear() {
        return maxMilesPerYear;
    }

    /**
     * @param maxMilesPerYear the maxMilesPerYear to set
     */
    public void setMaxMilesPerYear(int maxMilesPerYear) {
        this.maxMilesPerYear = maxMilesPerYear;
    }

    public float getMileagePenalty() {
        //if//(){
        //{
        //return null;

//		}//
        //	else{
        return 500.0f;
    }
}
