package org.fundacionjala.coding.movies;

import java.util.*;

/**
 * Handle customer order.
 */
class Customer {
    private String name;
    private ArrayList<Rental> orderList;
    /**
     * Customer constructor.
     * @param name - Name of customer
     */
    Customer(final String name) {
        orderList = new ArrayList<>();
        this.name = name;
    }
    /**
     * Add elements to orderList list.
     * @param arg - element to orderList list
     **/
    void addRental(final Rental arg) {
        this.orderList.add(arg);
    }
    /**
     * Get the name of customer.
     *
     * @return String name
     */
    String getName() {
        return this.name;
    }

    /**
     * Add points based on conditions.
     * @param frequentRenterPoints actual renter points
     * @param each An rental.
     * @return frequentRenterPoints
     */
    int frecuentCustomerPoints(Rental each, int frequentRenterPoints){
        // add frequent renter points
        frequentRenterPoints++;
        // add bonus for a two day new release rental
        if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE)
                &&
                each.getDaysRented() > 1) {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }
    /**
     * Statement.
     * @return String result
     */
    String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        Enumeration rentalsOrder = Collections.enumeration(this.orderList);
        String result;

        result = String.format("Rental Record for %s %n", getName());

        while (rentalsOrder.hasMoreElements()) {

            double thisAmount = 0;
            final List<Double> numbers = new ArrayList<>(Arrays.asList(1.5, 3.0));
            Rental each = (Rental) rentalsOrder.nextElement();
            //determine amounts for each line
            thisAmount = MovieType.getAmount(each, thisAmount, numbers);

            frequentRenterPoints = frecuentCustomerPoints(each, frequentRenterPoints);

            //show figures for this rental
            result = String.format("%s %-20s %-20s %n",
                    result, each.getMovie().getTitle(), String.valueOf(thisAmount));

            totalAmount += thisAmount;
        }
        //add footer lines
        result = String.format("%s Amount owed is %s %n You earned %s frequent renter points",
                result, String.valueOf(totalAmount), String.valueOf(frequentRenterPoints));

        return result;
    }
}
