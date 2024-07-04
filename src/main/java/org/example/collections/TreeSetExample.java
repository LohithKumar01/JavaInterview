package org.example.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numberSet = new TreeSet<>();
        numberSet.add(2);
        numberSet.add(15);
        numberSet.add(29);
        numberSet.add(37);
        numberSet.add(52);
        numberSet.add(95);

        numberSet.remove(2);
        System.out.println(numberSet);

        System.out.println("First Element: " + numberSet.first());

        numberSet.pollFirst();
        numberSet.pollLast();
    }
}
//Maintains insertion order and no duplicate elements.