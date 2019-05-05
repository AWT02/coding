package org.fundacionjala.coding.david.movies;

import java.util.List;

public class children extends MovieType {
    /**
     * (@inheritDoc).
     * @param each
     * @param thisAmount
     * @param numbers
     * @return
     */
    @Override
    public Double getAmount(final Rental each, final double thisAmount, final List<Double> numbers){
        double amount = thisAmount + numbers.get(0);
        if (each.getDaysRented() > numbers.get(1)) {
            amount += (each.getDaysRented() - numbers.get(1)) * numbers.get(0);
        }
        return amount;
    }
}
