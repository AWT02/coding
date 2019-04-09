package org.fundacionjala.movies;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link Customer}.
 */
public class CustomerTest {

    /** For double comparations. **/
    private static final double DELTA = 1e-15;

    /** Logger. **/
    private static final Logger LOGGER =
            Logger.getLogger(CustomerTest.class.getName());

    private Customer customer;
    private Customer customer1;


    /** Default customer creation. **/
    @Before
    public void setup() {
        final int three = 3;
        this.customer = new Customer("Test");
        this.customer.addRental(new Rental(new NewMovie("The Revenant"), three));
        this.customer.addRental(new Rental(new RegularMovie("Terminator"),
                three));
        this.customer.addRental(new Rental(new ChildrenMovie("Frozzen"),
                three + 1));
        this.customer1 = new Customer("Test basicCustomer");
        this.customer1.addRental(new Rental(new NewMovie("The Revenant"), 1));
        this.customer1.addRental(new Rental(new RegularMovie("Terminator"), 1));
        this.customer1.addRental(new Rental(new ChildrenMovie("Frozzen"), 1));
        LOGGER.debug("Custommer detail: " + this.customer.getRentalDetails());
        LOGGER.debug("Custommer detail: " + this.customer1.getRentalDetails());
    }

    /** Verify rent some videos for 1 day. */
    @Test
    public void testRentalPriceFor1DayRented() {
        final double expectedTotal = 6.5;
        assertEquals(expectedTotal, this.customer1.getTotalRentPrice(), DELTA);
    }

    /** Verify rent some videos for more than 1 day. */
    @Test
    public void testRentalPriceForMoreThan1Day() {
        final double expectedTotal = 12.0;
        assertEquals(expectedTotal, this.customer.getTotalRentPrice(), DELTA);
    }

    /** Verify rent amount videos for 1 day rented. */
    @Test
    public void testAmountOfRentalsFor1DayRented() {
        final int three = 3;
        assertEquals(this.customer1.amountOfRentalMovies(), three);
    }

    /** Verify rent amount videos for more than 1 day rented. */
    @Test
    public void testAmountOfRentalsForMoreThan1DayRented() {
        final int three = 3;
        assertEquals(this.customer.amountOfRentalMovies(), three);
    }

    /** Verify frequent points for 1 day rented. **/
    @Test
    public void testFrequentPointsFor1dayRented() {
        final int three = 3;
        assertEquals(three, this.customer1.getFrequentRenterPoints());
    }

    /** Verify frequent points for more than 1 day rented. **/
    @Test
    public void testFrequentPointsForMoreThan1Day() {
        final int three = 3;
        assertEquals(three + 1, this.customer.getFrequentRenterPoints());
    }

    /** Verify rent detail. **/
    @Test
    public void testDetail() {
        assertEquals("Rental Record for Test\n\tThe Revenant\t9.0\n\tTerminator"
                        .concat("\t1.5\n\tFrozzen\t1.5\nAmount owed is 12.0")
                        .concat("\nYou earned 4 frequent renter points"),
                this.customer.getRentalDetails());
        assertEquals("Rental Record for Test basicCustomer\n\tThe Revenant\t"
                        .concat("3.0\n\tTerminator\t2.0\n\tFrozzen\t1.5\n")
                        .concat("Amount owed is 6.5\n")
                        .concat("You earned 3 frequent renter points"),
                this.customer1.getRentalDetails());
    }
}
