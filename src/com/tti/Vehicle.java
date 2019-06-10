package com.tti;

public class Vehicle {

	private static int idCounter = 0;
	
    private int stockNumber; //Declares vehicle stock number as integer
    private int id; //Declares id as integer
    private int wholesaleCost; //Declares Dealer Wholesale price as integer (represents US Dollars)
    private int retailPrice; //Declares Dealer Retail price as integer (represents US Dollars)
    private int modelYear; //Declares vehicle model year as integer (Takes 4 digit integer)
    private String make; //Declares vehicle make as String
    private String model; //Declares vehicle model as String
    private String color; //Declares vehicle color as String
    private String vin; //Declares vehicle vin as String
    private String vehicleType; // Placeholder until functionality added (Using enum)
    private boolean isLeasable; // Declares isLeasable variable as boolean
    private int leaseTerm; //Declares leaseTerm as integer in months
    private int maxMilesPerYear; //Declares Max Miles Per Year as integer

    //  Vehicle constructor code block
    Vehicle(int wholesaleCost, 
            int retailPrice,
            int modelYear, 
            String make, 
            String model,
            String color, 
            String vin,  
            String vehicleType,
            boolean isLeasable, 
            int leaseTerm,
            int maxMilesPerYear) {
    	
        this.stockNumber = createStockNumber();
        this.id = getStockNumber();
        this.setWholesaleCost(wholesaleCost);
        this.setRetailPrice(retailPrice);
        this.setMake(make);
        this.setModel(model);
        this.setColor(color);
        this.setVin(vin);
        this.setVehicleType(vehicleType);
        this.setLeasable(isLeasable);
        this.setLeaseTerm(leaseTerm);
        this.setMaxMilesPerYear(maxMilesPerYear);
    }
    
    // Code block Getter and setters code block
    public int getID() {
        return this.id;
    }

    public int getStockNumber() {
        return this.stockNumber;
    }

    public int getWholesaleCost() {
        return this.wholesaleCost;
    }

    public void setWholesaleCost(int wholesaleCost) {
        this.wholesaleCost = wholesaleCost;
    }

    /**
     * @return the retailPrice
     */
    public int getRetailPrice() {
        return this.retailPrice;
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
        return this.modelYear;
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
        return this.make;
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
        return this.model;
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
        return this.color;
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
        return this.vin;
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
        return this.vehicleType;
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
        return this.isLeasable;
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
        return this.leaseTerm;
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
        return this.maxMilesPerYear;
    }

    /**
     * @param maxMilesPerYear the maxMilesPerYear to set
     */
    public void setMaxMilesPerYear(int maxMilesPerYear) {
        this.maxMilesPerYear = maxMilesPerYear;
    }

    /**
     * @param  the maxMilesPerYear to set
     */

    /* End getter and Setter function code block


     */
    public float getMileagePenalty() {
        //if//(){
        //{
        //return null;

//		}//
        //	else{
        return 500.0f;
    }
    
	private static int createStockNumber() {
	    return idCounter += 1;
	}
}
