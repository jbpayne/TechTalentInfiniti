package com.tti;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ClientTest {

    @Test
    public void junitTestClientObject() {
    	Client client01 = new Client("Jordan Mor", "2034646464", "23 Reveal Rd. Hartford, CT 06333");
    	Client client02 = new Client("Teague O'Connor", "2032226868", "23 Swift St. Hartford, CT 06332");
    	Client client03 = new Client("John Payne", "2031119999", "23 Bard. Hartford, CT 06332");

        assertEquals(1, client01.getId());
        assertEquals(2, client02.getId());
        assertEquals(3, client03.getId());
    }

}
