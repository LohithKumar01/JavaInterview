package org.example.arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] numArray = {10,36,74,20,87,11,2};
        int max = numArray[0];
        for (int i =0; i<= numArray.length -1; i++) {
            if(numArray[i] > max){
                max = numArray[i];
            }
        }
        System.out.println("Largest Number is: " + max);
    }
}
