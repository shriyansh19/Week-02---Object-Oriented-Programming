package libraryManagementSystem;

// Subclass Magazine
class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable;

    // Constructor for Magazine
    public Magazine(String itemId, String title, String author, boolean isAvailable) {
        super(itemId, title, author);
        this.isAvailable = isAvailable;
    }

    // Implementation of getLoanDuration
    @Override
    public int getLoanDuration() {
        return 7; // Magazines have a loan duration of 7 days
    }

    // Implementation of reserveItem
    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Magazine reserved successfully.");
        } else {
            System.out.println("Magazine is currently not available.");
        }
    }

    // Implementation of checkAvailability
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
