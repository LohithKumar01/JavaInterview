package org.example.strings;

public class StringHashCodeCheck {
    public static void main(String[] args) {
        String str1 = "Robin";
        String str2 = "Lohith";

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        String str = new String("llll");
        System.out.println(str.hashCode());
    }
}
