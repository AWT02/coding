package org.fundacionjala.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represent a customer.
 * @author carledriss
 */
public class Customer {
    /**
     * Customer name.
     */
    private final String name;

    /**
     * Vector of movies rented by customer.
     */
    private final List<Rental> rentals;

    /**
     * Parameterized constructor.
     * @param newName customer name.
     */
    public Customer(final String newName) {
        this.name = newName;
		this.rentals = new ArrayList<>();
    }

    /**
     * Add rental.
     * @param arg Rental.
     **/
    public void addRental(final Rental arg) {
        this.rentals.add(arg);
    }

    /**
     * Get customer name.
     * @return customer name.
     **/
    public String getName() {
        return this.name;
    }

    /**
     * Get amount of rental movies by customer.
     * @return rentals size
     */
    public int amountOfRentalMovies() {
        return this.rentals.size();
    }

    /**
     * Get total rent price.
     * @return double.
     */
    public double getTotalRentPrice() {
        double totalAmount = 0;
        for (final Rental rental : this.rentals) {
            totalAmount += rental.getPrice();
        }
        return totalAmount;
    }

    /**
     * Get rent details.
     * @return string.
     */
    public String getRentalDetails() {
        final StringBuilder details = new StringBuilder();
        details.append("Rental Record for ")
                .append(getName())
                .append("\n");
        for (final Rental rental : this.rentals) {
            details.append(rental.getDetail());
        }
        details.append("Amount owed is ")
                .append(getTotalRentPrice())
                .append("\n")
                .append("You earned ")
                .append(getFrequentRenterPoints())
                .append(" frequent renter points");
        return details.toString();
    }

    /**
     * Get frequent renter points. Bonus for new release rental > 1 day.
     * @return int points.
     */
    public int getFrequentRenterPoints() {
        return this.rentals.size() + this.rentals.stream()
                .filter(i -> i.hasExtraPoint())
                .mapToInt(i -> 1).sum();
    }
}
