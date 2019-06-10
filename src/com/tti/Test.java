package com.tti;

public class Test {
	
	private static Client client01 = new Client("Jordan Mor", "2034646464", "23 Reveal Rd. Hartford, CT 06333");
	private static Client client02 = new Client("Teague O'Connor", "2032226868", "23 Swift St. Hartford, CT 06332");
	private static Client client03 = new Client("John Payne", "2031119999", "23 Bard. Hartford, CT 06332");
	
	private static SaleRequest ticket01 = new SaleRequest(client01, "Finance", null);
	private static SaleRequest ticket02 = new SaleRequest(client02, "Lease", null);
	private static SaleRequest ticket03 = new SaleRequest(client02, "Full Sale", null);
	
	private static Vehicle vehicle01 = new Vehicle(20000, 22000, 2019, "Toyota", "Corolla", "Black", "36876G7dD8d9HJ", "CAR", false, 0, 0);
	private static Vehicle vehicle02 = new Vehicle(30000, 34000, 2020, "Toyota", "Camry", "Silver", "638F7dDD8d79D7", "CAR", false, 0, 0);
	private static Vehicle vehicle03 = new Vehicle(36000, 42000, 2019, "Toyota", "Prius", "Blue", "5H876G7dD8d9HJ", "CAR", true, 3, 12000);
	
	public static void executeAllTests() {
		Test.testClientObject();
		Test.testSaleRequestObject();
		Test.testVehicleObject();
	}

	public static void testClientObject() {
		System.out.println("Test if each client object has a unique id and a full name:");
		System.out.println("client01 ID: " + client01.getId() + " Name: " + client01.getFullName());
		System.out.println("client02 ID: " + client02.getId() + " Name: " + client02.getFullName());
		System.out.println("client03 ID: " + client03.getId() + " Name: " + client03.getFullName());
	}
	
	public static void testSaleRequestObject() {
		System.out.println("Test if each sale request object has a unique id and a type of sale:");
		System.out.println("ticket01 ID: " + ticket01.getTicketID() + " Type of Sale: " + ticket01.getTypeOfSale());
		System.out.println("ticket02 ID: " + ticket02.getTicketID() + " Type of Sale: " + ticket02.getTypeOfSale());
		System.out.println("ticket02 ID: " + ticket03.getTicketID() + " Type of Sale: " + ticket03.getTypeOfSale());
	}
	
	public static void testVehicleObject() {
		System.out.println("Test if each vehicle object has a unique id, stock number and a model name:");
		System.out.println("Vehicle ID: " + vehicle01.getID() + " Stock Number: " + vehicle01.getStockNumber() + " Model: " + vehicle01.getModel());
		System.out.println("Vehicle ID: " + vehicle02.getID() + " Stock Number: " + vehicle02.getStockNumber() + " Model: " + vehicle02.getModel());
		System.out.println("Vehicle ID: " + vehicle03.getID() + " Stock Number: " + vehicle03.getStockNumber() + " Model: " + vehicle03.getModel());
	}
}
