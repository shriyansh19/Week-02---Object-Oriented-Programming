// Interface: Worker
interface Worker {
    void performDuties();
}

// Superclass: Person
class Person {
    String name;
    int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Subclass: Chef (implements Worker)
class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Cooking food in the kitchen.");
    }
}

// Subclass: Waiter (implements Worker)
class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Serving food to customers.");
    }
}

// Test the Restaurant Management System
public class RestaurantTest {
    public static void main(String[] args) {
        Chef chef = new Chef("John", 1);
        Waiter waiter = new Waiter("Alice", 2);
        
        chef.performDuties();
        waiter.performDuties();
    }
}
