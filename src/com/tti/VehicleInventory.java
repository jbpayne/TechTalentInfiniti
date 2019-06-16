package com.tti;

import java.util.HashMap;

public class VehicleInventory {
	    private static HashMap<Integer, Vehicle> inventory = new HashMap<>();

	    public static HashMap<Integer, Vehicle> getVehicleInventory() {
	         return inventory;
	    }
	    
	    public static void populateHashMap() {
	    	Vehicle vehicle1 = new Vehicle(20000, 22000, 2019, "Toyota", "Corolla", "Black", "36876G7dD8d9HJ", "CAR", false, 0, 0);
	    	Vehicle vehicle2 = new Vehicle(30000, 34000, 2020, "Toyota", "Camry", "Silver", "638F7dDD8d79D7", "CAR", false, 0, 0);
	    	Vehicle vehicle3 = new Vehicle(36000, 42000, 2019, "Toyota", "Prius", "Blue", "5H876G7dD8d9HJ", "CAR", true, 3, 12000);
	    	Vehicle vehicle4 = new Vehicle(32000, 38000, 2020, "Toyota", "Avalon", "Red", "111HH4JDD8d9HJ", "CAR", false, 0, 0);
	    	Vehicle vehicle5 = new Vehicle(36000, 42000, 2019, "Toyota", "Prius", "Purple", "5k54kk5G7dD8d9HJ", "CAR", true, 3, 12000);
	    	Vehicle vehicle6 = new Vehicle(36000, 42000, 2019, "Toyota", "Prius", "Grey", "F9SH9H349HSDU", "CAR", true, 3, 12000);
	    	Vehicle vehicle7 = new Vehicle(20000, 22000, 2018, "Toyota", "Corolla", "Orange", "44JF34JF9H444", "CAR", false, 0, 0);
	    	Vehicle vehicle8 = new Vehicle(30000, 34000, 2020, "Toyota", "Camry", "Silver", "F98NE97RN9SNF", "CAR", true, 3, 12000);
	    	LightTruck vehicle9 = new LightTruck(36000, 42000, 2019, "Toyota", "Tundra", "Metallic Blue", "498FN9834N93477F", "CAR", true, 3, 12000, 8500, 15000, 7385, true);
	    	
	    	Vehicle[] VehicleArray = {vehicle1, vehicle2, vehicle3, vehicle4, vehicle5, vehicle6, vehicle7, vehicle8, vehicle9};
	    	
	    	for(int i = 0; i < VehicleArray.length; i++) {
	    		inventory.put(VehicleArray[i].getStockNumber(), VehicleArray[i]);
	    	}
	    }
	    public static void printInventory() {
	    	inventory.forEach((key, value) -> {
	    		System.out.println(
	    				inventory.get(key).getStockNumber() + " " + 
	    				inventory.get(key).getModelYear() + " " + 
	    				inventory.get(key).getColor() + " " + 
	    				inventory.get(key).getMake() + " " + 
	    				inventory.get(key).getModel() + " "
	    				);
	    	});
	    }
	    
	    public static void removeVehicle(int key) {
	    	inventory.remove(key);
	    }
}
