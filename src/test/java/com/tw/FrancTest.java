package com.tw;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FrancTest {
    @Test
    public void test_one_franc_equals_one_franc() throws Exception {
        assertEquals(new Franc(1), new Franc(1));
    }

    @Test
    public void test_one_franc_not_equals_two_francs() throws Exception {
        assertNotEquals(new Franc(1), new Franc(2));
    }

    @Test
    public void test_one_franc_plus_one_franc() throws Exception {
        assertEquals(new Franc(2), new Franc(1).plus(new Franc(1)));
    }

    @Test
    public void test_one_franc_plus_two_franc() throws Exception {
        assertEquals(new Franc(3), new Franc(1).plus(new Franc(2)));
    }

    @Test
    public void test_one_franc_multiply_two() throws Exception {
        assertEquals(new Franc(2), new Franc(1).multiply(2));
    }

    @Test
    public void test_franc_currency() throws Exception {
        assertEquals("CHF", new Franc(1).getCurrency());
    }

}
