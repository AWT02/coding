package org.fundacionjala.coding.marines.encryption;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/** Test for {@Link CesarEncripts} . **/
public class EncriptsTests {
    final int THREE = 3;

    /** Verify cesar encrypt. */
    @Test
    public void testCesarEncrypt() {
        assertEquals("KROD", EncryptTool.encryptCesar("HOLA", this.THREE));
        assertEquals("KROD IXQGDFLRQ MDOD", EncryptTool.encryptCesar(
                "HOLA fundacion jala", 3));
    }

    /** Verify cesar decrypt. */
    @Test
    public void testCesarDecrypt() {
        assertEquals("HOLA", EncryptTool.decryptCesar("KROD", this.THREE));
        assertEquals("HOLA FUNDACION JALA", EncryptTool.decryptCesar(
                "KROD IXQGDFLRQ MDOD", this.THREE));
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
