package org.fundacionjala.coding.marines.encryption;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/** Test for {@Link CesarEncripts} . **/
public class EncriptsTests {
    private static final String LIMON = "limon";
    private static final int THREE = 3;

    /** Verify cesar encrypt. */
    @Test
    public void testCesarEncrypt() {
        assertEquals("KROD", EncryptTool.encryptCesar("HOLA", this.THREE));
        assertEquals("KROD IXQGDFLRQ MDOD", EncryptTool.encryptCesar(
                "HOLA fundacion jala", 3));
        assertEquals("", EncryptTool.encryptCesar("", this.THREE));
        assertEquals("", EncryptTool.encryptCesar(" ", this.THREE));
        assertEquals("", EncryptTool.encryptCesar(null, this.THREE));
    }

    /** Verify cesar decrypt. */
    @Test
    public void testCesarDecrypt() {
        assertEquals("HOLA", EncryptTool.decryptCesar("KROD", this.THREE));
        assertEquals("HOLA FUNDACION JALA", EncryptTool.decryptCesar(
                "KROD IXQGDFLRQ MDOD", this.THREE));
        assertEquals("", EncryptTool.decryptCesar("", this.THREE));
        assertEquals("", EncryptTool.decryptCesar(" ", this.THREE));
        assertEquals("", EncryptTool.decryptCesar(null, this.THREE));
    }

    /** Verify Vigenere encrypt. */
    @Test
    public void testVigenereEncrypt() {
        assertEquals("TXYP XMUNHCRC", EncryptTool
                .encryptVigenere("HOLA jalasoft", LIMON));
        assertEquals("TXYP TGWQPQUXA YOXJ", EncryptTool
                .encryptVigenere("HOLA fundacion jala", LIMON));
        assertEquals("", EncryptTool.encryptVigenere("", LIMON));
        assertEquals("", EncryptTool.encryptVigenere(" ", LIMON));
        assertEquals("", EncryptTool.encryptVigenere(null, LIMON));
    }

    /** Verify Vigenere decrypt. */
    @Test
    public void testVigenereDecrypt() {
        assertEquals("HOLA FUNDACION JALA", EncryptTool
                .decryptVigenere("TXYP TGWQPQUXA YOXJ", LIMON));
        assertEquals("HOLA JALASOFT", EncryptTool
                .decryptVigenere("TXYP XMUNHCRC", LIMON));
        assertEquals("", EncryptTool.decryptVigenere("", LIMON));
        assertEquals("", EncryptTool.decryptVigenere(" ", LIMON));
        assertEquals("", EncryptTool.decryptVigenere(null, LIMON));

    }
}
