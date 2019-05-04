package org.fundacionjala.coding.marines.katas;

/** Kata https://www.codewars.com/kata/55563df50dda59adf900004d . **/
public final class EANValidator {

    /** Private default constructor. **/
    private EANValidator() {
    }

    /**
     * This method get the EAN checksum.
     * @param eanCode ean code of 12 chars.
     * @return checksum
     */
    public static String getChecksum(final String eanCode) {
        final int ten = 10;
        final int three = 3;
        boolean flipflop = true;
        int checksum = 0;
        for (final char ch : eanCode.toCharArray()) {
            checksum += Integer.valueOf(String.valueOf(ch)) * (flipflop ? 1
                    : three);
            flipflop = !flipflop;
        }
        checksum = ten - (checksum % ten);
        return String.valueOf(checksum == ten ? 0 : checksum);
    }

    /**
     * This method get the ean code of 13 chars.
     * @param eanCode12 ean code of 12 chars (without checksum)
     * @return ean code of 13 chars.
     */
    public static String getEanCode(final String eanCode12) {
        return eanCode12.concat(getChecksum(eanCode12));
    }

    /**
     * This method validate an ean code of 13 chars.
     * @param eanCode ean code of 13 chars.
     * @return boolean tru if it's valid and false if not.
     */
    public static boolean validate(final String eanCode) {
        final String eanCode12 = eanCode.substring(0, 12);
        return getEanCode(eanCode12).equals(eanCode);
    }
}
