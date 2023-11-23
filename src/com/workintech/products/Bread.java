package com.workintech.products;

public class Bread extends ProductForSale{
    private boolean isSliced;
    public Bread(String type, double price, String description, boolean isSliced) {
        super(type, price, description);
        this.isSliced = isSliced;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);
    }

    public boolean isSliced() {
        return isSliced;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "isSliced=" + isSliced +
                '}';
    }
}
