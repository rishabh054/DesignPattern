package StrategyDesignPattern.PaymentMethod;

import StrategyDesignPattern.PaymentStategy;

public class InternetBanking implements PaymentStategy {
    private String id;
    private String password;

    public InternetBanking(String id, String password) {
        this.id = id;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("payment done with card amount = " + amount);
    }
}
