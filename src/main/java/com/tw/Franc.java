package com.tw;

public class Franc {
    private int amount;

    Franc(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Franc franc = (Franc) o;

        return amount == franc.amount;
    }

    @Override
    public int hashCode() {
        return amount;
    }
}
