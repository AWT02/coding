package org.fundacionjala.coding.david.crypto;

import java.util.HashMap;

public class CesarCrypto {
     /**
     * Encode a given string.
     * @param text String
     * @param keyIndex int
     * @return boolean
     */
    public static String encode(final String text, final int keyIndex) {
        StringBuilder result = new StringBuilder();

        for (Character ch: text.toCharArray()) {
            int actualIndex = (int) ch;
            if (actualIndex > (90-keyIndex)) {
                actualIndex = actualIndex + keyIndex - 26;
            }else {
                actualIndex = actualIndex + keyIndex;
            }
            result.append((char)actualIndex);
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
        StringBuilder result = new StringBuilder();

        for (Character ch: text.toCharArray()) {
            int actualIndex = (int) ch;
            if ((actualIndex-keyIndex) < 65) {
                actualIndex = actualIndex - keyIndex + 26;
            }else {
                actualIndex = actualIndex - keyIndex;
            }
            result.append((char)actualIndex);
        }
        return result.toString();
    }

}
