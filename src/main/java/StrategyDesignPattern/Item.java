package StrategyDesignPattern;

public class Item {
    private int quantity ;
    private int price;

    public Item(int quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
