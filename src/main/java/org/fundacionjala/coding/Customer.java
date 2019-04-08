package org.fundacionjala.coding;

import java.util.ArrayList;
import java.util.List;

/**
 * This class should be called VideoStore instead of costumner
 */
public class Customer {
    private final String name;
    private List<Rental> orderList = new ArrayList<>();

    public Customer(final String name) {
        this.name = name;
    }

    public void addRental(final Rental arg) {
        this.orderList.add(arg);
    }

    public String getName() {
        return this.name;
    }

    public double orderCost(){
        double sum=0;
        for (Rental rent:orderList){
            sum+=rent.getrentCost();
        }
        return sum;
    }

    public int frequentRenderPoints(){
        int frequentRenderPoints=0;
        for (Rental rent:orderList){
            frequentRenderPoints+=1;
            if(rent.getMovie().getPriceCode()==1 && rent.daysRented>1){
                frequentRenderPoints+=1;
            }
        }
        return frequentRenderPoints;
    }

    public String statement() {
        String result = "Rental Record for " + this.getName() + "\n";
        for (final Rental rent : this.orderList) {
            result += "\t" + rent.getMovie().getTitle() + "\t" + String.valueOf(rent.getrentCost()) + "\n";
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(this.orderCost()) +
                "\n";
        result += "You earned " + String.valueOf(this.frequentRenderPoints())
                +
               " frequent renter points";

        return result;
    }


}
