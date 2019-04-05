package org.fundacionjala.movies;

/**
 * This class represent a movie.
 *
 * @author carledriss
 */
public class Movie {
    /**
     * Movie title.
     **/
    private final String title;

    /**
     * Price Code.
     **/
    private PriceCode priceCode;

    /**
     * Parameterized constructor.
     *
     * @param newTitle     movie title.
     * @param newPriceCode movie price code.
     */
    public Movie(final String newTitle, final PriceCode newPriceCode) {
        this.title = newTitle;
        this.priceCode = newPriceCode;
    }

    /**
     * Get price code.
     *
     * @return price code.
     */
    public PriceCode getPriceCode() {
        return this.priceCode;
    }

    /**
     * Set price code.
     *
     * @param arg new price code.
     */
    public void setPriceCode(final PriceCode arg) {
        this.priceCode = arg;
    }

    /**
     * Get movie title.
     *
     * @return title.
     */
    public String getTitle() {
        return this.title;
    }
}
