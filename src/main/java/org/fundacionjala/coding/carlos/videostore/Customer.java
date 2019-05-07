package org.fundacionjala.coding;

import java.util.ArrayList;

public class Customer {
    private final String _name;
    public ArrayList<Rental> orderList = new ArrayList<Rental>();

    public Customer(final String name) {
        this._name = name;
    }

    public void addRental(final Rental arg) {
        this.orderList.add(arg);
    }

    public String getName() {
        return this._name;
    }

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
