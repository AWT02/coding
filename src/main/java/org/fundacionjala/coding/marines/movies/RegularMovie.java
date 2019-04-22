package org.fundacionjala.coding.marines.movies;

/** Represent a movie of type regular. */
public class RegularMovie extends Movie {

    /**
     * Parameterized constructor.
     * @param newTitle movie title.
     */
    public RegularMovie(final String newTitle) {
        super(newTitle);
    }

    @Override
    public double getPrice(final int daysRented) {
        final double factor = 1.5;
        return daysRented > 2 ? ((daysRented - 2) * factor) : 2;
    }

    @Override
    public boolean hasExtraPoint(final int daysRented) {
        return false;
    }
}
