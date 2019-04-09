package org.fundacionjala.movies;

/**
 * This class represent a movie.
 * @author carledriss
 */
public abstract class Movie {
    /** Movie title. **/
    protected String title;

    /**
     * Parameterized constructor.
     * @param newTitle movie title.
     */
    public Movie(final String newTitle) {
        this.title = newTitle;
    }

    /**
     * Get movie title.
     * @return title.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Movie detail for report rent.
     * @param daysRented days rented.
     * @return string
     **/
    public String getDetail(final int daysRented) {
        return String.format("\t%s\t%s\n", this.title,
                String.valueOf(getPrice(daysRented)));
    }

    /**
     * Get price if the movie is rented x days.
     * @param daysRented int amount of days.
     * @return price double
     */
    public abstract double getPrice(int daysRented);

    /**
     * For new movie and more than 1 day, have extra point.
     * @param daysRented amount of days rented.
     * @return boolean
     */
    public abstract boolean hasExtraPoint(int daysRented);
}
