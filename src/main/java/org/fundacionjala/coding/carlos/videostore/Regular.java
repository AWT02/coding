package org.fundacionjala.coding.carlos.videostore;

public class Regular extends MovieType {
    public static final int REGULAR = 0;
    public static final double BASE_COST = 2;
    public double cost = 0;

    Regular() {
        super(REGULAR, BASE_COST);
    }

    @Override
    public double calculatePay(final int days) {
        this.cost = BASE_COST;
        if (days > 2)
            this.cost += (days - 2) * 1.5;
        return this.cost;
    }
}
