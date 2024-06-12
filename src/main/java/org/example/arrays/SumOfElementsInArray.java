package org.example.arrays;

public class SumOfElementsInArray {
    public static void main(String[] args) {
        int[] numArray = {1,2,3,4,5};
        int sum = 0;
        for(int num: numArray){
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);
    }
}
