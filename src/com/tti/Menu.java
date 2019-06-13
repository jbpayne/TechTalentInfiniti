package com.tti;

import java.util.Scanner;

public class Menu {

	static Scanner scanner = new Scanner(System.in);

	public static void loadMainMenu() {
		System.out.println("Welcome to the Tech Talent Infinity Menu System!\n");
		System.out.println(
				"1 Front Desk\n2 Finance Representative\n3 Lease Representative:\n4 Full Sale Representative\n");
		System.out.print("Please enter the number for your job role: ");
		
		try {
			chooseMenuOptions(scanner.nextInt()); // function only accepts numbers from 1 - 4 as valid input
		} catch(Exception e) { // handles any non-integer, invalid user input
			System.out.println("\nPlease enter a valid menu option.\n");
			/*
			 *  When nextInt() throws an exception, the Scanner object tries to use the same string 
			 *  on the next call and will create an infinite loop, since the loadMainMenu() function 
			 *  is contained within a while loop in main.java.
			 *  Calling nextLine() within the catch will discard the illegal line and prevent the infinite loop.
			 */
			scanner.nextLine(); 
		}
	}

	private static void chooseMenuOptions(int numOption) {
		switch (numOption) {
		case 1:
			loadFrontDeskMenu(true);
			break;
		case 2:
			SalesMenu.load(2);
			break;
		case 3:
			SalesMenu.load(3);
			break;
		case 4:
			SalesMenu.load(4);
			break;
		default : // Number entries outside of 1 - 4 are invalid.
			// Any number entries outside of 1 - 4 will print out the message below. 
			// Then, the main menu will reload.
			System.out.println("\nPlease enter a valid menu option.\n");
		}
	}

	private static void loadFrontDeskMenu(boolean firstTimeLoading) {
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
				loadFrontDeskMenu(false);
			} else {
				loadMainMenu();
			}
		}

		else {
			System.out.println("\n");
			loadMainMenu();
		}
	}

}
