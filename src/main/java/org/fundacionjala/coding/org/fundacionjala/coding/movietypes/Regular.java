package org.fundacionjala.coding.org.fundacionjala.coding.movietypes;
/**
 * @author Carlos Richter
 */
public class Regular extends MovieType {
    /**
     * this IS REGULAR PRICE CODE.
     */
    private static final int REGULAR = 0;
    /**
     * this base cost for one day rent.
     */
    private static final double BASE_COST = 2;
    /**
     * this base FOR CALCULATE.
     */
    private static final double BASEDAYS = 2;
    /**
     * this is a sum acumulator.
     */
    private double cost = 0;
    /**
     * this is a constructor.
     */
    public Regular() {
        super(REGULAR, BASE_COST);
    }
    /**
     * this is an implementation of an abstract method.
     */
    @Override
    public double calculatePay(final int days) {
        this.cost = BASE_COST;
        if (days > BASEDAYS) {
            this.cost += (days - BASEDAYS) * BASE_COST;
        }
        return this.cost;
    }
}
