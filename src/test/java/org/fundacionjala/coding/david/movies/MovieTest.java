package org.fundacionjala.coding.david.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link Movie}.
 */
public class MovieTest {

    /**
     * Verify some library method.
     */
    @Test
    public void testSomeLibraryMethod() {
        Movie classUnderTest = new Movie("The Revenant", 1);
        assertEquals("The Revenant", classUnderTest.getTitle());
        assertEquals(1, classUnderTest.getPriceCode());
    }
}
