package com.github.kastkest.patterns.behavioral.starategy;

public class Order {

    public void pay(PaymentStrategy strategy) {
        Money total = getTotal();
        strategy.pay(total);
    }
    public Money getTotal() {
        return ...
    }
}
