public class Store {
    public static void main(String[] args) {

        listProducts();
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product: products) {
            product.showDetails();
        }
    }
}