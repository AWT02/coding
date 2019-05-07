package org.fundacionjala.coding.david.movies.movie;

import org.fundacionjala.coding.david.movies.Movie;

/**
 * Children movie type.
 */
public class Children extends Movie {
    private int points = 0;
/**
 * Default constructor.
 * @param newTitle String
 */
public Children(final String newTitle) {
    super(newTitle);
}
    /**
     * (@inheritDoc).
     * @param daysRented int
     * @return double
     */
    public double getAmount(final int daysRented) {
        final double moviePrice = 1.5;
        final int nGraceDaysForInitialPrice = 3;
        return daysRented > nGraceDaysForInitialPrice
                ? ((daysRented - nGraceDaysForInitialPrice) * moviePrice)
                : moviePrice;
    }

    /**
     * (@inheritDoc).
     * @param daysRented int
     * @return boolean
     */
    public boolean isIncludedOnPromo(final int daysRented) {
        return false;
    }

    /**
     * (@inheritDoc).
     * @return int
     */
    public int getPoints() {
        return this.points;
    }

    /**
     * (@inheritDoc).
     * @param points int
     */
    public void setPoints(final int points) {
        this.points = points;
    }
}
