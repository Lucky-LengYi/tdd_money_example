package com.tw;

public class Franc extends Money{
    Franc(int amount) {
        super(amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Franc franc = (Franc) o;

        return amount == franc.amount;
    }

    Franc plus(Franc addend) {
        return new Franc(this.amount + addend.amount);
    }

    Franc multiply(int multiplier) {
        return new Franc(this.amount * multiplier);
    }
}
