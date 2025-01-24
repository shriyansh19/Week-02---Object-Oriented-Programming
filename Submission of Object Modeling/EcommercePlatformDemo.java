import java.util.ArrayList;

// Represents a product in the e-commerce platform
class Product {
    private String name; // Name of the product

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Represents an order placed by a customer
class Order {
    private int orderId; // Unique ID for the order
    private ArrayList<Product> products; // List of products in the order

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    // Adds a product to the order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Displays all products in the order
    public void displayProducts() {
        System.out.println("Products in Order " + orderId + ":");
        for (Product product : products) {
            System.out.println("- " + product.getName());
        }
    }
}

// Represents a customer in the e-commerce platform
class Customer {
    private String name; // Name of the customer
    private ArrayList<Order> orders; // List of orders placed by the customer

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Places an order
    public void placeOrder(Order order) {
        orders.add(order);
    }

    // Displays all orders placed by the customer
    public void displayOrders() {
        System.out.println("Orders placed by " + name + ":");
        for (Order order : orders) {
            order.displayProducts();
        }
    }
}

public class EcommercePlatformDemo {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop");
        Product product2 = new Product("Smartphone");
        Product product3 = new Product("Headphones");

        // Create customers
        Customer customer1 = new Customer("Lin Dan");
        Customer customer2 = new Customer("Sebestian Vettal");

        // Create orders
        Order order1 = new Order(1);
        Order order2 = new Order(2);

        // Add products to orders
        order1.addProduct(product1);
        order1.addProduct(product2);

        order2.addProduct(product3);

        // Place orders for customers
        customer1.placeOrder(order1);
        customer2.placeOrder(order2);

        // Display orders for each customer
        customer1.displayOrders();
        customer2.displayOrders();
    }
}
