package com.tti;

import java.util.Scanner;

public class MainMenu {

	static Scanner scanner = new Scanner(System.in);

	public static void load() {
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
			FrontDeskMenu.load(true);
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

}
