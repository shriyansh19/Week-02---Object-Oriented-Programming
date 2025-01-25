package onlineFoodDeliverySystem;

// Subclass VegItem
class VegItem extends FoodItem implements Discountable {
    private double discount; // Stores the applied discount

    // Constructor for VegItem
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0.0;
    }

    // Implementation of calculateTotalPrice
    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) - discount;
    }

    // Implementation of applyDiscount
    @Override
    public void applyDiscount(double discountPercentage) {
        this.discount = (getPrice() * getQuantity()) * (discountPercentage / 100);
    }

    // Implementation of getDiscountDetails
    @Override
    public double getDiscountDetails() {
        return discount;
    }
}
