package org.fundacionjala.coding.david.movies;

import java.util.List;

public class Regular extends MovieType{
    /**
     * (@inheritDoc).
     * @param each
     * @param thisAmount
     * @param numbers
     * @return
     */
    @Override
    public Double getAmount(final Rental each, final double thisAmount, final List<Double> numbers){
        double amount = thisAmount + 2;
        if (each.getDaysRented() > 2) {
            amount += (each.getDaysRented() - 2) * numbers.get(0);
        }
        return amount;
    }
}
