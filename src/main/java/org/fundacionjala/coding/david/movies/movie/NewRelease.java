package org.fundacionjala.coding.david.movies.movie;

import org.fundacionjala.coding.david.movies.Movie;

/**
 * New release movie type.
 */
public class NewRelease extends Movie {
    private int points = 1;

    /**
     * Default constructor.
     * @param newTitle String
     */
    public NewRelease(final String newTitle) {
        super(newTitle);
    }

    /**
     * (@inheritDoc).
     * @param daysRented int
     * @return double
     */
     public double getAmount(final int daysRented) {
        final double moviePrice = 3.0;
        return moviePrice * daysRented;
    }

    /**
     * (@inheritDoc).
     * @param daysRented int
     * @return boolean
     */
    public boolean isIncludedOnPromo(final int daysRented) {
        return daysRented > 1;
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
