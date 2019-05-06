package org.fundacionjala.coding;

import org.fundacionjala.coding.carlos.eancode.EanValidator;
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
    public void testone() {
        assertTrue(EanValidator.validate("9783815820865"));
    }

    /**
     * Invalid Case.
     */
    @Test
    public void testtwo() {
        assertFalse(EanValidator.validate("9783815820864"));
    }

    /**
     * valid case.
     */
    @Test
    public void testthree() {
        assertTrue(EanValidator.validate("9783827317100"));
    }
}


