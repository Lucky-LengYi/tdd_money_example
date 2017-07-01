package com.tw;

public class Money {
    protected String currency;
    int amount;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public int hashCode() {
        return this.amount;
    }

    String getCurrency() {
        return currency;
    }
}
