package com.github.kastkest.patterns.behavioral.starategy;

public class Main {

    public static void main(String[] args) {
        // товары
        Item item1 = new Item("Postion #1", Money.of(CurrencyUnit.USD, 5));
        Item item2 = new Item("Postion #2", Money.of(CurrencyUnit.USD, 10));
// создаём и наполняем заказ
        Order order = new Order();
        order.addItem(item1);
        order.addItem(item2);
// выбор конкретной стратегии и оплата заказа
        PaymentStrategy payPalPaymentStrategy =
                new PayPalPaymentStrategy("example@example.com", "token");
        order.pay(payPalPaymentStrategy);
// выбор конкретной стратегии и оплата заказа
        PaymentStrategy creditCardPaymnetStrategy =
                new CreditCardPaymentStrategy(
                        new CreditCard("1234 5678", "123", "mr. Card Holder", "FOREVER"));
        order.pay(creditCardPaymnetStrategy);
    }
}
