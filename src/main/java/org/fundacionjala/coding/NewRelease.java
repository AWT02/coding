package org.fundacionjala.coding;

public class NewRelease extends MovieType {
    public static final int NEW_RELEASE = 1;
    public static final double BASE_COST = 3;
    public double cost = 0;

    NewRelease() {
        super(NEW_RELEASE, BASE_COST);
    }

    @Override
    public double calculatePay(final int days) {
        this.cost += days * BASE_COST;
        return this.cost;
    }
}
