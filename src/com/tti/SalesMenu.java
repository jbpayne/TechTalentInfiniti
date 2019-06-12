package com.tti;

import java.util.Queue;

public class SalesMenu {

	static void load(int selection) {
		SaleRequest ticket;
		Client client;
		Vehicle vehicle;
		Queue<Object> myQueue = null;
		String myName = null;
		
		switch (selection) {
		case 2: myQueue = Queues.Finance;
		myName = "Finance";
			break;
		case 3: myQueue = Queues.Lease;
		myName = "Lease";
			break;
		case 4: myQueue = Queues.FullSale;
		myName = "Full Sale";
			break;
		}
		
		System.out.println("Loading " + myName + " Rep Menu\n");
		if(!myQueue.isEmpty()) {
			do {
				ticket = (SaleRequest) myQueue.poll();
				client = ticket.getClient();
				vehicle = ticket.getVehicle();
				System.out.println("This is client #" + client.getId());
				System.out.println("Client info:\nName: " + client.getFullName() + "\nPhone Number: " + client.getPhoneNumber() + "\nAddress: " + client.getAddress());
				System.out.println("The type of sale is " + ticket.getTypeOfSale());
				System.out.println("The stock number of the chosen vehicle is " + vehicle.getStockNumber());
				System.out.println("Vehicle Info:\nMake: " + vehicle.getMake() + "\nModel " + vehicle.getModel() + "\n");
			} while(!myQueue.isEmpty());
		}
		System.out.println("\n");
	}

	
}
