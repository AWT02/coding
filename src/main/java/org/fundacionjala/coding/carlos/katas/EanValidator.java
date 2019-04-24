package org.fundacionjala.coding.carlos.katas;

/**
 * THIS IS KATA FROM CODEWARS CALLED EAN VALIDATOR.
 */
public final class EanValidator {
    /**
     * This was required for sonarcloud check fix.
     */
    private EanValidator() {
    }

    /**
     * @param eanCode is the ean code.
     * @return true or false
     */
    static boolean validate(final String eanCode) {
        int sumPares = 0;
        int sumImpares = 0;
        int sum = 0;
        final int multiplier = 3;
        final int ten = 10;
        final boolean result;
        for (int i = 0; i < eanCode.length() - 1; i++) {
            if (i % 2 == 0) {
                sumPares += Integer.parseInt(String.valueOf(eanCode.charAt(i)));
            } else {
                sumImpares += multiplier
                        * Integer.parseInt(String.valueOf(eanCode.charAt(i)));
            }
        }
        sum = sumImpares + sumPares;
        final String ean = String.valueOf(eanCode.charAt(12));
        final String eanown;
        if (sum % ten == 0) {
            eanown = "0";
        } else {
            final int checksum = ten - (sum % ten);
            eanown = checksum + "";
        }
        if (ean.equals(eanown)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

}
