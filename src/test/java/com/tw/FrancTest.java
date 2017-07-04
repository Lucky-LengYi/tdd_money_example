package com.tw;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FrancTest {
    @Test
    public void test_one_franc_equals_one_franc() throws Exception {
        assertEquals(Money.franc(1), Money.franc(1));
    }

    @Test
    public void test_one_franc_not_equals_two_francs() throws Exception {
        assertNotEquals(Money.franc(1), Money.franc(2));
    }

    @Test
    public void test_one_franc_plus_one_franc() throws Exception {
        assertEquals(Money.franc(2), Money.franc(1).plus(Money.franc(1)));
    }

    @Test
    public void test_one_franc_plus_two_franc() throws Exception {
        assertEquals(Money.franc(3), Money.franc(1).plus(Money.franc(2)));
    }

    @Test
    public void test_one_franc_multiply_two() throws Exception {
        assertEquals(Money.franc(2), Money.franc(1).times(2));
    }

    @Test
    public void test_franc_currency() throws Exception {
        assertEquals("CHF", Money.franc(1).getCurrency());
    }

}
