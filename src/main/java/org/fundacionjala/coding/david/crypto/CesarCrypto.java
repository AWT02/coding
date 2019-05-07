package org.fundacionjala.coding.david.crypto;

/**
 * Kata for final exam.
 */
public final class CesarCrypto {

    private static final int NINETY = 90;
    private static final int TWENTYSIX = 26;
    private static final int SIXTYFIVE = 65;

    /**
     * CesarCrypto constructor.
     */
    private CesarCrypto() {
    }

    /**
     * Encode a given string.
     * @param text String
     * @param keyIndex int
     * @return boolean
     */
    public static String encode(final String text, final int keyIndex) {
        if (text == null) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (Character ch: text.toCharArray()) {
            int actualIndex = (int) ch;
            if (actualIndex < SIXTYFIVE || actualIndex > NINETY) {
                result.append(ch);
                break;
            } else if (actualIndex > (NINETY - keyIndex)) {
                actualIndex = actualIndex + keyIndex - TWENTYSIX;
            } else {
                actualIndex = actualIndex + keyIndex;
            }
            result.append((char) actualIndex);
        }
        return result.toString();
    }
    /**
     * Decode a given string.
     * @param text String
     * @param keyIndex int
     * @return boolean
     */
    public static String decode(final String text, final int keyIndex) {
        if (text == null) {
            return "";
        }
        StringBuilder result = new StringBuilder();

        for (Character ch: text.toCharArray()) {
            int actualIndex = (int) ch;
            if (actualIndex < SIXTYFIVE || actualIndex > NINETY) {
                result.append(ch);
                break;
            } else if ((actualIndex - keyIndex) < SIXTYFIVE) {
                actualIndex = actualIndex - keyIndex + TWENTYSIX;
            } else {
                actualIndex = actualIndex - keyIndex;
            }
            result.append((char) actualIndex);
        }
        return result.toString();
    }
    /**
     * Encode vigenere a given string.
     * @param text String
     * @param keyIndex String
     * @return boolean
     */
    public static String encodeVigenere(final String text, final String keyIndex) {
        if (text == null || keyIndex == null) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        int i = 0;
        for (Character ch: text.toCharArray()) {
            int actualIndex = (int) ch;
            if (actualIndex < SIXTYFIVE || actualIndex > NINETY) {
                result.append(ch);
            } else {
                result.append(encode(ch.toString(), (int) keyIndex.charAt(i) - SIXTYFIVE + 1));
                i++;
            }
            if (i == keyIndex.length()) {
                i = 0;
            }
        }
        return result.toString();
    }
    /**
     * Decode vigenere a given string.
     * @param text String
     * @param keyIndex String
     * @return boolean
     */
    public static String decodeVigenere(final String text, final String keyIndex) {
        if (text == null || keyIndex == null) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        int i = 0;
        for (Character ch: text.toCharArray()) {
            int actualIndex = (int) ch;
            if (actualIndex < SIXTYFIVE || actualIndex > NINETY) {
                result.append(ch);
            } else {
                result.append(decode(ch.toString(), (int) keyIndex.charAt(i) - SIXTYFIVE + 1));
                i++;
            }
            if (i == keyIndex.length()) {
                i = 0;
            }
        }
        return result.toString();
    }

}
