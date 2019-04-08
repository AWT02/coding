package org.fundacionjala.coding;


import org.junit.Test;

/**
 * @author carlos richter.
 */
public class MovieTest {
    /**
     * some coment.
     */
    @Test
    public void main() {
        final Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Movie("The Revenant", 1), 2));
        customer.addRental(new Rental(new Movie("Terminator", 0), 2));
        customer.addRental(new Rental(new Movie("50 sombras de Grey", 2), 10));
        System.out.println(customer.statement());
    }

//    @Test
//    public void createType() {
//        final Movie movie = new Movie("Forrest Gump", 1);
//        final Rental rental = new Rental(movie, 5);
//        final MovieType movieType = movie.createtype(movie.getPriceCode());
//        System.out.println(movieType.calculatePay(rental.getDaysRented()));
//        System.out.println(rental.getDaysRented());
//    }
}
