package org.fundacionjala.coding.Carlos.katas;

/**
 * THIS IS KATA FROM CODEWARS CALLED EAN VALIDATOR.
 */
class EANValidator {
    static boolean validate(String eanCode) {
        int sumPares = 0;
        int sumImpares = 0;
        int sum = 0;
        boolean result;
        for (int i = 0; i < eanCode.length() - 1; i++) {
            if (i % 2 == 0) {
                sumPares += Integer.parseInt(String.valueOf(eanCode.charAt(i)));
            } else {
                sumImpares += 3 * Integer.parseInt(String.valueOf(eanCode.charAt(i)));
            }
        }
        sum = sumImpares + sumPares;
        String ean = String.valueOf(eanCode.charAt(12));
        String eanown;
        if (sum % 10 == 0) {
            eanown = "0";
        } else {
            int checksum = 10 - (sum % 10);
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
