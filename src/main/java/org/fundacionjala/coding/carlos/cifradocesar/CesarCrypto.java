package org.fundacionjala.coding.carlos.cifradocesar;

public class CesarCrypto {

    public static String encode(String text, int code) {
        StringBuilder enc = new StringBuilder();
        code = code % 26;
        text=text.toUpperCase();
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

    public static String decode(String text, int code) {
        StringBuilder enc = new StringBuilder();
        code = code % 26;
        code*=-1;
        text=text.toUpperCase();
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

    public static String encode(String msg, String clave) {
        char[] claveA;
        char[] resultado; //resultado cifrado
        char matriz[][];
        char[] mensaje = msg.toCharArray();
        char[] claveTemp = clave.toCharArray();
        claveA = new char[mensaje.length];
        int cont =0;
        for(int i=0;i<mensaje.length;i++)

    }
}
