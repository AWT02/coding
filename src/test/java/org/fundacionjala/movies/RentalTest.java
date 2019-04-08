package org.fundacionjala.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/** Test for {@link Rental}. **/
public class RentalTest {

    /** this test verify if rent detail is get correctly. **/
    @Test
    public void testGetDetail() {
        final Rental rental = new Rental(new RegularMovie("Terminator"), 3);
        assertTrue(rental.getDetail().contains(rental.getMovie().getTitle()));
        assertEquals(3, rental.getDaysRented());
        assertEquals("\tTerminator\t1.5\n", rental.getDetail());
        assertEquals(PriceCode.REGULAR, rental.getMovie().getPriceCode());
    }
}
