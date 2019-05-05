package org.fundacionjala.coding.david.movies;

import org.fundacionjala.coding.david.movies.movie.Children;
import org.fundacionjala.coding.david.movies.movie.NewRelease;
import org.fundacionjala.coding.david.movies.movie.Regular;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Test for {@link Rental}.
 */
public class RentalTest {

    /**
     * Regular rental detail according to expected format.
     **/
    @Test
    public void testOrderRegularDetail() {
        final Rental rental = new Rental(new Regular("Terminator"), 1);
        assertTrue(rental.getMovieDetail().contains(rental.getMovie().getTitle()));
        assertTrue(rental.getMovieDetail().contains("2.0"));
    }
    /**
     * New release rental detail according to expected format.
     **/
    @Test
    public void testOrderNewReleaseDetail() {
        final Rental rental = new Rental(new NewRelease("GOT"), 2);
        assertTrue(rental.getMovieDetail().contains(rental.getMovie().getTitle()));
        assertTrue(rental.getMovieDetail().contains("6.0"));
    }
    /**
     * Children rental detail according to expected format.
     **/
    @Test
    public void testOrderChildrnDetail() {
        final Rental rental = new Rental(new Children("DBZ"), 3);
        assertTrue(rental.getMovieDetail().contains(rental.getMovie().getTitle()));
        assertTrue(rental.getMovieDetail().contains("1.5"));
    }

    /**
     * Days rented according to regular rental specification.
     **/
    @Test
    public void testGetRegularRentedDays() {
        final Rental rental = new Rental(new Regular("Terminator"), 1);
        assertEquals(1, rental.getDaysRented());
    }
    /**
     * Days rented according to new release rental specification.
     **/
    @Test
    public void testGetNewRealeaseRentedDays() {
        final int sevenDays = 7;
        final Rental rental = new Rental(new NewRelease("GOT"), sevenDays);
        assertEquals(sevenDays, rental.getDaysRented());
    }
    /**
     * Days rented according to children rental specification.
     **/
    @Test
    public void testGetChildrenRentedDays() {
        final int tenDays = 10;
        final Rental rental = new Rental(new Children("DBZ"), tenDays);
        assertEquals(tenDays, rental.getDaysRented());
    }

}
