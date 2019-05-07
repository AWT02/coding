package org.fundacionjala.coding.david.eancode;
        import org.fundacionjala.coding.david.crypto.CesarCrypto;
        import org.junit.Test;

        import static org.junit.Assert.*;

/**
 * Test to validate EANCode.
 */
public class CesarCryptoTest {
    /**
     * First Code "HOLA" with key 3.
     */
    @Test
    public void test01() {

        assertEquals("KROD", CesarCrypto.encode("HOLA",3));
    }
    /**
     * Second Code "ZORRO" with key 5.
     */
    @Test
    public void test02() {

        assertEquals("ETWWT", CesarCrypto.encode("ZORRO",5));
    }
    /**
     * First Code "HOLA".
     */
    @Test
    public void test03() {

        assertEquals("HOLA", CesarCrypto.decode("KROD",3));
    }
    /**
     * First Code "ZORRO".
     */
    @Test
    public void test04() {

        assertEquals("ZORRO", CesarCrypto.decode("ETWWT",5));
    }
}
