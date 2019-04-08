package org.fundacionjala.movies;

/** Represent a movie of type children. */
public class ChildrenMovie extends Movie {

    /**
     * Parameterized constructor.
     * @param newTitle movie title.
     */
    public ChildrenMovie(final String newTitle) {
        super(newTitle, PriceCode.CHILDREN);
    }

    @Override
    public double getPrice(final int daysRented) {
        final int longRent = 3;
        return daysRented > longRent
                ? ((daysRented - longRent) * this.priceCode.getFactor())
                : this.priceCode.getFactor();
    }
}
