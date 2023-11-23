package com.workintech.products;

public class Chocolate extends ProductForSale{
    private int weight;

    public Chocolate(String type, double price, String description, int weight) {
        super(type, price, description);
        this.weight = weight;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "weight=" + weight +
                '}';
    }
}
