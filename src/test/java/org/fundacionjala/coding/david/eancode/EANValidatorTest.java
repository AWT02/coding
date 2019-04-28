package org.fundacionjala.coding.david.eancode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Test to validate EANCode.
 */
public class EANValidatorTest {
    /**
     * First Code "9783815820865".
     */
    @Test
    public void test01() {
        assertTrue("Check EAN-Code \"9783815820865\"", EANValidator.validate("9783815820865"));
    }

    /**
     * Second code "9783815820864".
     */
    @Test
    public void test02() {
        assertFalse("Check EAN-Code \"9783815820864\"", EANValidator.validate("9783815820864"));
    }

    /**
     * Third code "9783827317100".
     */
    @Test
    public void test03() {
        assertTrue("Check EAN-Code \"9783827317100\"", EANValidator.validate("9783827317100"));
    }

    /**
     * Fourth code "4003301018398".
     */
    @Test
    public void test04() {
        assertTrue("Check EAN-Code \"4003301018398\"", EANValidator.validate("4003301018398"));
    }

    /**
     * Fifth code "9783827317101".
     */
    @Test
    public void test05() {
        assertFalse("Check EAN-Code \"9783827317101\"", EANValidator.validate("9783827317101"));
    }

    /**
     * Sixth code "4003301018392".
     */
    @Test
    public void test06() {
        assertFalse("Check EAN-Code \"4003301018392\"", EANValidator.validate("4003301018392"));
    }

    /**
     * Seventh code "0000000000017".
     */
    @Test
    public void test07() {
        assertTrue("Check EAN-Code \"0000000000017\"", EANValidator.validate("0000000000017"));
    }

    /**
     * Eighth code "0000000000010".
     */
    @Test
    public void test08() {
        assertFalse("Check EAN-Code \"0000000000010\"", EANValidator.validate("0000000000010"));
    }
}
