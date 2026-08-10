class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() { System.out.println("Woof!"); }
}

class Cat extends Animal {
    @Override
    void makeSound() { System.out.println("Meow!"); }
}

class Bird extends Animal {
    @Override
    void makeSound() { System.out.println("Tweet!"); }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat(), new Bird() };
        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
