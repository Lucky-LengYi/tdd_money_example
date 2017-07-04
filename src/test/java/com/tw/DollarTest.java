package com.tw;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DollarTest {

    @Test
    public void test_one_dollar_is_one_dollar() throws Exception {
        assertEquals(Money.dollar(1), Money.dollar(1));
    }

    @Test
    public void test_one_dollar_is_not_two_dollar() throws Exception {
        assertNotEquals(Money.dollar(1), Money.dollar(2));
    }

    @Test
    public void test_one_dollar_multiply_two() throws Exception {
        Money oneMoney = Money.dollar(1);
        assertEquals(Money.dollar(2), oneMoney.times(2));
    }

    @Test
    public void test_one_dollar_multiply_three() throws Exception {
        Money oneMoney = Money.dollar(1);
        assertEquals(Money.dollar(3), oneMoney.times(3));
    }

    @Test
    public void one_dollar_plus_one_dollar_equals_two_dollar() throws Exception {
        Money oneMoney = Money.dollar(1);
        Money anotherOneMoney = Money.dollar(1);
        assertEquals(Money.dollar(2), oneMoney.plus(anotherOneMoney));
    }

    @Test
    public void one_dollar_plus_two_dollar_multiply_two() throws Exception {
        Money oneMoney = Money.dollar(1);
        Money twoMoney = Money.dollar(2);
        assertEquals(Money.dollar(6), oneMoney.plus(twoMoney).times(2));
    }

    @Test
    public void test_multiple_addition() throws Exception {
        Money oneMoney = Money.dollar(1);
        Money twoDollars = Money.dollar(2);
        Money threeDollars = Money.dollar(3);
        assertEquals(Money.dollar(6), oneMoney.plus(twoDollars).plus(threeDollars));
    }

    @Test
    public void test_dollar_currency() throws Exception {
        assertEquals("USD", Money.dollar(1).getCurrency());
    }

    @Test
    public void reduce_one_dollar_to_one_dollar() throws Exception {
        assertEquals(Money.dollar(1), new Bank().reduce(Money.dollar(1),"USD"));
    }

    @Test
    public void reduce_one_dollar_to_two_franc() throws Exception {
        assertEquals(Money.franc(2),new Bank().reduce(Money.dollar(1),"CHF"));
    }

    @Test
    public void reduce_two_dollar_to_four_franc() throws Exception {
        assertEquals(Money.franc(4),new Bank().reduce(Money.dollar(2),"CHF"));
    }

    @Test
    public void reduce_sum_of_one_dollar_and_two_francs_to_franc() throws Exception {
        Bank bank = new Bank();
        assertEquals(Money.franc(4), bank.reduce(Money.dollar(1), Money.franc(2), "CHF"));
    }

}
