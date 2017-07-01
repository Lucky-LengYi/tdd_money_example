package com.tw;

public class Dollar extends Money {

    Dollar(int amount) {
        super(amount, "USD");
    }

    Dollar multiply(int multiplier) {
        return new Dollar(this.amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Dollar) {
            Dollar dollar = (Dollar) obj;
            return this.amount == dollar.amount;
        }
        return false;
    }

    public Dollar plus(Dollar addend) {
        return new Dollar(this.amount + addend.amount);
    }
}
