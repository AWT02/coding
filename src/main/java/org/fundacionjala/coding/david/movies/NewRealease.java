package org.fundacionjala.coding.david.movies;

import java.util.List;

public class NewRealease extends MovieType {
    /**
     * (@inheritDoc).
     * @param each
     * @param thisAmount
     * @param numbers
     * @return
     */
    @Override
    public Double getAmount(final Rental each, final double thisAmount, final List<Double> numbers){
        double amount;
        amount = thisAmount + (each.getDaysRented() * numbers.get(1));
        return amount;
    }
}
