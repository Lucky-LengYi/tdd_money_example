package com.tw;

public class Money {
    int amount;

    Money(int amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        return this.amount;
    }
}
