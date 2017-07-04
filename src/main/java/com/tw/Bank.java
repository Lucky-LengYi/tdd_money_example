package com.tw;

public class Bank {
    Money reduce(Money money, String toCurrency) {
        int rate = getRate(money.getCurrency(), toCurrency);
        return new Money(money.getAmount() * rate, toCurrency);
    }

    Money reduce(Money augend, Money addend, String toCurrency) {
        int rate = getRate(addend.getCurrency(), toCurrency);
        int rate1 = getRate(augend.getCurrency(), toCurrency);
        return new Money(augend.getAmount() * rate1, toCurrency).plus(new Money(addend.getAmount() * rate, toCurrency));
    }

    private int getRate(String fromCurrency, String toCurrency) {
        if (fromCurrency.equals(toCurrency)) {
            return 1;
        }
        return toCurrency.equals("CHF") ? 2 : 1;
    }
}
