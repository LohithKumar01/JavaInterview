package org.example.examples;

public class ReverseOfString {
    public static void main(String[] args) {
        String str = "Lohith";
        String reverse = "";
        for(int i = str.length() - 1; i>= 0 ;i--){
            reverse += str.charAt(i);
        }
        System.out.println("Reverse of String: " + reverse.toLowerCase());
    }
}
