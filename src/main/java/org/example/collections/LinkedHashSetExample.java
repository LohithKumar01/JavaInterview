package org.example.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> nameSet = new LinkedHashSet<>();
        nameSet.add("Anna");
        nameSet.add("Joyce");
        nameSet.add("Joyce");
        nameSet.add("Emma");
        nameSet.add("Kate");
        nameSet.add("Wanda");
        nameSet.add("Wanda");
        System.out.println(nameSet);

        if (nameSet.contains("Joyce")) {
            System.out.println("It has the element.");
        } else {
            System.out.println("Element not found in set.");
        }

        System.out.println(nameSet.isEmpty());

        for (String name : nameSet) {
            System.out.println(name);
        }

        nameSet.remove("Wanda");

        System.out.println(nameSet);
    }
}
//LinkedHashSet is a combination of LinkedList and HashSet.
//It can do operations like add, remove and contains - Maintains insertion order.