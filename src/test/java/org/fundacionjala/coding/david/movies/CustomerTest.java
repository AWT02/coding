package org.fundacionjala.coding.david.movies;

import org.fundacionjala.coding.david.movies.movie.Children;
import org.fundacionjala.coding.david.movies.movie.NewRelease;
import org.fundacionjala.coding.david.movies.movie.Regular;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Test for {@link Customer}.
 */
public class CustomerTest {

    /**
     * Param for double comparison.
     */
    private static final double DELTA = 1e-15;

    private Customer favoriteCustomer;
    private Customer regularCustomer;


    /**
     * Default customer order creation.
     */
    @Before
    public void randomOrders() {

        this.favoriteCustomer = new Customer("Favorite customer");
        this.favoriteCustomer.addRental(new Rental(new NewRelease("GOT"), 3));
        this.favoriteCustomer.addRental(new Rental(new Regular("Terminator"), 3));
        this.favoriteCustomer.addRental(new Rental(new Children("DBZ"), 4));

        this.regularCustomer = new Customer("Regular customer");
        this.regularCustomer.addRental(new Rental(new NewRelease("GOT"), 1));
        this.regularCustomer.addRental(new Rental(new Regular("Terminator"), 1));
        this.regularCustomer.addRental(new Rental(new Children("DBZ"), 1));
    }

    /**
     * Check rental of regular customer for 1 day rent.
     */
    @Test
    public void testRentalPriceForRegularCustomer() {
        final double totalBillExpected = 6.5;
        assertEquals(totalBillExpected, this.regularCustomer.getTotalOrderBill(), DELTA);
    }

    /**
     * Check rental of favorite customer for more days.
     */
    @Test
    public void testRentalPriceForFavoriteCustomer() {
        final double totalBillExpected = 12.0;
        assertEquals(totalBillExpected, this.favoriteCustomer.getTotalOrderBill(), DELTA);
    }

    /**
     * Check number of order items for regular customer.
     */
    @Test
    public void testAmountOfRentalsFor1DayRented() {
        final int three = 3;
        assertEquals(this.regularCustomer.numberOfOrders(), three);
    }

    /**
     * Check number of order items for favorite customer.
     */
    @Test
    public void testAmountOfRentalsForMoreThan1DayRented() {
        final int three = 3;
        assertEquals(this.favoriteCustomer.numberOfOrders(), three);
    }

    /**
     * Check customer points on a regular customer.
     */
    @Test
    public void testFrequentPointsForRegularCustomer() {
        final int pointsExpected = 3;
        assertEquals(pointsExpected, this.regularCustomer.getFrecuentCustomerPoints());
    }

    /**
     * Check customer points on a favorite customer.
     **/
    @Test
    public void testFrequentPointsForFavoriteCustomer() {
        final int pointsExpected = 4;
        assertEquals(pointsExpected, this.favoriteCustomer.getFrecuentCustomerPoints());
    }

    /**
     * Validate regular customer order detail.
     */
    @Test
    public void testDetailFor1DayRented() {
        assertTrue(this.regularCustomer.getOrderList()
                .contains("Rental Record for Regular customer"));
        assertTrue(this.regularCustomer.getOrderList()
                .contains("GOT\t3.0"));
        assertTrue(this.regularCustomer.getOrderList()
                .contains("Terminator\t2.0"));
        assertTrue(this.regularCustomer.getOrderList()
                .contains("DBZ\t1.5"));
        assertTrue(this.regularCustomer.getOrderList()
                .contains("Amount owed is 6.5"));
        assertTrue(this.regularCustomer.getOrderList()
                .contains("You earned 3 frequent renter points"));
    }

    /**
     * Validate favorite customer order detail.
     */
    @Test
    public void testDetailForMoreThan1DayRented() {
        assertTrue(this.favoriteCustomer.getOrderList()
                .contains("Rental Record for Favorite customer"));
        assertTrue(this.favoriteCustomer.getOrderList()
                .contains("GOT\t9.0"));
        assertTrue(this.favoriteCustomer.getOrderList()
                .contains("Terminator\t1.5"));
        assertTrue(this.favoriteCustomer.getOrderList()
                .contains("DBZ\t1.5"));
        assertTrue(this.favoriteCustomer.getOrderList()
                .contains("Amount owed is 12.0"));
        assertTrue(this.favoriteCustomer.getOrderList()
                .contains("You earned 4 frequent renter points"));
    }
}
