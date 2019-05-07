package org.fundacionjala.coding.carlos.cifradocesar;

/**
 * Kata for GUI automation.
 */
public final class CesarCrypto {
    /**
     * This is a constructor for sonarlint.
     */
    private CesarCrypto() {
    }

    /**
     *
     * @param word a work to encrypt
     * @param codein number (positive value).
     * @return encoded test.
     */
    public static String encode(final String word, final int codein) {

        StringBuilder enc = new StringBuilder();
        int code = codein % 26;
        String text = word.toUpperCase();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {

                if ((text.charAt(i) + code) > 'Z') {
                    enc.append((char) (text.charAt(i) + code - 26));
                } else if ((text.charAt(i) + code) < 'A'){
                    enc.append((char) (26+ text.charAt(i) + code ));
                }else {
                    enc.append((char) (text.charAt(i) + code));
                }
            } else{
                enc.append(text.charAt(i));
            }
        }
        return enc.toString();
    }

    /**
     *
     * @param word text to decode.
     * @param codein is a negative integer.
     * @return decoded text.
     */
    public static String decode(final String word, final int codein) {
        StringBuilder enc = new StringBuilder();
        int code = codein % 26;
        code*=-1;
        String text=word.toUpperCase();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {

                if ((text.charAt(i) + code) > 'Z') {
                    enc.append((char) (text.charAt(i) + code - 26));
                } else if ((text.charAt(i) + code) < 'A'){
                    enc.append((char) (26+ text.charAt(i) + code ));
                }else {
                    enc.append((char) (text.charAt(i) + code));
                }
            } else{
                enc.append(text.charAt(i));
            }
        }
        return enc.toString();
    }

}
