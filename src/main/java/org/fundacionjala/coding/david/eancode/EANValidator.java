package org.fundacionjala.coding.david.eancode;

/**
 * EAN code validator.
 */
public final class EANValidator {
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
        final int[] numbers = {3, 10};
        for (int i = 1; i < eanCode.length(); i++) {
            if (i % 2 == 0) {
                aux = (Integer.parseInt(part[i - 1]) * numbers[0]) + aux;
            } else {
                aux = Integer.parseInt(part[i - 1]) + aux;
            }
        }
        if (aux % numbers[1] != 0) {
            checksum = numbers[1] - (aux % numbers[1]);
        }
        return checksum == Integer.parseInt(part[eanCode.length() - 1]);
    }
}
