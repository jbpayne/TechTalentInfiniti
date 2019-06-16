package com.tti;

import java.util.Scanner;

public class FrontDeskMenu {
	
	static Scanner scanner = new Scanner(System.in);
	
	// Loads front desk menu and collects user input to create a sales request ticket
	// and stores ticket in the queue corresponding to the client's sale's preference
	public static void load(boolean firstTimeLoading) {
		String response = null;
		String fullName = null;
		String phoneNumber = null;
		String address = null;
		Vehicle vehicle;
		int salesPreferenceNumber;

		if (firstTimeLoading) {
			System.out.print("Are you ready to enter new client information? (Y/N): ");
			response = scanner.next().toLowerCase();;
		}
		
		// Collect user input for sale request ticket creation
		if (!firstTimeLoading || response.contains("y") || response.contains("yes")) {
			// Collect full name input
			System.out.print("\nPlease enter the client's full name: ");
			do {
				fullName = scanner.nextLine().trim();
			} while (fullName.isEmpty());

			// Collect phone number input
			System.out.print("Please enter the client's phone number: ");
			phoneNumber = scanner.next();

			// Collect address input
			System.out.print("Please enter the client's street address: ");
			do {
				address = scanner.nextLine().trim();
			} while (address.isEmpty());

			// Create client instance
			Client client = new Client(fullName, phoneNumber, address);

			// Run sale preference options menu
			loadSalePreferenceMenu(true);
			
			// If the user input is not an integer or does not contain the number 1, 2 or 3
			// the loadSalePreferenceMenu function is reloaded
			while(!scanner.hasNextInt() || !scanner.hasNext("[123]")) {
				scanner.nextLine();
				loadSalePreferenceMenu(false);
			}
			
			// Collect sale preference input
			salesPreferenceNumber = scanner.nextInt();

			// Print out current vehicle inventory
			System.out.println("\nCurrent vehicle inventory: ");
			VehicleInventory.printInventory();
			
			System.out.print("\nPlease enter the client's chosen vehicle stock number: ");
			vehicle = VehicleInventory.getVehicleInventory().get(scanner.nextInt());
			vehicle.setActive(true);
			
			switch(salesPreferenceNumber) {
			// Create a sale request ticket and store in the Finance queue
			case 1: Queues.Finance.add(new SaleRequest(client, "Finance", vehicle));
					break;
			// Create a sale request ticket and store in the Lease queue
			case 2: Queues.Lease.add(new SaleRequest(client, "Lease", vehicle));
					break;
			// Create a sale request ticket and store in the Full Sale queue
			case 3: Queues.FullSale.add(new SaleRequest(client, "Full Sale", vehicle));
					break;
			}

			System.out.print("\nWould you like to add another client? (Y/N): ");
			response = scanner.next().toLowerCase();
			
			if (response.contains("y") || response.contains("yes")) {
				load(false);
			}
		// If user does not wish to enter the front desk menu, go back to main menu	
		} else if(response.contains("n") || response.contains("no")){
			System.out.println("\n");
		// If user does not enter a valid entry, print message below and reload the frontDeskMenu function 
		} else {
			System.out.println("That was not a valid entry");
			load(true);
		}
	}
	
	// Loads the sales preference menu
	// First time this function loads, the client is asked for their sale's preference
	// With every repeated invalid user entry, the user is reminded to enter a valid sale's preference
	private static void loadSalePreferenceMenu(boolean firstPass) {
		
			if(firstPass) {
				System.out.println("\nPlease enter the client's sale's preference:\n");
			} else {
				System.out.println("\nPlease enter a valid sale's preference option:\n");
			}
			
			System.out.println("1 Finance\n2 Lease\n3 Full Sale");
			System.out.print("\nEnter number: ");
	}
}
