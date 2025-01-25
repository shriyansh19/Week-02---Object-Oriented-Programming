package onlineFoodDeliverySystem;

// Main class
public class OnlineFoodDeliverySystem {
    // Method to process and display details of food items
    public static void processOrder(FoodItem[] items) {
        for (FoodItem item : items) {
            item.getItemDetails();
            System.out.println("Total Price (before discount): ₹" + item.calculateTotalPrice());

            // Check if item is discountable
            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                discountableItem.applyDiscount(10); // Applying a 10% discount
                System.out.println("Discount Applied: ₹" + discountableItem.getDiscountDetails());
                System.out.println("Total Price (after discount): ₹" + item.calculateTotalPrice());
            }

            System.out.println("------------------------------------");
        }
    }

    public static void main(String[] args) {
        // Create instances of VegItem and NonVegItem
        FoodItem[] items = {
                new VegItem("Paneer Butter Masala", 500, 2),
                new NonVegItem("Chicken Biryani", 799, 3, 5.0)
        };

        // Process the order
        processOrder(items);
    }
}
