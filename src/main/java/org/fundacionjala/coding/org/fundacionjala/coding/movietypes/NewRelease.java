package org.fundacionjala.coding.org.fundacionjala.coding.movietypes;
/**
 * @author Carlos Richter
 */

public class NewRelease extends MovieType {
    /**
     * this CHILDREN NEW RELEASE.
     */
    private static final int NEW_RELEASE = 1;
    /**
     * this base cost for one day rent.
     */
    private static final double BASE_COST = 3;

    /**
     * this is a sum acumulator.
     */
    private double cost = 0;
    /**
     * this is a constructor.
     */
    public NewRelease() {
        super(NEW_RELEASE, BASE_COST);
    }
    /**
     * this is an implementation of an abstract method.
     */
    @Override
    public double calculatePay(final int days) {
        this.cost += days * BASE_COST;
        return this.cost;
    }
}
