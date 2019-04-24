package org.fundacionjala.coding.carlos.katas;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EanValidatorTest {
    @Test
    public void test_01() {
        assertTrue(EanValidator.validate("9783815820865"));
    }

    @Test
    public void test_02() {
        assertFalse(EanValidator.validate("9783815820864"));
    }

    @Test
    public void test_03() {
        assertTrue(EanValidator.validate("9783827317100"));
    }
}
