package org.fundacionjala.coding.carlos.videostore;

/**
 * this is class that receives days rented an movie.
 */
public class Rental {

    private Movie movie;
    private int daysRented;

    /**
     *
     * @param movie instance of a movie.
     * @param daysRented number of days.
     */
    public Rental(final Movie movie, final int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     *
     * @return days rented.
     */
    public int getDaysRented() {
        return this.daysRented;
    }

    /**
     *
     * @return movie instance.
     */
    public Movie getMovie() {
        return this.movie;
    }

    /**
     *
     * @return cost of the rent.
     */
    public double getrentCost() {
        final MovieType movieType = this.movie.createtype(this.movie.getPriceCode());
        return movieType.calculatePay(this.daysRented);
    }
}
