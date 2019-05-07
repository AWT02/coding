package org.fundacionjala.coding.marines.encryption;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/** Tool to encrypt with cesar. **/
public final class EncryptTool {

    private static final String ALPHABET =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


    /** Default constructor. **/
    private EncryptTool() {
    }

    /**
     * Utility method to encrypt with cesar algorithm.
     * @param text string text to encrypt.
     * @param seed seed number.
     * @return encrypted text.
     */
    public static String encryptCesar(final String text, final int seed) {
        if (StringUtils.isNotBlank(text)) {
            final String inUpper = text.toUpperCase();
            final String movedAlphabet = generateAlphabet(seed);
            final StringBuilder encryptedText = new StringBuilder("");
            for (final char ch : inUpper.toCharArray()) {
                final int index = movedAlphabet.indexOf(ch);
                if (index > -1) {
                    encryptedText.append(ALPHABET.charAt(index));
                } else {
                    encryptedText.append(ch);
                }
            }
            return encryptedText.toString();
        }
        return "";
    }

    /**
     * Utility method to decrypt text.
     * @param text string text to decrypt.
     * @param seed seed number.
     * @return decrypted text.
     */
    public static String decryptCesar(final String text, final int seed) {
        if (StringUtils.isNotBlank(text)) {
            final String inUpper = text.toUpperCase();
            final String movedAlphabet = generateAlphabet(seed);
            final StringBuilder decryptedText = new StringBuilder("");
            for (final char ch : inUpper.toCharArray()) {
                final int index = ALPHABET.indexOf(ch);
                if (index > -1) {
                    decryptedText.append(movedAlphabet.charAt(index));
                } else {
                    decryptedText.append(ch);
                }
            }
            return decryptedText.toString();
        }
        return "";
    }

    /**
     * This method generate the cesar alphaber from a seed number.
     * @param seed number.
     * @return string alphabet.
     */
    private static String generateAlphabet(final int seed) {
        String copy = ALPHABET;
        for (int i = 0; i < seed; i++) {
            final String aux = String.valueOf(copy.charAt(copy.length() - 1));
            copy = aux.concat(copy.replace(aux, ""));
        }
        return copy;
    }

    /**
     * Utility method to encrypt with vigenere algorithm.
     * @param text     string text to encrypt.
     * @param wordSeed word seed.
     * @return encrypted text.
     */
    public static String encryptVigenere(final String text,
                                         final String wordSeed) {
        if (StringUtils.isNotBlank(text)) {
            final String inUpper = text.toUpperCase();
            final List<Integer> listRound = getListRound(wordSeed.toUpperCase());
            int indexList = 0;
            final StringBuilder encryptedText = new StringBuilder("");
            for (final char ch : inUpper.toCharArray()) {
                if (ALPHABET.indexOf(ch) > -1) {
                    if (indexList >= listRound.size()) {
                        indexList = 0;
                    }
                    final int round = listRound.get(indexList);
                    int index = ALPHABET.indexOf(ch) + round;
                    if (index > (ALPHABET.length() - 1)) {
                        index = index - ALPHABET.length();
                    }
                    encryptedText.append(ALPHABET.charAt(index));
                    indexList++;
                } else {
                    encryptedText.append(ch);
                }
            }
            return encryptedText.toString();
        }
        return "";
    }

    /**
     * Utility method to decrypt with vigenere algorithm.
     * @param text     string text to decrypt.
     * @param wordSeed word seed.
     * @return decrypted text.
     */
    public static String decryptVigenere(final String text,
                                         final String wordSeed) {
        if (StringUtils.isNotBlank(text)) {
            final String inUpper = text.toUpperCase();
            final List<Integer> listRound = getListRound(wordSeed.toUpperCase());
            int indexList = 0;
            final StringBuilder decryptedText = new StringBuilder("");
            for (final char ch : inUpper.toCharArray()) {
                if (ALPHABET.indexOf(ch) > -1) {
                    if (indexList >= listRound.size()) {
                        indexList = 0;
                    }
                    final int round = listRound.get(indexList);
                    int index = ALPHABET.indexOf(ch) - round;
                    if (index < 0) {
                        index = index + ALPHABET.length();
                    }
                    decryptedText.append(ALPHABET.charAt(index));
                    indexList++;
                } else {
                    decryptedText.append(ch);
                }
            }
            return decryptedText.toString();
        }
        return "";
    }

    /**
     * This method generate the list of round number for vigenere.
     * @param wordSeed word seed.
     * @return integer list.
     */
    private static List<Integer> getListRound(final String wordSeed) {
        final List<Integer> result = new ArrayList<>();
        for (final char ch : wordSeed.toCharArray()) {
            final int index = ALPHABET.indexOf(ch);
            result.add(index + 1);
        }
        return result;
    }
}
