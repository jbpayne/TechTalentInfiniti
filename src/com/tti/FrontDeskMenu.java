package com.tti;

import java.util.Scanner;

public class FrontDeskMenu {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void load(boolean firstTimeLoading) {
		String fullName = null;
		String phoneNumber = null;
		String address = null;
		SaleRequest ticket = null;
		String response = null;
		int vehicleStockNumber;
		Vehicle vehicle;
		int salesNumber;

		if (firstTimeLoading) {
			System.out.print("Are you ready to enter new client information? (Y/N): ");
			response = scanner.next();
		}

		if (!firstTimeLoading || response.contains("Y")) {
			// Collect full name input
			System.out.print("Please enter the client's full name: ");
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

			// Collect sales preference
			System.out.println("Please enter the client's sale's preference:\n");
			System.out.println("1 Full Sale\n2 Finance\n3 Lease");
			System.out.print("Enter number: ");
			salesNumber = scanner.nextInt();

			System.out.println("\nCurrent vehicle inventory: ");
			VehicleInventory.printInventory();
			System.out.print("\nPlease enter the client's chosen vehicle stock number: ");
			vehicleStockNumber = scanner.nextInt();

			vehicle = VehicleInventory.getVehicleInventory().get(vehicleStockNumber);
			
			switch(salesNumber) {
			case 1: ticket = new SaleRequest(client, "Full Sale", vehicle);
					Queues.FullSale.add(ticket);
					break;
			case 2: ticket = new SaleRequest(client, "Finance", vehicle);
					Queues.Finance.add(ticket);
					break;
			case 3: ticket = new SaleRequest(client, "Lease", vehicle);
					Queues.Lease.add(ticket);
					break;
			}

			System.out.print("Would you like to add another client? (Y/N): ");
			response = scanner.next();
			System.out.println("\n");
			if (response.contains("Y")) {
				load(false);
			} else {
				MainMenu.load();
			}
		}

		else {
			System.out.println("\n");
			MainMenu.load();
		}
	}
}
