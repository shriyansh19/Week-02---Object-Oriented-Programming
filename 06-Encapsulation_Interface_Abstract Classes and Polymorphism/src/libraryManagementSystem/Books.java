package libraryManagementSystem;

// Subclass Book
class Book extends LibraryItem implements Reservable {
    private boolean isAvailable;

    // Constructor for Book
    public Book(String itemId, String title, String author, boolean isAvailable) {
        super(itemId, title, author);
        this.isAvailable = isAvailable;
    }

    // Implementation of getLoanDuration
    @Override
    public int getLoanDuration() {
        return 14; // Books have a loan duration of 14 days
    }

    // Implementation of reserveItem
    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is currently not available.");
        }
    }

    // Implementation of checkAvailability
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
