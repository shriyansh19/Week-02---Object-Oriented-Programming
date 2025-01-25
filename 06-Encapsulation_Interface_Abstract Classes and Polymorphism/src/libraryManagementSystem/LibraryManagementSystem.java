package libraryManagementSystem;

// Main class
public class LibraryManagementSystem {
    // Method to process and display details of all library items
    public static void processLibraryItems(LibraryItem[] items) {
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            // Check if the item is reservable
            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                System.out.println("Availability: " + (reservableItem.checkAvailability() ? "Available" : "Not Available"));
                reservableItem.reserveItem();
                System.out.println("Availability after reservation: " + (reservableItem.checkAvailability() ? "Available" : "Not Available"));
            }

            System.out.println("------------------------------------");
        }
    }

    public static void main(String[] args) {
        // Create instances of Book, Magazine, and DVD
        LibraryItem[] items = {
                new Book("B001", "The Song of Ice and Fire", "George R R Martin", true),
                new Magazine("M001", "National Geographic", "Various Authors", true),
                new DVD("D001", "Inception", "Christopher Nolan", false)
        };

        // Process the library items
        processLibraryItems(items);
    }
}
