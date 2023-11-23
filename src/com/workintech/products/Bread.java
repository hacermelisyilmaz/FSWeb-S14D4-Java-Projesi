package com.workintech.products;

public class Bread extends ProductForSale{
    private boolean isSliced;
    public Bread(String type, double price, String description, boolean isSliced) {
        super(type, price, description);
        this.isSliced = isSliced;
    }

    @Override
    public void showDetails() {
        System.out.println("com.workintech.products.Bread{" +
                "type='" + getType() + '\'' +
                ", price=" + getPrice() +
                ", description='" + getDescription() + '\'' +
                ", is sliced='" + isSliced() + '\'' +
                "}");
    }

    public boolean isSliced() {
        return isSliced;
    }
}
