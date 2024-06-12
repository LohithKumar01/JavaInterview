package org.example.arrays;

import java.util.Scanner;

public class ReverseOfString {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String inputStr = scanner.next();
        String inputStr = "Java";
        String reverseStr = reverse(inputStr);
        System.out.println("The Reverse String is: " + reverseStr);
    }

    private static String reverse(String inputStr) {
        char[] charArray = inputStr.toCharArray();
        StringBuilder reverseString = new StringBuilder();
        for (int i = charArray.length-1;i>=0;i--) {
            reverseString.append(charArray[i]);
        }
        return reverseString.toString();
    }
}