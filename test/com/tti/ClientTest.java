package com.tti;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * jUnit tests for Client.java
 */

public class ClientTest {
	
	private Client client1;
	private Client client2;
	private Client client3;
	
	@BeforeEach
	public void setup() {
		client1 = new Client("Jordan Mor", "2034646464", "23 Reveal Rd. Hartford, CT 06103");
		client2 = new Client("Teague O'Connor", "2032226868", "23 Swift St. Hartford, CT 06103");
		client3 = new Client("John Payne", "2031119999", "23 Bard Ave. Hartford, CT 06103");
	}
	
    // Test whether each new instance of the Client class has a unique, sequential id
    @Test
    public void myATest() {
        assertEquals(1, client1.getId());
        assertEquals(2, client2.getId());
        assertEquals(3, client3.getId());
    }
    
    // Test whether each instance of the Client class has a phone number
    @Test
    public void myBTest() {
    	assertTrue(client1.getPhoneNumber().length() > 0);
    	assertTrue(client2.getPhoneNumber().length() > 0);
    	assertTrue(client3.getPhoneNumber().length() > 0);
    }
}
