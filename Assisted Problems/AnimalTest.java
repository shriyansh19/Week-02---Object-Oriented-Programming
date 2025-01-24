// Superclass: Animal
class Animal {
    String name;
    int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

// Subclass: Dog
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    // Override the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

// Subclass: Cat
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    // Override the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Subclass: Bird
class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    // Override the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }
}

// Test the Animal Hierarchy
public class AnimalTest {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy", 3);
        Animal myCat = new Cat("Whiskers", 2);
        Animal myBird = new Bird("Tweety", 1);

        myDog.makeSound();
        myCat.makeSound();
        myBird.makeSound();
    }
}
