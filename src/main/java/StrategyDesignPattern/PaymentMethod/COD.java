package StrategyDesignPattern.PaymentMethod;

import StrategyDesignPattern.PaymentStategy;

public class COD implements PaymentStategy {
    int rupees;

    public COD(int rupees) {
        this.rupees = rupees;
    }

    @Override
    public void pay(int amount) {
        System.out.println("payment done with COD amount = " + amount);
    }
}
