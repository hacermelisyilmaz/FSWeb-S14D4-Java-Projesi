public class Bread extends ProductForSale{
    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate{" +
                "type='" + getType() + '\'' +
                ", price=" + getPrice() +
                ", description='" + getDescription() + '\'' +
                "}");
    }
}
