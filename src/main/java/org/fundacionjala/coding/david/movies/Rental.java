package org.fundacionjala.coding.david.movies;
/**
 * Handle rental on movies.
 */
class Rental {
    private Movie movie;
    private int daysRented;
    /**
     * Rental constructor.
     *
     * @param movie - Object movie
     * @param daysRented - Number of days to be rented
     */
    Rental(final Movie movie, final int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }
    /**
     * Get the number of days rented.
     *
     * @return int daysRented
     */
    int getDaysRented() {
        return this.daysRented;
    }
    /**
     * get movie object.
     *
     * @return Movie movie
     */
    Movie getMovie() {
        return this.movie;
    }
}
