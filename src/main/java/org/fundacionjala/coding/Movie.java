/**
 * @author Carlos Richter.
 */
package org.fundacionjala.coding;

import org.fundacionjala.coding.org.fundacionjala.coding.movietypes.Childrens;
import org.fundacionjala.coding.org.fundacionjala.coding.movietypes.MovieType;
import org.fundacionjala.coding.org.fundacionjala.coding.movietypes.NewRelease;
import org.fundacionjala.coding.org.fundacionjala.coding.movietypes.Regular;

/**
 * @author Carlos Richter.
 */
public class Movie {
    /**
     * this base cost for one day rent.
     */
    private String title;
    /**
     * this base cost for one day rent.
     */
    private int priceCode;
    /**
     * this is a constructor.
     * @param title name of the movie
     * @param priceCode codigo del precio
     */
    public Movie(final String title, final int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }
    /**
     * this base cost for one day rent.
     * @param priceCode lo mismo que en la linea 30
     * @return its a factory that returns an instance
     */
    public MovieType createtype(final int priceCode) {
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
     * this base cost for one day rent.
     * @return pricecode
     */
    public int getPriceCode() {
        return this.priceCode;
    }
    /**
     * @return name of the movie
     */
    public String getTitle() {
        return this.title;
    }

}
