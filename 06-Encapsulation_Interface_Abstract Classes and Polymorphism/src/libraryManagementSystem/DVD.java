package libraryManagementSystem;

// Subclass DVD
class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable;

    // Constructor for DVD
    public DVD(String itemId, String title, String author, boolean isAvailable) {
        super(itemId, title, author);
        this.isAvailable = isAvailable;
    }

    // Implementation of getLoanDuration
    @Override
    public int getLoanDuration() {
        return 3; // DVDs have a loan duration of 3 days
    }

    // Implementation of reserveItem
    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("DVD reserved successfully.");
        } else {
            System.out.println("DVD is currently not available.");
        }
    }

    // Implementation of checkAvailability
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

