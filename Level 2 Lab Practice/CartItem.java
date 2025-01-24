class CartItem {
    String itemName; // Attribute to store item name
    double price;    // Attribute to store item price
    int quantity;    // Attribute to store item quantity

    // Constructor to initialize item details
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate total cost of the item
    double calculateTotalCost() {
        return price * quantity;
    }

    // Method to display item details
    void displayDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        // Create a cart item object
        CartItem item = new CartItem("Laptop", 50000.0, 2);

        // Display item details
        item.displayDetails();
    }
}
