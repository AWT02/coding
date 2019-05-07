package org.fundacionjala.coding.carlos.videostore;

/**
 * @author Carlos Richter.
 */
public class Movie {

    private String title;
    private int priceCode;

    /**
     *
     * @param title of a movie.
     * @param priceCode code of the movie.
     */
    public Movie(final String title, final int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    /**
     *
     * @param priceCode price code.
     * @return an instance of MovieType.
     */
    public static MovieType createtype(final int priceCode) {
        switch (priceCode) {
            case 0:
                return new Regular();
            case 1:
                return new NewRelease();
            case 2:
                return new Childrens();
            default:
                break;
        }
        return null;
    }

    /**
     *
     * @return return de proce code.
     */
    public int getPriceCode() {
        return this.priceCode;
    }

    /**
     *
     * @return title.
     */
    public String getTitle() {
        return this.title;
    }

}
