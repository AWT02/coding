package org.fundacionjala.coding.david.movies;

/**
 * Handle rental on movies.
 */
public class Rental {
    private Movie movie;
    private int daysRented;

    /**
     * Rental constructor.
     *
     * @param movie - Object movie
     * @param daysRented - Number of days to be rented
     */
    public Rental(final Movie movie, final int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * Get the number of days rented.
     *
     * @return int daysRented
     */
    public int getDaysRented() {
        return this.daysRented;
    }

    /**
     * get movie object.
     *
     * @return Movie movie
     */
    public Movie getMovie() {
        return this.movie;
    }

    /**
     * get movie detail considering number of days rented.
     *
     * @return String
     */
    public String getMovieDetail() {
        return this.movie.getDetail(this.daysRented);
    }

    /**
     * Special promo for new releases and more than 1 day rent.
     * @return boolean
     */
    public boolean isIncludedOnPromo() {
        return this.movie.isIncludedOnPromo(this.daysRented);
    }

    /**
     * Get amount to pay for the rent.
     * @return boolean
     */
    public double getAmount() {
        return this.movie.getAmount(this.daysRented);
    }
}
