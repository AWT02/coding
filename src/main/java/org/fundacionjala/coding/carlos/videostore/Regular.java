package org.fundacionjala.coding.carlos.videostore;

/**
 *  this class represents a regular movie type.
 */
public class Regular implements MovieType {
    private static final double BASE_COST = 2;
    private static final double FACTOR = 1;


    /**
     * This is a constructor.
     */
    Regular() {
    }

    @Override
    public double calculatePay(final int days) {
        double cost = BASE_COST;
        if (days > 2) {
            cost += (days - 2) * FACTOR;
        }
        return cost;
    }
}
