class Item {
    int itemCode;    // Attribute to store item code
    String itemName; // Attribute to store item name
    double price;    // Attribute to store item price

    // Constructor to initialize item attributes
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    void displayDetails() {
        System.out.println("Item Details:");
        System.out.println("Item Code: " + itemCode); // Print item code
        System.out.println("Item Name: " + itemName); // Print item name
        System.out.println("Price: " + price);        // Print item price
    }

    // Method to calculate total cost for a given quantity
    double calculateTotalCost(int quantity) {
        return price * quantity; // Multiply price by quantity
    }

    public static void main(String[] args) {
        // Create an item object with sample data
        Item item = new Item(101, "Laptop", 50000.0);

        // Display item details
        item.displayDetails();

        // Calculate and display total cost for 3 units
        System.out.println("Total Cost for 3 units: " + item.calculateTotalCost(3));
    }
}
