package com.tti;

import java.util.Queue;

public class SalesMenu {

	static void load(Queue<Object> myQueue) {
		SaleRequest ticket;
		Client client;
		Vehicle vehicle;
		
		System.out.println("Loading Finance Rep Menu\n");
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
