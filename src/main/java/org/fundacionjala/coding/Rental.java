package org.fundacionjala.coding;

class Rental {

    public Movie movie;
    public int daysRented;

    public Rental(final Movie movie, final int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return this.daysRented;
    }

    public Movie getMovie() {
        return this.movie;
    }

    public double getrentCost() {
        final MovieType movieType = this.movie.createtype(this.movie.getPriceCode());
        return movieType.calculatePay(this.daysRented);
    }
}