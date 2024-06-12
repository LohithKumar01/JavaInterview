package org.example.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Name:");
        for(int i=1;i<=10;i++){
            list.add(s.next());
        }
        System.out.println("The list contains: " + list);
    }
}
