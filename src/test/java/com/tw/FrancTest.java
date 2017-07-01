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
}
