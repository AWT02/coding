package org.fundacionjala.coding.movies;

import java.util.List;

public abstract class MovieType {

    Double getAmount(final Rental each, final double thisAmount, final List<Double> numbers){
        return thisAmount;
    }
}
