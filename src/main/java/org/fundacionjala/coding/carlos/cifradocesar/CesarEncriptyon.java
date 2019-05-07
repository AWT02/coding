package org.fundacionjala.coding.carlos.cifradocesar;

public class CesarEncriptyon {

    public static String encriptyon(String text, int code) {
        StringBuilder enc = new StringBuilder();
        code = code % 26;
        text=text.toUpperCase();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                if ((text.charAt(i) + code) > 'Z') {
                    enc.append((char) (text.charAt(i) + code - 26));
                } else {
                    enc.append((char) (text.charAt(i) + code));
                }
            }
        }
        return enc.toString();
    }

}
