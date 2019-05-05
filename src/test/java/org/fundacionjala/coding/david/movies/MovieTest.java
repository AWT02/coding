package org.fundacionjala.coding.david.movies;

import org.fundacionjala.coding.david.movies.movie.Children;
import org.fundacionjala.coding.david.movies.movie.NewRelease;
import org.fundacionjala.coding.david.movies.movie.Regular;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link Movie}.
 */
public class MovieTest {

    /**
     * Check customer points on a regular customer.
     */
    @Test
    public void testExtraChildrenMoviePoints() {
        final Movie children = new Children("DBZ");
        children.setPoints(0);
        assertEquals(0, children.getPoints());
    }

    /**
     * Check customer points on a favorite customer.
     **/
    @Test
    public void testExtraNewReleaseMoviePoints() {
        final Movie newRelease = new NewRelease("DBZ");
        newRelease.setPoints(0);
        assertEquals(0, newRelease.getPoints());
    }

    /**
     * Check customer points on a favorite customer.
     **/
    @Test
    public void testExtraRegularMoviePoints() {
        final Movie regular = new Regular("DBZ");
        regular.setPoints(0);
        assertEquals(0, regular.getPoints());
    }
}
