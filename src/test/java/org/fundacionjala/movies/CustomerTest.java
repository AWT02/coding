package org.fundacionjala.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link Customer}.
 */
public class CustomerTest {
    /**
     * Verify rent some videos.
     */
    @Test
    public void testRental() {
        final Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Movie("The Revenant", PriceCode.NEW_RELEASE), 2));
        customer.addRental(new Rental(new Movie("Terminator", PriceCode.REGULAR), 2));
        System.out.println(customer.statement());
        assertEquals(customer.amountOfRentalMovies(), 2);
    }
}
