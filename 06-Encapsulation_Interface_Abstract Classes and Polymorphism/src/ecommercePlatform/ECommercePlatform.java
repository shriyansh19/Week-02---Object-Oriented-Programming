package ecommercePlatform;

public class ECommercePlatform {
    // Method to calculate and print final price for a list of products
    public static void printFinalPrices(Product[] products) {
        for (Product product : products) {
            System.out.println("Product Name: " + product.getName());

            double discount = product.calculateDiscount();
            double tax = 0;

            // Check if product is taxable using instanceof
            if (product instanceof Taxable) {
                Taxable taxableProduct = (Taxable) product;
                tax = taxableProduct.calculateTax();
                taxableProduct.getTaxDetails();
            }

            double finalPrice = product.getPrice() + tax - discount;
            System.out.println("Final Price (Price + Tax - Discount): " + finalPrice);
            System.out.println("---------------------------------");
        }
    }

    public static void main(String[] args) {
        // Creating an array of products
        Product[] products = {
                new Electronics(1, "Smartphone", 30000),
                new Clothing(2, "T-Shirt", 500),
                new Groceries(3, "Rice", 1000)
        };

        // Calculating and printing final prices
        printFinalPrices(products);
    }
}
