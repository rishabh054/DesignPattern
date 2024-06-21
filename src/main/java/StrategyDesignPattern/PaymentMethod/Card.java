package StrategyDesignPattern.PaymentMethod;

import StrategyDesignPattern.PaymentStategy;

public class Card implements PaymentStategy {
    private String cardNo;
    private String CardHolderName;
    private int pin;

    public Card(String cardNo, String cardHolderName, int pin) {
        this.cardNo = cardNo;
        CardHolderName = cardHolderName;
        this.pin = pin;
    }

    @Override
    public void pay(int amount) {
        System.out.println("payment done with card amount = " + amount);
    }
}
