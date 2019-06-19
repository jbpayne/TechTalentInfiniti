package com.tti;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * jUnit tests for VehicleInventory.java
 */


public class VehicleInventoryTest {
	
	@BeforeEach
	public void setup() {
		VehicleInventory.populateHashMap();
	}
	
    // Test for the presence of a specific vehicle in the output
    @Test
    public void printInventoryTest() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

    	VehicleInventory.printInventory(true);
    	assertTrue(outContent.toString().contains("2019 Purple Toyota Prius"));
    }
	
    // Test for presence of a vehicle in the hashmap before and after removeVehicle method
    @Test
    public void removeVehicleTest() {
    	assertTrue(VehicleInventory.getVehicleInventory().containsKey(5));
    	VehicleInventory.removeVehicle(5);
    	assertFalse(VehicleInventory.getVehicleInventory().containsKey(5));
    }

}
