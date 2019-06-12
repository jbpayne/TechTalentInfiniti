package com.tti;

import java.util.Scanner;

public class Menu {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void loadMainMenu() {
		System.out.println("Welcome to the Tech Talent Infinity Menu System!\n");
		System.out.println("1 Front Desk\n2 Finance Representative\n3 Lease Representative:\n4 Full Sale Representative\n");
		System.out.print("Please enter the number for your job role: ");
		chooseMenuOptions(scanner.nextInt());
	}
	
	private static void chooseMenuOptions(int numOption) {
		switch(numOption) {
			case 1: loadFrontDeskMenu(true);
			break;
			case 2: SalesMenu.load(Queues.Finance);
			break;
			case 3: SalesMenu.load(Queues.Lease);
			break;
			case 4: SalesMenu.load(Queues.FullSale);
			break;
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
		
		if(firstTimeLoading) {
			System.out.print("Are you ready to enter new client information? (Y/N): ");
			response = scanner.next();
		}
		
		if(!firstTimeLoading || response.contains("Y")) {
			// Collect full name input
			System.out.print("Please enter the client's full name: ");
			do {
				fullName = scanner.nextLine().trim();
			} while(fullName.isEmpty());
			
			// Collect phone number input
			System.out.print("Please enter the client's phone number: ");
			phoneNumber = scanner.next();

			// Collect address input
			System.out.print("Please enter the client's street address: ");
			do {
				address = scanner.nextLine().trim();
			} while(address.isEmpty());
			
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
			vehicle = VehicleInventory.getVehicleInventory().get(vehicleStockNumber - 1);
//			VehicleInventory.getVehicleInventory().remove(vehicleStockNumber - 1);
			
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
			if(response.contains("Y")) {
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
	
	private static void loadFinanceMenu() {
		SaleRequest ticket;
		Client client;
		Vehicle vehicle;
		
		System.out.println("Loading Finance Rep Menu\n");
		if(!Queues.Finance.isEmpty()) {
			do {
				ticket = (SaleRequest) Queues.Finance.poll();
				client = ticket.getClient();
				vehicle = ticket.getVehicle();
				System.out.println("This is client #" + client.getId());
				System.out.println("Client info:\nName: " + client.getFullName() + "\nPhone Number: " + client.getPhoneNumber() + "\nAddress: " + client.getAddress());
				System.out.println("The type of sale is " + ticket.getTypeOfSale());
				System.out.println("The stock number of the chosen vehicle is " + vehicle.getStockNumber());
				System.out.println("Vehicle Info:\nMake: " + vehicle.getMake() + "\nModel " + vehicle.getModel() + "\n");
			} while(!Queues.Finance.isEmpty());
		}
		System.out.println("\n");
	}
	
	private static void loadLeasingMenu() {
		SaleRequest ticket;
		Client client;
		Vehicle vehicle;
		
		System.out.println("Loading Leasing Rep Menu\n");
		if(!Queues.Lease.isEmpty()) {
			do {
				ticket = (SaleRequest) Queues.Lease.poll();
				client = ticket.getClient();
				vehicle = ticket.getVehicle();
				System.out.println("This is client #" + client.getId());
				System.out.println("Client info:\nName: " + client.getFullName() + "\nPhone Number: " + client.getPhoneNumber() + "\nAddress: " + client.getAddress());
				System.out.println("The type of sale is " + ticket.getTypeOfSale());
				System.out.println("The stock number of the chosen vehicle is " + vehicle.getStockNumber());
				System.out.println("Vehicle Info:\nMake: " + vehicle.getMake() + "\nModel " + vehicle.getModel() + "\n");
			} while(!Queues.Lease.isEmpty());
		}
		System.out.println("\n");
	}
	
	private static void loadFullSaleMenu() {
		SaleRequest ticket;
		Client client;
		Vehicle vehicle;
		
		System.out.println("Loading Full Sale Rep Menu\n");
		if(!Queues.FullSale.isEmpty()) {
			do {
				ticket = (SaleRequest) Queues.FullSale.poll();
				client = ticket.getClient();
				vehicle = ticket.getVehicle();
				System.out.println("This is client #" + client.getId());
				System.out.println("Client info:\nName: " + client.getFullName() + "\nPhone Number: " + client.getPhoneNumber() + "\nAddress: " + client.getAddress());
				System.out.println("The type of sale is " + ticket.getTypeOfSale());
				System.out.println("The stock number of the chosen vehicle is " + vehicle.getStockNumber());
				System.out.println("Vehicle Info:\nMake: " + vehicle.getMake() + "\nModel " + vehicle.getModel() + "\n");
			} while(!Queues.FullSale.isEmpty());
		}
		System.out.println("\n");
		
	}
}
