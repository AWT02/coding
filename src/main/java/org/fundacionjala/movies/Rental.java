package org.fundacionjala.movies;

/**
 * This class represent a rent of a movie.
 * @author carledriss
 */
public class Rental {
    /** Movie rented. **/
    private final Movie movie;
    /** Days rented. **/
    private final int daysRented;

    /**
     * Parameterized constructor.
     * @param newMovie      Movie to rent.
     * @param newDaysRented number of days rented.
     */
    public Rental(final Movie newMovie, final int newDaysRented) {
        this.movie = newMovie;
        this.daysRented = newDaysRented;
    }

    /**
     * Get days rented.
     * @return number of days rented.
     **/
    public int getDaysRented() {
        return this.daysRented;
    }

    /**
     * Get movie rented.
     * @return movie rented.
     **/
    public Movie getMovie() {
        return this.movie;
    }
}
