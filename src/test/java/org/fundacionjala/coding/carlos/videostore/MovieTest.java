package org.fundacionjala.coding.carlos.videostore;

import org.fundacionjala.coding.carlos.videostore.Movie;
import org.fundacionjala.coding.carlos.videostore.MovieType;
import org.fundacionjala.coding.carlos.videostore.Rental;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MovieTest {
    /**
     *
     */
    @Test
    public void costOneRental() {
        Rental rentalNewRelease= new Rental(new Movie("The Revenant", 1), 2);
        double expected = rentalNewRelease.getrentCost();
        double actual= 6.0;
        assertTrue(actual==expected);
        Rental rentalRegular= new Rental(new Movie("Termnator", 0), 2);
        double expected2 = rentalRegular.getrentCost();
        double actual2= 2.0;
        assertTrue(actual2==expected2);
        Rental rentalChildren= new Rental(new Movie("Dumbo", 2), 5);
        double expected3 = rentalChildren.getrentCost();
        double actual3= 4.5;
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
        customer.addRental(new Rental(new Movie("dumbo", 2), 5));
        assertEquals(3,customer.getOrderList().size());
    }

}