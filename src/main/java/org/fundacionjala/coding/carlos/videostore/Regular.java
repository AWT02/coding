package org.fundacionjala.coding.carlos.videostore;

/**
 *  this class represents a regular movie type.
 */
public class Regular extends MovieType {
    private static final int REGULAR = 0;
    private static final double BASE_COST = 2;
    private static final double FACTOR = 1;
    private double cost = 0;


    /**
     * This is a constructor.
     */
    Regular() {
        super(REGULAR, BASE_COST);
    }

    @Override
    public double calculatePay(final int days) {
        this.cost = BASE_COST;
        if (days > 2) {
            this.cost += (days - 2) * FACTOR;
        }
        return this.cost;
    }
}
