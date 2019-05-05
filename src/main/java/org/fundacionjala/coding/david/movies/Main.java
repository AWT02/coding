package org.fundacionjala.coding.david.movies;
/**
 * Run program.
 */
public final class Main {
    /**
     * Main method to run program.
     * @param args default argument
     */
    public static void main(final String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Movie("The Revenant", 1), 2));
        customer.addRental(new Rental(new Movie("Terminator", 0), 2));
        System.out.println(customer.statement());
    }
}
