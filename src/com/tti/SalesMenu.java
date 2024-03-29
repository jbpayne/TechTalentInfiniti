package com.tti;

import java.text.NumberFormat;
import java.util.Queue;
import java.util.Scanner;


/**
 * Presents 3 options in order:
 * 
 * 1. View next SaleRequest object in the queue.
 * 2. Delete the ticket.
 * 3. Delete the vehicle from inventory.
 * 
 * If answer is N/n to any question, it exits to MainMenu.
 *
 */

public class SalesMenu {

	// Open scanner for user input
	static Scanner scanner = new Scanner(System.in);

	// The main function that presents the menu options
	static void load(int selection) {
		SaleRequest ticket;
		Client client;
		Vehicle vehicle;
		Queue<Object> myQueue = null;
		String myName = null;
		String input = null;
		boolean leaseFilter = false;

		// Selects the queue object to use and the name of the office
		switch (selection) {
		case 2: myQueue = Queues.Finance;
		myName = "Finance";
			break;
		case 3: myQueue = Queues.Lease;
		myName = "Lease";
		leaseFilter = true;
			break;
		case 4: myQueue = Queues.FullSale;
		myName = "Full Sale";
			break;
		}

		System.out.println("Loading " + myName + " Rep Menu...\n\n");

		MainMenu.clearScreen();
		
		// When there's a SaleRequest object in the queue, ask if you want to view it
		if(!myQueue.isEmpty()) {
			System.out.println("Would you like to view the next client? (Y/N)");
			input = scanner.next();
			
			MainMenu.clearScreen();

			// View SaleRequest object with specified format if answer contains "y" or "Y"
			if (input.toLowerCase().contains("y")) {

				ticket = (SaleRequest) myQueue.peek();
				client = ticket.getClient();
				vehicle = ticket.getVehicle();

				System.out.println("Client Information:\n");
				System.out.println("Name: " + client.getFullName());
				System.out.println("Phone Number: " + client.getPhoneNumber());
				System.out.println("Address: " + client.getAddress() + "\n");
				System.out.println("Vehicle:\n");
				System.out.println("Stock Number: " + vehicle.getStockNumber());
				System.out.println("VIN: " + vehicle.getVin());
				System.out.println("Year: " + vehicle.getModelYear());
				System.out.println("Make: " + vehicle.getMake());
				System.out.println("Model: " + vehicle.getModel());
				System.out.println("Color: " + vehicle.getColor());
				System.out.println("Retail Price: $" + NumberFormat.getInstance().format(vehicle.getRetailPrice()));
				System.out.println("Wholesale Price: $" + NumberFormat.getInstance().format(vehicle.getWholesaleCost()));

				// Display LightTruck object properties if vehicleType is TRUCK (set in LightTruck constructor)
				if (vehicle.getVehicleType() == "TRUCK") {
					System.out.println("Towing Capacity: " + 
							NumberFormat.getInstance().format(((LightTruck) vehicle).getTowingCapacity()) + 
							" lbs.");
					System.out.println("Gross Combined Weight: " + 
							NumberFormat.getInstance().format(((LightTruck) vehicle).getGrossCombinedWeight()) + 
							" lbs.");
					System.out.println("Truck Weight: " + 
							NumberFormat.getInstance().format(((LightTruck) vehicle).getTruckWeight()) + 
							" lbs.");
					if (((LightTruck) vehicle).isIs4wd()) {
						System.out.println("4WD: Yes" );
					}
					else {
						System.out.println("4WD: No" );
					}
				}
				
				// Display lease-specific information if leaseFilter is set due to Lease queue
				if (leaseFilter) {
					System.out.println("\r\nVehicle Lease Details:\r\n");
					System.out.println("Lease Term: " + vehicle.getLeaseTerm() + " Months");
					System.out.println("Maximum Mileage Per Year: " + NumberFormat.getInstance().format(vehicle.getMaxMilesPerYear()));
					System.out.println("Mileage Penalty (Per 5000 Miles): $" + String.format( "%.2f", vehicle.getMileagePenalty()));
					
					leaseFilter = false;
				}
				System.out.println("\r\nRemove client from the queue? (Y/N)");
				input = scanner.next();
				
				// Remove SaleRequest object from queue if desired
				if (input.toLowerCase().contains("y")) {
					myQueue.remove();
					System.out.println("\r\nWas the sale completed? (Y/N)");
					input = scanner.next();
					
					// Remove vehicle from inventory if desired
					if (input.toLowerCase().contains("y")) {
						VehicleInventory.removeVehicle(vehicle.getStockNumber());;
					}
					
					// Allow vehicle to be displayed in FrontDesk Menu again if it didn't sell
					else {
						vehicle.setActive(false);
					}

				}

			}

		}
		
		// Display message if no SaleRequest objects in queue
		else {
			System.out.println("No clients are in the queue. Please come back later.\r\n" + 
					"Press Enter.");
			input = scanner.nextLine();
		}
	}


}
