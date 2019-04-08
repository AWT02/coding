package org.fundacionjala.movies;

import java.util.Enumeration;
import java.util.Vector;

class Customer {
    private String name;
    private Vector rentals = new Vector();

    /**
     * Cutomer constructor.
     * @param name Name of customer
     */

    public Customer(String name) {
        this.name = name;
    }

    /**
     * Add rental
     * @param arg
     */
    public void addRental(Rental arg) {
        rentals.addElement(arg);
    }

    /**
     * Get the name customer
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        String result = "Rental Record for " + getName() + "\n";

            double Amount = 0;

            //determine amounts

        /**
         * Movie
         */
        public void regular(movie,Amount){

          if (each.getDaysRented() > 2) {
            Amount += (each.getDaysRented() - 2) * 1.5;
        }
        frequentRenterPoints++;
            /**
             * Release
             */
        public void newRelease (movie,Amount){
                if (each.getDaysRented() > 2){
                Amount += each.getDaysRented() * 3;
            }
            frequentRenterPoints++;
        }

            /**
             * Children
             */

        public void children (movie,Amount){

            if (each.getDaysRented() > 3){
                Amount += (each.getDaysRented() - 3) * 1.5;
            }
            frequentRenterPoints++;
        }

            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(Amount) + "\n";
            totalAmount += Amount;
        }
        //add footer lines
        System.out.print("Amount owed is " + String.valueOf(totalAmount) +"\n";
        System.out.print("You earned " + String.valueOf(frequentRenterPoints) +" frequent renter points");

    }

