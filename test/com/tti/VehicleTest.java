package com.tti;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * jUnit tests for Vehicle.java
 */

public class VehicleTest {
	private Vehicle vehicle01;
	private Vehicle vehicle02;
	private Vehicle vehicle03;
	
	@BeforeEach
	public void setup() {
		vehicle01 = new Vehicle(20000, 22000, 2019, "Toyota", "Corolla", "Black", "36876G7dD8d9HJ", "CAR", false, 0, 0);
		vehicle02 = new Vehicle(30000, 34000, 2020, "Toyota", "Camry", "Silver", "638F7dDD8d79D7", "CAR", false, 0, 0);
		vehicle03 = new Vehicle(36000, 42000, 2019, "Toyota", "Prius", "Blue", "5H876G7dD8d9HJ", "CAR", true, 3, 12000);
	}
	
    // Test whether each new instance of the Vehicle class has a unique, sequential stock number
    @Test
    public void myATest() {
        assertEquals(1, vehicle01.getStockNumber());
        assertEquals(2, vehicle02.getStockNumber());
        assertEquals(3, vehicle03.getStockNumber());
    }
    
    // Test whether each instance of the Vehicle class has a model year greater than 1960
    @Test
    public void myBTest() {
    	assertTrue(vehicle01.getModelYear() > 1960);
    	assertTrue(vehicle02.getModelYear() > 1960);
    	assertTrue(vehicle03.getModelYear() > 1960);
    }
    
    // Test whether each instance of the Vehicle class is leasable
    @Test
    public void myCTest() {
    	assertFalse(vehicle01.isLeasable());
    	assertFalse(vehicle02.isLeasable());
    	assertTrue(vehicle03.isLeasable());
    }
}
