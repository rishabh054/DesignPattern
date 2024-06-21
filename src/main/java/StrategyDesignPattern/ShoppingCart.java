package StrategyDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items;
    private PaymentStategy paymentStategy;

    public ShoppingCart() {
        this.items = new ArrayList<>();;
    }

    void addItem(Item item) {
        this.items.add(item);
    }

    void removeItem(Item item) {
        this.items.remove(item);
    }

    int calculateTotal() {
        int total = 0;
        for(Item item : items) {
            total =item.getQuantity() * item.getPrice();
        }
        return total;
    }

    public void pay(PaymentStategy paymentStategy) {
        int total = calculateTotal();
        paymentStategy.pay(total);
    }

}
