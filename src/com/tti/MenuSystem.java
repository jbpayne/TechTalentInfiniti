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
			case 1: loadFrontDeskMenuOptions();
			break;
			case 2: loadFinanceRepMenuOptions();
			break;
			case 3: loadLeasingRepMenuOptions();
			break;
			case 4: loadFullSaleRepMenuOptions();
			break;
		}
	}
	
	private static void loadFrontDeskMenuOptions() {
		System.out.println("Loading Front Desk Menu Options");
	}
	
	private static void loadFinanceRepMenuOptions() {
		System.out.println("Loading Finance Rep Menu Options");
	}
	
	private static void loadLeasingRepMenuOptions() {
		System.out.println("Loading Leasing Rep Menu Options");
	}
	
	private static void loadFullSaleRepMenuOptions() {
		System.out.println("Loading Full Sale Rep Menu Options");
	}
	
}
