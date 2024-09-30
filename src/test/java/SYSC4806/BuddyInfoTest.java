package SYSC4806;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class contains unit tests for the BuddyInfo class
 *
 * @author Daniel Godfrey 101156147
 */
public class BuddyInfoTest {
    @Test
    public void testGetName() {
        BuddyInfo buddy1 = new BuddyInfo(); // Instantiate buddy1 with default constructor
        assertEquals("Henry", buddy1.getName()); // Assert that buddy1's name is Henry

        BuddyInfo buddy2 = new BuddyInfo("Tom", "123 Navan", "613-555-5555"); // Instantiate buddy2
        assertEquals("Tom", buddy2.getName()); // Assert that buddy2's name is Tom
    }

    @Test
    public void testGetBuddyInfo() {
        BuddyInfo buddy1 = new BuddyInfo(); // Instantiate buddy1 with default constructor
        assertEquals("Name: Henry, Address: 123 Sesame Street, Phone: 248-434-5508", buddy1.getBuddyInfo()); // Assert that getBuddyInfo() returns buddy1's information

        BuddyInfo buddy2 = new BuddyInfo("Cristy", "321 Bronson", "416-555-5555"); // Instantiate buddy2
        assertEquals("Name: Cristy, Address: 321 Bronson, Phone: 416-555-5555", buddy2.getBuddyInfo()); // Assert that getBuddyInfo() returns buddy2's information
    }
}