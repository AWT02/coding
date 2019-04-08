package org.fundacionjala.movies;

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

    /** Verify rent some videos. */
    @Test
    public void testRentalPrice() {
        final int three = 3;
        final double expectedTotal0 = 12.0;
        final double expectedTotal1 = 6.5;
        assertEquals(this.customer.amountOfRentalMovies(), three);
        assertEquals(this.customer1.amountOfRentalMovies(), three);
        assertEquals(expectedTotal0, this.customer.getTotalRentPrice(), DELTA);
        assertEquals(expectedTotal1, this.customer1.getTotalRentPrice(), DELTA);
    }

    /** Verify frequent points. **/
    @Test
    public void testFrequentPoints() {
        final int three = 3;
        assertEquals(three, this.customer1.getFrequentRenterPoints());
        assertEquals(three + 1, this.customer.getFrequentRenterPoints());
    }

    /** Verify rent detail. **/
    @Test
    public void testDetail() {
        assertEquals("Rental Record for Test\n\tThe Revenant\t9.0\n"
                        + "\tTerminator\t1.5\n\tFrozzen\t1.5\nAmount owed is "
                        + "12.0\nYou earned 4 frequent renter points",
                this.customer.getRentalDetails());
        assertEquals("Rental Record for Test basicCustomer\n\tThe Revenant\t"
                        + "3.0\n\tTerminator\t2.0\n\tFrozzen\t1.5\n"
                        + "Amount owed is 6.5\n"
                        + "You earned 3 frequent renter points",
                this.customer1.getRentalDetails());
    }
}