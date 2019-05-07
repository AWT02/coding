package org.fundacionjala.coding.carlos.videostore;

public class Childrens extends MovieType {
    public static final int CHILDRENS = 2;
    public static final double BASE_COST = 1.5;
    public double cost = 0;

    Childrens() {
        super(CHILDRENS, BASE_COST);
    }

    @Override
    public double calculatePay(final int days) {
        this.cost = BASE_COST;
        if (days > 3)
            this.cost += (days - 3) * 1.5;
        return this.cost;
    }
}
