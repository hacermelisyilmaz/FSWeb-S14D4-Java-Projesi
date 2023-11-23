public class Chocolate extends ProductForSale{
    private int weight;

    public Chocolate(String type, double price, String description, int weight) {
        super(type, price, description);
        this.weight = weight;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate{" +
            "type='" + getType() + '\'' +
                    ", price=" + getPrice() +
                    ", description='" + getDescription() + '\'' +
                    ", weight='" + getWeight() + '\'' +
                    "}");
    }

    public int getWeight() {
        return weight;
    }
}
