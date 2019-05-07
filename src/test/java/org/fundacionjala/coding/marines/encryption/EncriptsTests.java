package org.fundacionjala.coding.marines.encryption;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/** Test for {@Link CesarEncripts} . **/
public class EncriptsTests {

    /** Verify cesar encrypt. */
    @Test
    public void testCesarEncrypt() {
        assertEquals("KROD", EncryptTool.encryptCesar("HOLA", 3));
        assertEquals("KROD IXQGDFLRQ MDOD", EncryptTool.encryptCesar(
                "HOLA fundacion jala", 3));
    }

    /** Verify cesar decrypt. */
    @Test
    public void testCesarDecrypt() {
        assertEquals("HOLA", EncryptTool.decryptCesar("KROD", 3));
        assertEquals("HOLA FUNDACION JALA", EncryptTool.decryptCesar(
                "KROD IXQGDFLRQ MDOD", 3));
    }

    /** Verify Vigenere encrypt. */
    @Test
    public void testVigenereEncrypt() {
        assertEquals("TXYP XMUNHCRC", EncryptTool
                .encryptVigenere("HOLA jalasoft", "limon"));
        assertEquals("TXYP TGWQPQUXA YOXJ", EncryptTool
                .encryptVigenere("HOLA fundacion jala", "limon"));
    }

    /** Verify Vigenere decrypt. */
    @Test
    public void testVigenereDecrypt() {
        assertEquals("HOLA FUNDACION JALA", EncryptTool
                .decryptVigenere("TXYP TGWQPQUXA YOXJ", "limon"));
        assertEquals("HOLA JALASOFT", EncryptTool
                .decryptVigenere("TXYP XMUNHCRC", "limon"));
    }
}
