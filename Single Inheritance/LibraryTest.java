// Superclass: Book
class Book {
    String title;
    int publicationYear;

    // Constructor
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Title: " + title + ", Published Year: " + publicationYear);
    }
}

// Subclass: Author
class Author extends Book {
    String name;
    String bio;

    // Constructor
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Method to display author and book details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

// Test the Library Management System
public class LibraryTest {
    public static void main(String[] args) {
        Author author = new Author("Effective Java", 2008, "Joshua Bloch", "Renowned computer scientist, author of many books on Java.");
        author.displayInfo();
    }
}
