package onlineFoodDeliverySystem;

// Subclass NonVegItem
class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge; // Stores additional non-veg charges
    private double discount;         // Stores the applied discount

    // Constructor for NonVegItem
    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
        this.discount = 0.0;
    }

    // Implementation of calculateTotalPrice
    @Override
    public double calculateTotalPrice() {
        return ((getPrice() * getQuantity()) + additionalCharge) - discount;
    }

    // Implementation of applyDiscount
    @Override
    public void applyDiscount(double discountPercentage) {
        this.discount = ((getPrice() * getQuantity()) + additionalCharge) * (discountPercentage / 100);
    }

    // Implementation of getDiscountDetails
    @Override
    public double getDiscountDetails() {
        return discount;
    }
}
