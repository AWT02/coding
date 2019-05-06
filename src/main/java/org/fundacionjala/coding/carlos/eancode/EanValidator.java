package org.fundacionjala.coding.carlos.eancode;

/**
 * This is a Kata of Codewars webpage.
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
    public static boolean validate(final String eanCode) {
        int sumEven = 0;
        int sumOdd = 0;
        int sum = 0;
        final int multiplier = 3;
        final int ten = 10;
        final boolean result;
        for (int i = 0; i < eanCode.length() - 1; i++) {
            if (i % 2 == 0) {
                sumEven += Integer.parseInt(String.valueOf(eanCode.charAt(i)));
            } else {
                sumOdd += multiplier
                        * Integer.parseInt(String.valueOf(eanCode.charAt(i)));
            }
        }
        sum = sumOdd + sumEven;
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
