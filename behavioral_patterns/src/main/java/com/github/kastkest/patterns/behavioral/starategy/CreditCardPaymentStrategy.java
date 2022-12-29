package com.github.kastkest.patterns.behavioral.starategy;

public final class CreditCardPaymentStrategy implements PaymentStrategy {
    private final CreditCard card;

    // в данном случае требуется кредитка
    public CreditCardPaymentStrategy(CreditCard card) {
        this.card = card;
    }

    @Override
    public void pay(Money amount) {
        System.out.printf("processing %s via credit card %s\n",
                amount.toString(), card.getNumber());
    }
}
