package org.example.oops;


class Car{
    void display(){
        System.out.println("Inside Super Class.");
    }
}

class Bmw extends Car {
    @Override
    void display(){
        System.out.println("Inside BMW");
    }
}

class Merc extends Car {
    @Override
    void display(){
        System.out.println("Inside Mercedes.");
    }
}

public class RunTimePolymorphismExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.display();

        Car bmw = new Bmw();
        bmw.display();

        Car merc = new Merc();
        merc.display();
    }
}
