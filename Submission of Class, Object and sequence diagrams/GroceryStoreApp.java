import java.util.ArrayList;
import java.util.List;

// Product Class
class Product {
    private String name;
    private double pricePerUnit;
    private double quantity;

    // Constructor
    public Product(String name, double pricePerUnit, double quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public double getQuantity() {
        return quantity;
    }

    // Method to calculate the total price for this product
    public double getTotal() {
        return pricePerUnit * quantity;
    }

    // Method to display product details
    public void displayProduct() {
        System.out.println(name + ": " + quantity + " @ $" + pricePerUnit + "/unit, Total: $" + getTotal());
    }
}

// Customer Class
class Customer {
    private String name;
    private List<Product> products; // Composition relationship

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    // Getter
    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    // Method to add a product
    public void addProduct(Product product) {
        products.add(product);
    }

    // Method to display all purchased products
    public void displayProducts() {
        System.out.println("Customer: " + name);
        System.out.println("Purchased Products:");
        for (Product product : products) {
            product.displayProduct();
        }
    }
}

// BillGenerator Class
class BillGenerator {

    // Method to compute the total bill
    public double computeBill(Customer customer) {
        double totalBill = 0;
        for (Product product : customer.getProducts()) {
            totalBill += product.getTotal();
        }
        return totalBill;
    }

    // Method to generate and display the bill
    public void generateBill(Customer customer) {
        System.out.println("\nGenerating Bill for " + customer.getName() + "...");
        customer.displayProducts();
        double totalBill = computeBill(customer);
        System.out.println("\nTotal Bill: $" + totalBill);
    }
}

// Main Class
public class GroceryStoreApp {
    public static void main(String[] args) {
        // Create products
        Product apples = new Product("Apples", 3, 2); // 2 kg @ $3 per kg
        Product milk = new Product("Milk", 2, 1);     // 1 liter @ $2 per liter

        // Create a customer and add products
        Customer customer = new Customer("Alice");
        customer.addProduct(apples);
        customer.addProduct(milk);

        // Generate the bill
        BillGenerator billGenerator = new BillGenerator();
        billGenerator.generateBill(customer);
    }
}
