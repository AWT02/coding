package org.fundacionjala.coding.carlos.videostore;

/**
 * Father class.
 */
public interface MovieType {

    /**
     *
     * @param days day rented.
     * @return rental cost of a specefic movie type.
     */
    double calculatePay(int days);

}
