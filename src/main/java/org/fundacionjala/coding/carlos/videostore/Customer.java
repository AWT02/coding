package org.fundacionjala.coding.carlos.videostore;

import java.util.ArrayList;

/**
 * this is the class costumer.
 */
public class Customer {
    private final String name;
    private ArrayList<Rental> orderList = new ArrayList<Rental>();

    /**
     *
     * @param name
     */
    public Customer(final String name) {
        this.name = name;
    }

    /**
     *
     * @param arg
     */
    public void addRental(final Rental arg) {
        this.orderList.add(arg);
    }

    /**
     *
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @return
     */
    public String statement() {
        String result = "Rental Record for " + this.getName() + "\n";
        for (final Rental rent : this.orderList) {
            //show figures for this rental
            //rent.getrentCost();
            //System.out.println(rent.getrentCost());

            result += "\t" + rent.getMovie().getTitle() + "\t" + String.valueOf(rent.getrentCost()) + "\n";
            System.out.println(result);

        }

        //add footer lines
//        result += "Amount owed is " + String.valueOf(5) +
//                "\n";
//        result += "You earned " + String.valueOf(3)
//                +
//                " frequent renter points";
        return result;
    }


}
