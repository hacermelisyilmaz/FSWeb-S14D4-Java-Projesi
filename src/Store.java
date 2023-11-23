public class Store {
    public static void main(String[] args) {
        ProductForSale products[] = new ProductForSale[]{
                new Chocolate("dark", 10, "60% Dutch cocoa", 100),
                new Bread("whole wheat", 6, "entirely milled from whole wheat grains", false),
                new Coke("zero", 2, "zero sugar", 330)
        };
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product: products) {
            product.showDetails();
        }
    }
}