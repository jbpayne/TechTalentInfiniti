package com.tti;

import java.text.NumberFormat;
import java.util.Queue;
import java.util.Scanner;

public class SalesMenu {

	static Scanner scanner = new Scanner(System.in);

	static void load(int selection) {
		SaleRequest ticket;
		Client client;
		Vehicle vehicle;
		Queue<Object> myQueue = null;
		String myName = null;
		String input = null;
		boolean leaseFilter = false;

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
		if(!myQueue.isEmpty()) {
			System.out.println("Would you like to view the next client? (Y/N)");
			input = scanner.next();
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
				if (vehicle.getVehicleType() == "LightTruck") {
					System.out.println("Towing Capacity: " + " lbs.");
					System.out.println("Gross Combined Weight: " + " lbs.");
					System.out.println("Truck Weight: " + " lbs.");
					System.out.println("4WD: " + " lbs.");
				}
				if (leaseFilter) {
					System.out.println("\r\nVehicle Lease Details:\r\n");
					System.out.println("Lease Term: " + vehicle.getLeaseTerm() + " Months");
					System.out.println("Maximum Mileage Per Year: " + NumberFormat.getInstance().format(vehicle.getMaxMilesPerYear()));
					System.out.println("Mileage Penalty (Per 5000 Miles): $" + String.format( "%.2f", vehicle.getMileagePenalty()));
					
					leaseFilter = false;
				}
				System.out.println("Remove client from the queue? (Y/N)");
				input = scanner.next();
				if (input.toLowerCase().contains("y")) {
					myQueue.remove();
					System.out.println("Was the sale completed? (Y/N)");
					input = scanner.next();
					if (input.toLowerCase().contains("y")) {
						VehicleInventory.removeVehicle(vehicle.getStockNumber());;
					}
					else {
						vehicle.setActive(false);
					}

				}

			}

		}
		
		else {
			System.out.println("No clients are in the queue. Please come back later.\r\n" + 
					"Press Enter.");
			input = scanner.nextLine();
		}
	}


}
