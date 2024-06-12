package org.example.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTable {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        int num = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + (num * i));
        }
    }
}
