package com.tw;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DollarTest {

    @Test
    public void test_one_dollar_is_one_dollar() throws Exception {
        assertEquals(new Dollar(1), new Dollar(1));
    }

    @Test
    public void test_one_dollar_is_not_two_dollar() throws Exception {
        assertNotEquals(new Dollar(1), new Dollar(2));
    }

    @Test
    public void test_one_dollar_multiply_two() throws Exception {
        Dollar oneDollar = new Dollar(1);
        assertEquals(new Dollar(2), oneDollar.multiply(2));
    }

    @Test
    public void test_one_dollar_multiply_three() throws Exception {
        Dollar oneDollar = new Dollar(1);
        assertEquals(new Dollar(3), oneDollar.multiply(3));
    }

    @Test
    public void one_dollar_plus_one_dollar_equals_two_dollar() throws Exception {
        Dollar oneDollar = new Dollar(1);
        Dollar anotherOneDollar = new Dollar(1);
        assertEquals(new Dollar(2), oneDollar.plus(anotherOneDollar));
    }

    @Test
    public void one_dollar_plus_two_dollar_multiply_two() throws Exception {
        Dollar oneDollar = new Dollar(1);
        Dollar twoDollar = new Dollar(2);
        assertEquals(new Dollar(6), oneDollar.plus(twoDollar).multiply(2));
    }

    @Test
    public void test_multiple_addition() throws Exception {
        Dollar oneDollar = new Dollar(1);
        Dollar twoDollars = new Dollar(2);
        Dollar threeDollars = new Dollar(3);
        assertEquals(new Dollar(6), oneDollar.plus(twoDollars).plus(threeDollars));
    }

    @Test
    public void test_dollar_currency() throws Exception {
        assertEquals("USD", new Dollar(1).getCurrency());
    }

}
