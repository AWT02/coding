package org.fundacionjala.coding.marines.movies;

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

    /**
     * If rental is for new movie and more than 1 day, have extra point.
     * @return boolean
     */
    public boolean hasExtraPoint() {
        return this.movie.hasExtraPoint(this.daysRented);
    }

    /**
     * Movie detail for report rent.
     * @return string
     **/
    public String getDetail() {
        return this.movie.getDetail(this.daysRented);
    }

    /**
     * Get rented price for a movie according type and days rented.
     * @return double.
     */
    public double getPrice() {
        return this.movie.getPrice(this.daysRented);
    }
}
