// Parent class
class Animal {
    // Method to be overridden
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class PolymorphismDemo {
    public static void main(String[] args) {
        
        // Reference of parent, object of child (Polymorphism)
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.makeSound();  // Calls Dog's method
        a2.makeSound();  // Calls Cat's method
    }
}
