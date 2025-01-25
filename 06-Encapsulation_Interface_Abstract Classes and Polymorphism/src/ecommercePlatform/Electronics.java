package ecommercePlatform;

// Concrete class Electronics extending Product and implementing Taxable
class Electronics extends Product implements Taxable {
    // Constructor to initialize Electronics
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Implementation of calculateDiscount method
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.1; // 10% discount
    }

    // Implementation of calculateTax method
    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% tax
    }

    // Implementation of getTaxDetails method
    @Override
    public void getTaxDetails() {
        System.out.println("Electronics tax rate is 18%.");
    }
}
