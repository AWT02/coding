package org.fundacionjala.movies;

import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link Customer}.
 */
public class CustomerTest {

    /** Logger. **/
    private static final Logger logger =
            Logger.getLogger(CustomerTest.class.getName());

    /** Verify rent some videos. */
    @Test
    public void testRental() {
        final Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Movie("The Revenant", PriceCode.NEW_RELEASE), 2));
        customer.addRental(new Rental(new Movie("Terminator", PriceCode.REGULAR), 2));
        logger.info(customer.statement());
        assertEquals(customer.amountOfRentalMovies(), 2);
    }
}
