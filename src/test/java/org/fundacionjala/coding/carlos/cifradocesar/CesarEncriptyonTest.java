package org.fundacionjala.coding.carlos.cifradocesar;

import org.fundacionjala.coding.carlos.eancode.EanValidator;
import org.junit.Test;

import static org.junit.Assert.*;

public class CesarEncriptyonTest {
    /**
     * valid case.
     */
    @Test
    public void validtest() {
        String expected ="KROD";
        assertEquals(CesarEncriptyon.encriptyon("HOLA",3),expected);
    }

    /**
     *  Another valid test.
     */
    @Test
    public void anothervalidtest() {
        String expected ="ETWWT";
        assertEquals(CesarEncriptyon.encriptyon("Zorro",5),expected);
    }


}