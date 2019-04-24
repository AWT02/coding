package org.fundacionjala.coding.marines.katas;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/** Test for {@link EANValidator}. */
public class EANValidatorTest {

    /** This test validate valid ean codes with checksum greater than zero. **/
    @Test
    public void testValidateValidEANCodeWithChesumGreaterThanZero() {
        assertTrue(EANValidator.validate("4003301018398"));
        assertTrue(EANValidator.validate("9783815820865"));
    }

    /** This test validate invalid ean code. **/
    @Test
    public void testValidateInvalidEANCode() {
        assertFalse(EANValidator.validate("9783815820864"));
    }

    /** This test validate valid ean code for checksum zero. **/
    @Test
    public void testValidateValidEANCodeWithChesumZero() {
        assertTrue(EANValidator.validate("9783827317100"));
    }
}
