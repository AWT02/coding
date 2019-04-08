package org.fundacionjala.coding.org.fundacionjala.coding.movietypes;
/**
 * @author Carlos Richter
 */
public class Childrens extends MovieType {
    /**
     * this CHILDREN PRICE CODE.
     */
    private static final int CHILDRENS = 2;
    /**
     * this base cost for one day rent.
     */
    private static final double BASE_COST = 1.5;
    /**
     * this base FOR CALCULATE.
     */
    private static final double BASEDAYS = 3;

    /**
     * this is a sum acumulator.
     */
    private double cost = 0;

    /**
     * this is a constructor.
     */
    public Childrens() {
        super(CHILDRENS, BASE_COST);
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
