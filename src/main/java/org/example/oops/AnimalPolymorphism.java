package org.example.oops;

abstract class Animal{
    public abstract void makeSound();
}

class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Inside Dog");
    }
}

class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}

public class AnimalPolymorphism{
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();

        Animal cat = new Cat();
        cat.makeSound();
    }
}