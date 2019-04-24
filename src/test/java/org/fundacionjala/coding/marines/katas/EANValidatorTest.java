package org.fundacionjala.coding.marines.katas;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/** Test for {@link EANValidator}. */
public class EANValidatorTest {

    @Test
    public void testValidateEANCode() {
        assertTrue(EANValidator.validate("4003301018398"));
    }


    @Test
    public void test_01() {
        assertTrue(EANValidator.validate("9783815820865"));
    }

    @Test
    public void test_02() {
        assertFalse(EANValidator.validate("9783815820864"));
    }

    @Test
    public void test_03() {
        assertTrue(EANValidator.validate("9783827317100"));
    }
}
