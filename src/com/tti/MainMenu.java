package com.tti;

import java.util.Scanner;

public class MainMenu {

	static Scanner scanner = new Scanner(System.in);

	// Loads the main menu
	public static void load() {
	
		System.out.println("Welcome to the Tech Talent Infinity Menu System!\n");
		System.out.println(
				"1 Front Desk\n2 Finance Representative\n3 Lease Representative:\n4 Full Sale Representative\n");
		System.out.print("Please enter the number for your job role: ");
		
		// If the user input is not an integer or does not contain a number between 1 and 4 (inclusive),
		// the user is asked to enter a valid menu option until the input is valid
		while(!scanner.hasNextInt() || !scanner.hasNext("[1-4]")) {
			scanner.next();
			System.out.print("\nPlease enter a valid menu option: ");
		}
		
		chooseMenuOptions(scanner.nextInt());
		
	}

	// Method takes a user validated input to load the corresponding menu
	private static void chooseMenuOptions(int numOption) {
		switch (numOption) {
		case 1:
			FrontDeskMenu.load(true); // Front Desk menu loaded
			break;
		case 2:
			SalesMenu.load(2); // Finance menu loaded
			break;
		case 3:
			SalesMenu.load(3); // Lease menu loaded
			break;
		case 4:
			SalesMenu.load(4); // Full Sale menu loaded
			break;
		}
	}

}
