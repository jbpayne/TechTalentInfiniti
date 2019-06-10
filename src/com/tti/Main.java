package com.tti;

public class Main {

	public static void main(String[] args) {
		
		SaleRequestQueue FullSaleQueue = new SaleRequestQueue();
		SaleRequestQueue FinanceQueue = new SaleRequestQueue();
		SaleRequestQueue LeaseQueue = new SaleRequestQueue();
		
		Test.executeAllTests();
		
//		MenuSystem.loadInitialMenu();

	}

}
