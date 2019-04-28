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
        int sum = 0;
        for (int i = 1; i < eanCode.length(); i++) {
            int value = Integer.parseInt(part[i - 1]);
            sum += i % 2 == 0 ? value * THREE : value;
        }
        int checksum = sum % TEN != 0 ? TEN - sum % TEN : 0;
        return checksum == Integer.parseInt(part[eanCode.length() - 1]);
    }
}
