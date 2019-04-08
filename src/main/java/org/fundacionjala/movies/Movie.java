package org.fundacionjala.movies;

/**
 * This class represent a movie.
 * @author carledriss
 */
public abstract class Movie {
    /** Movie title. **/
    protected String title;

    /** Price Code. **/
    protected PriceCode priceCode;

    /**
     * Parameterized constructor.
     * @param newTitle     movie title.
     * @param newPriceCode movie price code.
     */
    public Movie(final String newTitle, final PriceCode newPriceCode) {
        this.title = newTitle;
        this.priceCode = newPriceCode;
    }

    /**
     * Get price code.
     * @return price code.
     */
    public PriceCode getPriceCode() {
        return this.priceCode;
    }

    /**
     * Get movie title.
     * @return title.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Movie detail for report rent.
     * @param daysRented days rented.
     * @return string
     **/
    public String getDetail(final int daysRented) {
        return "\t" + this.title + "\t" + getPrice(daysRented) + "\n";
    }

    /**
     * Get price if the movie is rented x days.
     * @param daysRented int amount of days.
     * @return price double
     */
    public abstract double getPrice(int daysRented);
}
