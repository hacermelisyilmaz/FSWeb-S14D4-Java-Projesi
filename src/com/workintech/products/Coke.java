package com.workintech.products;

public class Coke extends ProductForSale{
    private int volume;
    public Coke(String type, double price, String description, int volume) {
        super(type, price, description);
        this.volume = volume;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Coke{" +
                "volume=" + volume +
                '}';
    }
}
