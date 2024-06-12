package org.example.examples;

public class FabonacciSeries {
    public static void main(String[] args) {
        fabinocci(15);
    }

    public static void fabinocci(int num) {
        int prev = 0, next = 1;
        System.out.print(prev);
        System.out.print("\t" + next);
        for (int i = 0; i <= num; i++) {
            int nextNumber = prev + next;
            prev = next;
            next = nextNumber;
            System.out.print("\t" + next);
        }
    }
}
