package org.fundacionjala.coding.carlos.cifradocesar;

import org.junit.Test;

import static org.junit.Assert.*;

public class CesarCryptoTest {
    /**
     * valid case PART 1.
     */
    @Test
    public void validtest() {
        String expected ="KROD";
        assertEquals(CesarCrypto.encode("HOLA",3),expected);
    }

    /**
     *  Another valid test.
     */
    @Test
    public void anothervalidtest() {
        String expected ="ETWWT";
        assertEquals(CesarCrypto.encode("Zorro",5),expected);
    }

    @Test
    public void specialChartest() {
        String expected ="K?OD";
        assertEquals(CesarCrypto.encode("H?LA",3),expected);
    }

    @Test
    public void nullTest() {
        String expected ="";
        assertEquals(CesarCrypto.encode("",3),expected);
    }

    /**
     * This test verifies the 2nd part of the exercise.
     */
    @Test
    public void encryptNegativeKeyTest() {
        String expected ="ZORRO";
        assertEquals(CesarCrypto.encode("ETWWT",-5),expected);
    }

    /**
     * This test verifies the 2nd part of the exercise.
     */
    @Test
    public void decryptTest() {
        String expected ="ZORRO";
        assertEquals(CesarCrypto.decode("ETWWT",5),expected);
    }

}