package org.fundacionjala.coding.carlos.videostore;

public abstract class MovieType {
    public int PRICE_CODE;
    public double BASE_COST;

    MovieType(final int code, final double cost) {
        this.PRICE_CODE = code;
        this.BASE_COST = cost;
    }

    public abstract double calculatePay(int days);

}
