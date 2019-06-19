package com.tti;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Data Structures used to store the SaleRequest objects and return them in the same order they were stored.
 */

public class Queues {
	
	// Instantiates a new instance of the FullSale queue.
	public static Queue<Object> FullSale = new ArrayDeque<>();
	
	// Instantiates a new instance of the Finance queue.
	public static Queue<Object> Finance = new ArrayDeque<>();
	
	//Instantiate a new instance of Lease queue.
	public static Queue<Object> Lease = new ArrayDeque<>();
	
}
