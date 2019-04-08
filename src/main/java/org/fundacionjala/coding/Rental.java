package org.fundacionjala.coding;
import org.fundacionjala.coding.org.fundacionjala.coding.movietypes.MovieType;

/**
 * @author carlangas.
 */
class Rental {
    /**
     * movie carlangas.
     */
    private Movie movie;
    /**
     * days that the movie will be rented.
     */
    private int daysRented;

    /**
     * This is a constructor.
     * @param movie type
     * @param daysRented type
     */
    Rental(/*hola*/ final Movie movie, /*hola*/ final int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     *
     * @return days rented
     */
    public int getDaysRented() {
        return this.daysRented;
    }

    /**
     *
     * @return movie object
     */
    public Movie getMovie() {
        return this.movie;
    }

    /**
     *
     * @return the calculation considering days rented and base cost, also
     * the price code
     */
    public double getrentCost() {
        final MovieType movieType = this.movie.
                createtype(this.movie.getPriceCode());
        return movieType.calculatePay(this.daysRented);
    }
}
