package org.fundacionjala.movies;

import java.util.Enumeration;
import java.util.Vector;

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
    private final Vector rentals = new Vector();

    /**
     * Parameterized constructor.
     * @param newName customer name.
     */
    public Customer(final String newName) {
        this.name = newName;
    }

    /**
     * Add rental.
     * @param arg Rental.
     **/
    public void addRental(final Rental arg) {
        this.rentals.addElement(arg);
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
     * To review.
     * @return string message.
     */
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        final Enumeration rentalList = this.rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentalList.hasMoreElements()) {
            double thisAmount = 0;
            final Rental each = (Rental) rentalList.nextElement();
            //determine amounts for each line
            final PriceCode priceCode = each.getMovie().getPriceCode();
            switch (priceCode) {
                case REGULAR:
                    thisAmount += 2;
                    if (each.getDaysRented() > 2) {
                        thisAmount += (each.getDaysRented() - 2)
                                * priceCode.getFactor();
                    }
                    break;
                case NEW_RELEASE:
                    thisAmount += each.getDaysRented() * priceCode.getFactor();
                    break;
                case CHILDREN:
                    final int longRent = 3;
                    thisAmount += priceCode.getFactor();
                    if (each.getDaysRented() > longRent) {
                        thisAmount += (each.getDaysRented() - longRent)
                                * priceCode.getFactor();
                    }
                    break;
                default:
                    break;
            }
            // add frequent renter points
            frequentRenterPoints++;
            // add bonus for a two day new release rental
            if ((priceCode == PriceCode.NEW_RELEASE)
                    &&
                    each.getDaysRented() > 1) {
                frequentRenterPoints++;
            }
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t"
                    + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints)
                +
                " frequent renter points";
        return result;
    }
}
