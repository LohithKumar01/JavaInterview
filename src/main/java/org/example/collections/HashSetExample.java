package org.example.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> deptNameSet = new HashSet<>();
        deptNameSet.add("Sales");
        deptNameSet.add("Finance");
        deptNameSet.add("Marketing");
        deptNameSet.add("HR");
        deptNameSet.add("Operations");
        deptNameSet.add("Academics");
        deptNameSet.add("IT");
        System.out.println(deptNameSet);

        for (String dept : deptNameSet){
            System.out.print(dept + " ");
        }
    }
}
//It stores the value as per the hashtable. Doesn't maintain insertion order.