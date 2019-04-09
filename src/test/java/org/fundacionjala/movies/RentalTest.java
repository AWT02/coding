package org.fundacionjala.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/** Test for {@link Rental}. **/
public class RentalTest {

    /** this test verify if rent detail is get correctly. **/
    @Test
    public void testGetDetail() {
        final Rental rental = new Rental(new RegularMovie("Terminator"), 2);
        assertTrue(rental.getDetail().contains(rental.getMovie().getTitle()));
        assertEquals("\tTerminator\t2.0\r\n", rental.getDetail());
    }

    /** this test verify if rent save rented days correctly. **/
    @Test
    public void testGetRentedDays() {
        final Rental rental = new Rental(new RegularMovie("Terminator"), 2);
        assertEquals(2, rental.getDaysRented());
    }

}
