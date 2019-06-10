    package com.tti;

import java.util.Scanner;

public class MenuSystem {
	
	static Scanner scanner = new Scanner(System.in);


	public static void loadInitialMenu() {
		System.out.println("Welcome to the Tech Talent Infinity Menu System!\n");
		System.out.println("1 Front Desk\n2 Finance Representative\n3 Lease Representative:\n4 Full Sale Representative\n");
		System.out.print("Please enter the number for your job role: ");
		chooseMenuOptions(scanner.nextInt());
	}
	
	public static void chooseMenuOptions(int numOption) {
		switch(numOption) {
			case 1: loadFrontDeskMenu();
			break;
			case 2: loadFinanceRepMenu();
			break;
			case 3: loadLeasingRepMenu();
			break;
			case 4: loadFullSaleRepMenu();
			break;
		}
	}
	
	private static void loadFrontDeskMenu() {
		String fullName = null;
		System.out.print("Are you ready to enter new client information? (Y/N): ");
		String answer = scanner.next();
		if(answer.equals("Y")) {
			System.out.print("Please enter the client's full name: ");
			fullName = scanner.nextLine();
			System.out.println("Name: " + fullName);
//			System.out.print("Please enter the client's phone number: ");
//			scanner.next();
//			String phoneNumber = scanner.next();
//			System.out.print("Please enter the client's street address: ");
//			scanner.next();
//			String address = scanner.next();
//			Client client = new Client(fullName, phoneNumber, address);
//			System.out.println(client.getFullName() + " is now added as a new client");
		} else {
			scanner.next();
			System.out.println("\n");
			loadInitialMenu();
		}
	}
	
	private static void loadFinanceRepMenu() {
		System.out.println("Loading Finance Rep Menu");
	}
	
	private static void loadLeasingRepMenu() {
		System.out.println("Loading Leasing Rep Menu");
	}
	
	private static void loadFullSaleRepMenu() {
		System.out.println("Loading Full Sale Rep Menu");
	}
	
}
