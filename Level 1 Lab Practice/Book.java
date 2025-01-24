class Book {
    String title;  // Attribute to store book title
    String author; // Attribute to store book author
    double price;  // Attribute to store book price

    // Constructor to initialize book attributes
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title); // Print book title
        System.out.println("Author: " + author); // Print book author
        System.out.println("Price: " + price); // Print book price
    }

    public static void main(String[] args) {
        // Create a book object with sample data
        Book book = new Book("1984", "George Orwell", 399.99);

        // Call method to display book details
        book.displayDetails();
    }
}
