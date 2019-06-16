package com.tti;

public class Main {

	public static void main(String[] args) {
				
		VehicleInventory.populateHashMap();
		
		while (true) {
			MainMenu.load();
		}
	}

}
