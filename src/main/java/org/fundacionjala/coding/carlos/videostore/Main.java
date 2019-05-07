package org.fundacionjala.coding.carlos.videostore;

public class Main {
    public static void main(final String[] args) {
        final Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Movie("The Revenant", 1), 2));
        customer.addRental(new Rental(new Movie("Terminator", 0), 2));
        customer.statement();
    }
}