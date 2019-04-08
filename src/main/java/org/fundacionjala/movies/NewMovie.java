package org.fundacionjala.movies;

/** Represent a movie of type new release. */
public class NewMovie extends Movie {

    /**
     * Parameterized constructor.
     * @param newTitle movie title.
     */
    public NewMovie(final String newTitle) {
        super(newTitle, PriceCode.NEW_RELEASE);
    }

    @Override
    public double getPrice(final int daysRented) {
        return daysRented * this.priceCode.getFactor();
    }
}
