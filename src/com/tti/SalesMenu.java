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
		
		System.out.println("Loading " + myName + " Rep Menu...\n\n");
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

//Sample menu output:
//Would you like to view the next client? (Y/N) Y
//
//Client Information:
//Name: Mamadou Wann
//Phone Number: (555)867-5309
//Address: 20 Church St, Hartford, CT
//
//Vehicle:
//Stock Number: 4
//Year: 2019
//Make: Infiniti
//Model: QX80
//Color: Blue
//Retail Price: $62,590
//Wholesale Cost: $55,000
//Towing Capacity: 8500 lbs.
//Gross Combined Weight: 15000 lbs.
//Truck Weight: 7385 lbs.
//4WD: Yes
//
//Remove client from the queue? (Y/N) Y
//
//Was the sale completed? (Y/N)