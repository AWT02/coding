package org.fundacionjala.coding.carlos.videostore;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for the video store project refactored by carlos.
 */
public class MovieTest {
    /**
     *
     */
    @Test
    public void costOneRental() {
        Rental rentalNewRelease = new Rental(new Movie("The Revenant", 1), 2);
        double expected = rentalNewRelease.getrentCost();
        final double actual = 6.0;
        assertTrue(actual == expected);
        Rental rentalRegular = new Rental(new Movie("Termnator", 0), 2);
        double expected2 = rentalRegular.getrentCost();
        final double actual2 = 2.0;
        assertTrue(actual2 == expected2);
        final int daysRented = 5;
        Rental rentalChildren = new Rental(new Movie("Dumbo", 2), daysRented);
        double expected3 = rentalChildren.getrentCost();
        final double actual3 = 4.5;
        assertTrue(actual3 == expected3);

    }

    /**
     *
     */
    @Test
    public void customer() {
        final Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Movie("The Revenant", 1), 2));
        customer.addRental(new Rental(new Movie("Terminator", 0), 2));
        customer.addRental(new Rental(new Movie("dumbo", 2), 2));
        final int expected = 3;
        assertEquals(expected, customer.getOrderList().size());
    }

}
