package org.fundacionjala.coding.david.crypto;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test to validate EANCode.
 */
public class CesarCryptoTest {
    private static final int THREE = 3;
    private static final int FIVE = 5;
    /**
     * First encode "HOLA" with key 3.
     */
    @Test
    public void test01() {
        assertEquals("KROD", CesarCrypto.encode("HOLA", THREE));
    }
    /**
     * Second encode "ZORRO" with key 5.
     */
    @Test
    public void test02() {
        assertEquals("ETWWT", CesarCrypto.encode("ZORRO", FIVE));
    }
    /**
     * First decode "HOLA" with key 3.
     */
    @Test
    public void test03() {
        assertEquals("HOLA", CesarCrypto.decode("KROD", THREE));
    }
    /**
     *  Second decode "ZORRO" with key 5.
     */
    @Test
    public void test04() {
        assertEquals("ZORRO", CesarCrypto.decode("ETWWT", FIVE));
    }
    /**
     *  Null value encode.
     */
    @Test
    public void test05() {
        assertEquals("", CesarCrypto.encode(null, FIVE));
    }
    /**
     *  Empty value encode.
     */
    @Test
    public void test06() {
        assertEquals("", CesarCrypto.encode("", FIVE));
    }
    /**
     *
     *  Null value decode.
     */
    @Test
    public void test07() {
        assertEquals("", CesarCrypto.decode(null, FIVE));
    }
    /**
     *  Empty value decode.
     */
    @Test
    public void test08() {
        assertEquals("", CesarCrypto.decode("", FIVE));
    }
    /**
     *  Empty value decode.
     */
    @Test
    public void test09() {
        assertEquals("TXYP XMUNHCRC", CesarCrypto.encodeVigenere("HOLA JALASOFT", "LIMON"));
    }
    /**
     *  Empty value decode.
     */
    @Test
    public void test10() {
        assertEquals("HOLA JALASOFT", CesarCrypto.decodeVigenere("TXYP XMUNHCRC", "LIMON"));
    }
}
