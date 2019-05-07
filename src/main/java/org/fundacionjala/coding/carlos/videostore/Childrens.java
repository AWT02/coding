package org.fundacionjala.coding.carlos.videostore;
/**
 * This is a class that represents childrens movie type.
 */
public class Childrens extends MovieType {
    public static final int CHILDRENS = 2;
    public static final double BASE_COST = 1.5;
    public static final int REFERENCE_DAY = 3;
    private double cost = 0;


    /**
     * This is a constructor.
     */
    Childrens() {
        super(CHILDRENS, BASE_COST);
    }

    @Override
    public double calculatePay(final int days) {
        this.cost = BASE_COST;
        if (days > REFERENCE_DAY) {
            this.cost += (days - REFERENCE_DAY) * BASE_COST;
        }
            return this.cost;
    }
}
