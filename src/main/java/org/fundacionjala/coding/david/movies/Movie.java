package org.fundacionjala.coding.david.movies;
/**
 * Handle movie retail.
 */
class Movie {
    static final int CHILDREN = 2;
    static final int REGULAR = 0;
    static final int NEW_RELEASE = 1;
    private String title;
    private int priceCode;
    /**
     * Movie constructor.
     *
     * @param title movie title
     * @param priceCode a code to calculate price
     */
    Movie(final String title, final int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }
    /**
     * get price code.
     *
     * @return int priceCode
     */
    int getPriceCode() {
        return this.priceCode;
    }
    /**
     * Set a price code.
     *
     * @param code  to set a specific price code
     */
    void setPriceCode(final int code) {
        this.priceCode = code;
    }
    /**
     * Get movie title.
     *
     * @return String title
     */
    String getTitle() {
        return this.title;
    }
}
