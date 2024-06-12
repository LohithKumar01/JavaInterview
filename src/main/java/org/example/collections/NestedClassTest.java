package org.example.collections;

class outer{
    class inner{
        void run(){
            System.out.println("Inside of Outer Class.");
        }
    }
}

public class NestedClassTest {
    public static void main(String[] args) {
        outer o = new outer();
        outer.inner ob = o.new inner();
        ob.run();
    }
}
