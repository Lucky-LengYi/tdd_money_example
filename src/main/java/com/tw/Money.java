package com.tw;

public class Money {
    private String currency;

    public int getAmount() {
        return amount;
    }

    private int amount;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    String getCurrency() {
        return currency;
    }

    Money plus(Money addend) {
        return new Money(this.amount + addend.amount, this.currency);
    }

    Money times(int multiplier) {
        return new Money(this.amount * multiplier, this.currency);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        return amount == money.amount && currency.equals(money.currency);
    }

    @Override
    public int hashCode() {
        int result = currency.hashCode();
        result = 31 * result + amount;
        return result;
    }

    @Override
    public String toString() {
        return "Money{" +
                "currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}
