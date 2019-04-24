package org.fundacionjala.coding.carlos.katas;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Some Tests of the Codewars page.
 */
public class EanValidatorTest {
    /**
     * valid case.
     */
    @Test
    public void test_one() {
        assertTrue(EanValidator.validate("9783815820865"));
    }

    /**
     * Invalid Case.
     */
    @Test
    public void test_two() {
        assertFalse(EanValidator.validate("9783815820864"));
    }

    /**
     * valid case.
     */
    @Test
    public void test_three() {
        assertTrue(EanValidator.validate("9783827317100"));
    }
}
