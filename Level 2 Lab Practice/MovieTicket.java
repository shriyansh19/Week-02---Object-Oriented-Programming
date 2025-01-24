class MovieTicket {
    String movieName; // Attribute to store movie name
    int seatNumber;   // Attribute to store seat number
    double price;     // Attribute to store ticket price

    // Constructor to initialize ticket details
    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = -1; // Seat not assigned yet
        this.price = 0.0;     // Price not set yet
    }

    // Method to book a ticket
    void bookTicket(int seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket Booked Successfully!");
    }

    // Method to display ticket details
    void displayDetails() {
        System.out.println("Movie Ticket Details:");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        // Create a movie ticket object
        MovieTicket ticket = new MovieTicket("Inception");

        // Book a ticket
        ticket.bookTicket(25, 250.0);

        // Display ticket details
        ticket.displayDetails();
    }
}
