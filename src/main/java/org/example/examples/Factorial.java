package org.example.examples;

public class Factorial {
    public static void main(String[] args) {
        factorial(10);
    }

    private static void factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of "+ num + " is: " + fact);
    }
}
