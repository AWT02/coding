package org.fundacionjala.coding.david.movies;


import java.util.ArrayList;
import java.util.List;

/**
 * Handle customer order.
 */
class Customer {
    private String name;
    private List<Rental> orderList;

    /**
     * Customer constructor.
     * @param name - Name of customer
     */
    Customer(final String name) {
        this.name = name;
        this.orderList = new ArrayList<>();
    }

    /**
     * Add elements to orderList list.
     * @param item - element to orderList list
     **/
    public void addRental(final Rental item) {
        this.orderList.add(item);
    }
    /**
     * Get the name of customer.
     *
     * @return String name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Number of movies for rental.
     * @return int
     */
    public int numberOfOrders() {
        return this.orderList.size();
    }

    /**
     * Sum all amounts of each rental.
     * @return double
     */
    public double getTotalOrderBill() {
        double totalBill = 0;
        for (final Rental rental : this.orderList) {
            totalBill += rental.getAmount();
        }
        return totalBill;
    }
    /**
     * Add points if it is included on promo conditions.
     * @return int
     */
    public int getFrecuentCustomerPoints() {
        int frequentRenterPoints = numberOfOrders();
        for (Rental item: this.orderList) {
            if (item.isIncludedOnPromo()) {
                frequentRenterPoints += item.getMovie().getPoints();
            }
        }
        return frequentRenterPoints;
    }
    /**
     * Assemble order details.
     * @return String result
     */
    public String getOrderList() {
        StringBuilder display = new StringBuilder();
        display.append(String.format("Rental Record for %s %n", getName()));
        for (final Rental rental : this.orderList) {
            display.append(rental.getMovieDetail());
        }
        return String.valueOf(display.append(
                String.format("Amount owed is %s %nYou earned %s frequent renter points",
                String.valueOf(getTotalOrderBill()),
                        String.valueOf(getFrecuentCustomerPoints())
                )));
    }
}
