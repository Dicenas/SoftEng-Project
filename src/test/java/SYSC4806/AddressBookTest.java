package SYSC4806;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * This class contains unit tests for the AddressBook class
 *
 * @author Daniel Godfrey 101156147
 */
public class AddressBookTest {
    /*
    @Test
    public void testAddBuddy() {
        AddressBook addressBook = new AddressBook();
        BuddyInfo buddy1 = new BuddyInfo();
        BuddyInfo buddy2 = new BuddyInfo("Tom", "123 Navan", "613-555-5555");

        addressBook.addBuddy(buddy1); // Add Henry to addressBook
        ArrayList<BuddyInfo> buddies = addressBook.getBuddies(); // Copy all buddies in addressBook to ArrayList buddies
        assertEquals(1, buddies.size()); // Assert that 1 buddy has been added
        assertEquals("Henry", buddies.get(0).getName()); // The first buddy should be Henry

        addressBook.addBuddy(buddy1); // Add Henry to addressBook
        buddies = addressBook.getBuddies(); // Copy all buddies in addressBook to ArrayList buddies
        assertEquals(2, buddies.size()); // Assert that 2 buddies have been added
        assertEquals("Henry", buddies.get(1).getName()); // The second buddy should also be Henry

        addressBook.addBuddy(buddy2); // Add Tom to addressBook
        buddies = addressBook.getBuddies(); // Copy all buddies in addressBook to ArrayList buddies
        assertEquals(3, buddies.size()); // Assert that 3 buddies have been added
        assertEquals("Tom", buddies.get(2).getName()); // The third buddy should be Tom
    }

    @Test
    public void testRemoveBuddy() {
        AddressBook addressBook = new AddressBook();
        BuddyInfo buddy1 = new BuddyInfo();
        BuddyInfo buddy2 = new BuddyInfo("Tom", "123 Navan", "613-555-5555");

        assertEquals(0, addressBook.getBuddies().size()); // Assert that the AddressBook is initially empty
        addressBook.addBuddy(buddy1); // Add two buddies to the AddressBook
        addressBook.addBuddy(buddy2);
        assertEquals(2, addressBook.getBuddies().size()); // Assert that the AddressBook now contains 2 buddies

        BuddyInfo removedBuddy = addressBook.removeBuddy(1); // Remove the second buddy
        assertEquals(buddy2, removedBuddy); // Assert that buddy2 (Tom) is the removed buddy
        assertEquals(1, addressBook.getBuddies().size()); // Assert that the AddressBook now contains only 1 buddy

        BuddyInfo removedOutOfIndex = addressBook.removeBuddy(1); // Attempt to remove a buddy for out of bound index
        assertNull(removedOutOfIndex); // Assert that no buddy is removed
        assertEquals(1, addressBook.getBuddies().size()); // Assert that the AddressBook still contains 1 buddy
    }
    */

}