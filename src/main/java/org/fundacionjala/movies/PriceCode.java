package org.fundacionjala.movies;

/** Set of price codes with their factor to calculate rent price. */
public enum PriceCode {
    /** Price code for regular movies. **/
    REGULAR(0, 1.5),
    /** Price code for new movies. **/
    NEW_RELEASE(1, 3),
    /** Price code for children movies. **/
    CHILDREN(2, 1.5);

    /** Price code. **/
    private final int code;

    /** Price factor. **/
    private final double factor;

    /**
     * Parameterized constructor.
     * @param newCode   price code.
     * @param newFactor price factor.
     */
    PriceCode(final int newCode, final double newFactor) {
        this.code = newCode;
        this.factor = newFactor;
    }

    /**
     * Search and get PriceCode that match with code.
     * @param code price code.
     * @return PriceCode that match.
     * @throws IllegalArgumentException Invalid Price Code.
     */
    public static PriceCode getPiceCode(final int code)
            throws IllegalArgumentException {
        for (final PriceCode priceCode : PriceCode.values()) {
            if (priceCode.getCode() == code) {
                return priceCode;
            }
        }
        throw new IllegalArgumentException("Invalid Price Code:" + code);
    }

    /**
     * Get price code.
     * @return code.
     */
    public int getCode() {
        return this.code;
    }

    /**
     * Get price factor.
     * @return price factor.
     */
    public double getFactor() {
        return this.factor;
    }
}
