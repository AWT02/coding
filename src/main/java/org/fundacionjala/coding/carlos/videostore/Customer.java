package org.fundacionjala.coding.carlos.videostore;

import java.util.ArrayList;
import java.util.List;

/**
 * this is the class costumer.
 */
public class Customer {
    private final String name;

    /**
     *
     * @return orderlist.
     */
    public List<Rental> getOrderList() {
        return orderList;
    }

    private ArrayList<Rental> orderList = new ArrayList<>();

    /**
     *
     * @param name of the costumer.
     */
    public Customer(final String name) {
        this.name = name;
    }

    /**
     *
     * @param arg is a Rental object.
     */
    public void addRental(final Rental arg) {
        this.orderList.add(arg);
    }

    /**
     *
     * @return name of the costumer.
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @return detail of the costumer order.
     */
    public String statement() {
        String result = "Rental Record for " + this.getName() + "\n";
        for (final Rental rent : this.orderList) {
            result += "\t" + rent.getMovie().getTitle() + "\t" + String.valueOf(rent.getrentCost()) + "\n";
            System.out.println(result);

        }

        return result;
    }


}
