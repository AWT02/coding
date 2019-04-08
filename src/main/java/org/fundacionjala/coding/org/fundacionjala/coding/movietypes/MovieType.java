package org.fundacionjala.coding.org.fundacionjala.coding.movietypes;
/**
 * @author Carlos Richter
 */

public abstract class MovieType {
    /**
     * this CHILDREN PRICE CODE.
     */
    private int PRICE_CODE;
    /**
     * this base cost for one day rent.
     */
    private double BASE_COST;
    /**
     * this is a constructor.
     * @param code
     * @param cost
     */
    MovieType(final int code, final double cost) {
        this.PRICE_CODE = code;
        this.BASE_COST = cost;
    }
    /**
     * @return this is an abstract method.
     */
    public abstract double calculatePay(int days);

}
