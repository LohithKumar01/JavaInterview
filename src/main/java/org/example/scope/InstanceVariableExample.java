package org.example.scope;

class Engine {
    int horsepower;

    Engine(int horsepower) {
        this.horsepower = horsepower;
    }
}

class Vehicle {
    String brand;
    Engine engine;

    Vehicle(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    void displayCarDetails() {
        System.out.println("The name of the brand is: " + brand + " and Horsepower is: " + engine.horsepower);
    }
}

public class InstanceVariableExample {
    public static void main(String[] args) {
        Engine engine = new Engine(3000);
        Vehicle car = new Vehicle("BMW", engine);
        car.displayCarDetails();
    }
}
