package org.fundacionjala.coding.carlos.videostore;

/**
 * Father class.
 */
public abstract class MovieType {
    private int priceCode;
    private double baseCost;

    /**
     *
     * @param code code of the proce.
     * @param cost base cost.
     */
    MovieType(final int code, final double cost) {
        this.priceCode = code;
        this.baseCost = cost;
    }

    /**
     *
     * @param days day rented.
     * @return rental cost of a specefic movie type.
     */
    public abstract double calculatePay(int days);

}
