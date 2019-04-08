package org.fundacionjala.movies;

public class Movie {
    int childrens = 2;
    int regular = 0;
    int newRelease = 1;
    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public int getPriceCode() {

        return priceCode;
    }

    public void setPriceCode(int arg) {

        priceCode = arg;
    }

    public String getTitle() {
        return title;
    }
}
