package org.fundacionjala.coding.org.fundacionjala.coding.movietypes;
/**
 * Simple description.
 */

public abstract class MovieType {
    /**
     * this CHILDREN PRICE CODE.
     */
    private int priceCode;
    /**
     * this base cost for one day rent.
     */
    private double baseCost;
    /**
     * this is a constructor.
     * @param code code
     * @param cost cost
     */
    MovieType(final int code, final double cost) {
        this.priceCode = code;
        this.baseCost = cost;
    }
    /**
     * @return this is an abstract method.
     * @param days asisingo
     */
    public abstract double calculatePay(int days);

}
