package ecommercePlatform;

// Concrete class Clothing extending Product and implementing Taxable
class Clothing extends Product implements Taxable {
    // Constructor to initialize Clothing
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Implementation of calculateDiscount method
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.2; // 20% discount
    }

    // Implementation of calculateTax method
    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% tax
    }

    // Implementation of getTaxDetails method
    @Override
    public void getTaxDetails() {
        System.out.println("Clothing tax rate is 5%.");
    }
}
