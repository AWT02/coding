package org.fundacionjala.movies;

/** Represent a movie of type regular. */
public class RegularMovie extends Movie {

    /**
     * Parameterized constructor.
     * @param newTitle movie title.
     */
    public RegularMovie(final String newTitle) {
        super(newTitle, PriceCode.REGULAR);
    }

    @Override
    public double getPrice(final int daysRented) {
        return daysRented > 2 ? ((daysRented - 2) * this.priceCode.getFactor())
                : 2;
    }
}
