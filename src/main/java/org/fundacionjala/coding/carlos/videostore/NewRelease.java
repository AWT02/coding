package org.fundacionjala.coding.carlos.videostore;

/**
 * new release movie type.
 */
public class NewRelease implements MovieType {
    private static final double BASE_COST = 3;
    private double cost = 0;

    /**
     * This is a constructor.
     */
    NewRelease() {
    }

    @Override
    public double calculatePay(final int days) {
        this.cost += days * BASE_COST;
        return this.cost;
    }
}
