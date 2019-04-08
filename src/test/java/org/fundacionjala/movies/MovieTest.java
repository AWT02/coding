package org.fundacionjala.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/** Test for {@link Movie}. **/
public class MovieTest {

    /** this test verify if movie detail is get correctly. **/
    @Test
    public void testGetDetail() {
        final Movie movie = new RegularMovie("Terminator");
        assertTrue(movie.getDetail(1).contains(movie.getTitle()));
        assertEquals("\tTerminator\t2.0\n", movie.getDetail(1));
    }
}
