package org.fundacionjala.coding.carlos.videostore;

/**
 * new release movie type.
 */
public class NewRelease extends MovieType {
    private static final int NEW_RELEASE = 1;
    private static final double BASE_COST = 3;
    private double cost = 0;

    /**
     * This is a constructor.
     */
    NewRelease() {
        super(NEW_RELEASE, BASE_COST);
    }

    @Override
    public double calculatePay(final int days) {
        this.cost += days * BASE_COST;
        return this.cost;
    }
}
