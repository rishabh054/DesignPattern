package StrategyDesignPattern;

import StrategyDesignPattern.PaymentMethod.COD;
import StrategyDesignPattern.PaymentMethod.Card;
import StrategyDesignPattern.PaymentMethod.InternetBanking;

public class StrategyPatternDemo {
    public static void main (String[] args) {

        Item item = new Item(5, 5);
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(item);

        cart.pay(new Card("123", "Rishabh", 123));
        cart.pay(new COD(123));
        cart.pay(new InternetBanking("id", "pass"));


    }

}
