package org.fundacionjala.coding.carlos.videostore;
/**
 * This is a class that represents childrens movie type.
 */
public class Childrens implements MovieType {
    public static final double BASE_COST = 1.5;
    public static final int REFERENCE_DAY = 3;


    /**
     * This is a constructor.
     */
    Childrens() {
    }

    @Override
    public double calculatePay(final int days) {
        double cost = BASE_COST;
        if (days > REFERENCE_DAY) {
            cost += (days - REFERENCE_DAY) * BASE_COST;
        }
            return cost;
    }
}
