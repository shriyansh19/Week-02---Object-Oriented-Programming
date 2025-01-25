package ecommercePlatform;

// Concrete class Groceries extending Product
class Groceries extends Product {
    // Constructor to initialize Groceries
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Implementation of calculateDiscount method
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}