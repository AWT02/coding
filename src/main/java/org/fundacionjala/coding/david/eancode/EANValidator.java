package org.fundacionjala.coding.david.eancode;

/**
 * EAN code validator.
 */
public final class EANValidator {

    private static final int TEN = 10;
    private static final int THREE = 3;
    /**
     * EANValidator constructor.
     */
    private EANValidator() {

    }

    /**
     * Validate base on rules.
     * @param eanCode String
     * @return boolean
     */
    public static boolean validate(final String eanCode) {
        String[] part = eanCode.split("");
        int aux = 0;
        int checksum = 0;

        for (int i = 1; i < eanCode.length(); i++) {
            if (i % 2 == 0) {
                aux = (Integer.parseInt(part[i - 1]) * THREE) + aux;
            } else {
                aux = Integer.parseInt(part[i - 1]) + aux;
            }
        }
        if (aux % TEN != 0) {
            checksum = TEN - (aux % TEN);
        }
        return checksum == Integer.parseInt(part[eanCode.length() - 1]);
    }
}
