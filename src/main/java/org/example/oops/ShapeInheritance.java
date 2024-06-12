package org.example.oops;

class Shape{
    public void draw(){
        System.out.println("Draws a Shape.");
    }
}

class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Draws a Circle.");
    }
}

class Rectangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a Rectangle.");
    }
}

public class ShapeInheritance {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();

        Shape circle = new Circle();
        circle.draw();

        Shape rectangle = new Rectangle();
        rectangle.draw();
    }
}
