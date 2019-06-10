package com.tti;

public class Test {
	
	private static Client client01 = new Client("Jordan Mor", "2034646464", "23 Reveal Rd. Hartford, CT 06333");
	private static Client client02 = new Client("Teague O'Connor", "2032226868", "23 Swift St. Hartford, CT 06332");
	private static Client client03 = new Client("John Payne", "2031119999", "23 Bard. Hartford, CT 06332");
	
	private static SaleRequest ticket01 = new SaleRequest(client01, "Finance", null);
	private static SaleRequest ticket02 = new SaleRequest(client02, "Lease", null);
	private static SaleRequest ticket03 = new SaleRequest(client02, "Full Sale", null);
	
	public static void executeAllTests() {
		Test.testClientObject();
		Test.testSaleRequestObject();
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
}
