package org.fundacionjala.coding.org.fundacionjala.coding.movietypes;
/**
 * @author Carlos Richter
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
     * @param code asi nomas
     * @param cost asi nomas
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
