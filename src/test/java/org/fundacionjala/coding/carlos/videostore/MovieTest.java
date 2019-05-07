package org.fundacionjala.coding.carlos.videostore;

import org.fundacionjala.coding.carlos.videostore.Movie;
import org.fundacionjala.coding.carlos.videostore.MovieType;
import org.fundacionjala.coding.carlos.videostore.Rental;
import org.junit.Test;

public class MovieTest {

    @Test
    public void createType() {
        final Movie movie = new Movie("Forrest Gump", 1);
        final Rental rental = new Rental(movie, 5);
        final MovieType movieType = movie.createtype(movie.getPriceCode());
        System.out.println(movieType.calculatePay(rental.getDaysRented()));
        System.out.println(rental.getDaysRented());
    }
}