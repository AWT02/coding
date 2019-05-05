package org.fundacionjala.coding.david.movies;

/**
 * Handle movie retail.
 */
public abstract class Movie {
    private String title;

    /**
     * Movie constructor.
     *
     * @param title movie title
     */
    public Movie(final String title) {
        this.title = title;
    }

    /**
     * Get extra points from specific movie type.
     *
     * @return int points
     */
    public abstract int getPoints();

    /**
     * Set a extra points on specific movie type.
     *
     * @param points int
     */
    public abstract void setPoints(int points);

    /**
     * Get movie title.
     *
     * @return String title
     */
    String getTitle() {
        return this.title;
    }

    /**
     * Assemble movie detail for specific movie type and days rented.
     * @param daysRented int
     * @return String
     */
    public String getDetail(final int daysRented) {
        return String.format("\t%s\t%s%n", this.title,
                String.valueOf(getAmount(daysRented)));
    }

    /**
     * Check special promo for specific movie and number of days rented condition.
     * @param daysRented int
     * @return boolean
     */
    public abstract boolean isIncludedOnPromo(int daysRented);

    /**
     * Calculate price based on number of days rented.
     * @param daysRented int
     * @return boolean
     */
    public abstract double getAmount(int daysRented);

}
