package org.fundacionjala.movies;

/** Represent a movie of type new release. */
public class NewMovie extends Movie {

    /**
     * Parameterized constructor.
     * @param newTitle movie title.
     */
    public NewMovie(final String newTitle) {
        super(newTitle);
    }

    @Override
    public double getPrice(final int daysRented) {
        final double factor = 3;
        return daysRented * factor;
    }

    @Override
    public boolean hasExtraPoint(final int daysRented) {
        return daysRented > 1;
    }
}
