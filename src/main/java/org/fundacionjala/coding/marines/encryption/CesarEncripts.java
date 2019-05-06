package org.fundacionjala.coding.marines.encryption;

import org.apache.commons.lang3.StringUtils;

/** Tool to encript with cesar. **/
public class CesarEncripts {

    private static final String alphabet =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /** Default constructor. **/
    private CesarEncripts() {
    }

    /**
     * Utility method to encript with cesar algorithm.
     * @param text string text to encrypt.
     * @param seed seed number.
     * @return encripted text.
     */
    public static String encript(final String text, final int seed) {
        if (StringUtils.isNotBlank(text)) {
            final String inUpper = text.toUpperCase();
            final String movedAlphabet = generateAlphabet(seed);
            final StringBuilder encriptedText = new StringBuilder("");
            for (final char ch : inUpper.toCharArray()) {
                final int index = movedAlphabet.indexOf(ch);
                encriptedText.append(alphabet.charAt(index));
            }
            return encriptedText.toString();
        }
        return "";
    }

    /**
     * Utility method to decrypt text.
     * @param text string text to decrypt.
     * @param seed seed number.
     * @return decripted text.
     */
    public static String decript(final String text, final int seed) {
        if (StringUtils.isNotBlank(text)) {
            final String inUpper = text.toUpperCase();
            final String movedAlphabet = generateAlphabet(seed);
            final StringBuilder decriptedText = new StringBuilder("");
            for (final char ch : inUpper.toCharArray()) {
                final int index = alphabet.indexOf(ch);
                decriptedText.append(movedAlphabet.charAt(index));
            }
            return decriptedText.toString();
        }
        return "";
    }

    private static String generateAlphabet(final int seed) {
        String copy = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < seed; i++) {
            final String aux = String.valueOf(copy.charAt(copy.length() - 1));
            copy.replace(aux, "");
            copy = aux.concat(copy);
        }
        return copy;
    }

    public static void main(final String[] args) {
        System.out.println(CesarEncripts.decript("KROD", 3));
        System.out.println(CesarEncripts.encript("HOLA", 3));
    }
}
