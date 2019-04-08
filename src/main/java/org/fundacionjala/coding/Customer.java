package org.fundacionjala.coding;

import java.util.ArrayList;
import java.util.List;

/**
 * This class should be called VideoStore instead of costumner.
 */
public class Customer {
    /**
     *name of the costumer.
     */
    private final String name;
    /**
     * list of rentals.
     */
    private List<Rental> orderList = new ArrayList<>();

    /**
     * @param name is the namme of the costumer
     */
    public Customer(final String name) {
        this.name = name;
    }

    /**
     * @param arg object rental type.
     */
    public void addRental(final Rental arg) {
        this.orderList.add(arg);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @return the total cost of the order
     */
    public double orderCost() {
        double sum = 0;
        for (Rental rent:orderList) {
            sum += rent.getrentCost();
        }
        return sum;
    }

    /**
     *
     * @return the frecquent point that a costumer gets
     */
    public int frequentRenderPoints() {
        int frequentRenderPoints = 0;
        for (Rental rent:orderList) {
            frequentRenderPoints += 1;
            if (rent.getMovie().getPriceCode() == 1
                    &&
                    rent.getDaysRented() > 1) {
                frequentRenderPoints += 1;
            }
        }
        return frequentRenderPoints;
    }

    /**
     *
     * @return an statement that will be printed
     */
    public String statement() {
        String result = "Rental Record for " + this.getName() + "\n";
        for (final Rental rent : this.orderList) {
            result += "\t" + rent.getMovie().getTitle() + "\t"
                    + rent.getrentCost() + "\n";
        }
        //add footer lines
        result += "Amount owed is " + this.orderCost()
                + "\n";
        result += "You earned " + this.frequentRenderPoints()
                +
               " frequent renter points";

        return result;
    }


}
