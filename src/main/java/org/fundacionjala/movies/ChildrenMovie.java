package org.fundacionjala.movies;

/** Represent a movie of type children. */
public class ChildrenMovie extends Movie {

    /**
     * Parameterized constructor.
     * @param newTitle movie title.
     */
    public ChildrenMovie(final String newTitle) {
        super(newTitle);
    }

    @Override
    public double getPrice(final int daysRented) {
        final int longRent = 3;
        final double factor = 1.5;
        return daysRented > longRent
                ? ((daysRented - longRent) * factor)
                : factor;
    }

    @Override
    public boolean hasExtraPoint(final int daysRented) {
        return false;
    }
}
