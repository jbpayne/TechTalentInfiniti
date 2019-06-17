package com.tti;

import java.util.HashMap;

public class VehicleInventory {
	    private static HashMap<Integer, Vehicle> inventory = new HashMap<>();

	    public static HashMap<Integer, Vehicle> getVehicleInventory() {
	         return inventory;
	    }
	    
	    public static void populateHashMap() {
	    	
	    	Vehicle[] VehicleArray = {
    			new Vehicle(37450, 39660, 2019, "Infiniti", "Q50", "Black", "JN8AY4ND7G3DS9CH2", "CAR", false, 0, 0),
    			new Vehicle(37450, 39660, 2019, "Infiniti", "Q50", "Silver", "JN8C8865712F6VH21", "CAR", false, 0, 0),
    			new Vehicle(39200, 42350, 2020, "Infiniti", "Q50", "Blue", "JN8AY4N297238GG23", "CAR", true, 36, 12000),
    			new Vehicle(59320, 62667, 2019, "Infiniti", "Q60", "Red", "JN8A888SN66C279CF", "CAR", false, 0, 0),
    			new Vehicle(59320, 62667, 2019, "Infiniti", "Q60", "Purple", "JN8AY4HH333LJLK23", "CAR", true, 36, 12000),
    			new Vehicle(61420, 64200, 2020, "Infiniti", "Q60", "Grey", "JN8AY4NJD774DHJ232", "CAR", true, 36, 12000),
    			new LightTruck(27000, 29000, 2019, "Infiniti", "QX30", "Metallic Blue", "JN8AY4ND7ED338D21", "CAR", false, 0, 0, 8500, 15000, 7385, true),
    			new LightTruck(59500, 62590, 2019, "Infiniti", "QX80", "Red", "JN8AY4N7379CY23", "CAR", true, 36, 12000, 8500, 15000, 7385, true),
    			new LightTruck(59500, 62590, 2019, "Infiniti", "QX80", "Pearl White", "JN8AY3887BH222D9S", "CAR", true, 36, 12000, 8500, 15000, 7385, true)
	    	};
	    	
	    	for(int i = 0; i < VehicleArray.length; i++) {
	    		inventory.put(VehicleArray[i].getStockNumber(), VehicleArray[i]);
	    	}
	    }
	    public static void printInventory(boolean leaseFilter) {
	    	inventory.forEach((key, value) -> {
	    		if (!inventory.get(key).isActive()) {
	    			if (!leaseFilter) {
	    				inventoryList(key);
	    			}
	    			else if (inventory.get(key).isLeasable()) {
	    				inventoryList(key);
	    			}
	    		}
	    	});
	    }

		private static void inventoryList(Integer key) {
			System.out.println(
				inventory.get(key).getStockNumber() + " " + 
				inventory.get(key).getModelYear() + " " + 
				inventory.get(key).getColor() + " " + 
				inventory.get(key).getMake() + " " + 
				inventory.get(key).getModel() + " "
				);
		}
	    
	    public static void removeVehicle(int key) {
	    	inventory.remove(key);
	    }
}
