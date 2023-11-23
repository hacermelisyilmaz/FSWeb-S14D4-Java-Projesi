public class Coke extends ProductForSale{
    private int volume;
    public Coke(String type, double price, String description, int volume) {
        super(type, price, description);
        this.volume = volume;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke{" +
                "type='" + getType() + '\'' +
                ", price=" + getPrice() +
                ", description='" + getDescription() + '\'' +
                ", volume='" + getVolume() + '\'' +
                "}");
    }

    public int getVolume() {
        return volume;
    }
}
