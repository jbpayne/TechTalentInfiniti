package com.tti;

/**
 * The Program takes entry as the "Front Desk." The Front Desk is then able to place the 
 * entries into three distinct queues, Full Sale, Lease, and Finance. Each category receives 
 * its own queue, into which requests are stored, and from which they are gathered. Requests 
 * for vehicles are then stored and matched with existing vehicles that are hard coded into 
 * our program. Vehicles are stored in a HashMap within the VehicleInventory class, paired 
 * with a unique key that matches the stock number.
 */
public class Main {

	public static void main(String[] args) {
		
		// Add vehicles to the inventory		
		VehicleInventory.populateHashMap();
		
		// Infinite loop to load the main menu whenever a sub-menu exits
		while (true) {
			MainMenu.load();
		}
	}

}
