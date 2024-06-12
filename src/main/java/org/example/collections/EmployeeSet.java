package org.example.collections;

import java.util.HashSet;
import java.util.Set;

public class EmployeeSet {
    public static void main(String[] args) {
        Set<String> employeeSet = new HashSet<>();
        employeeSet.add("Tony Stark");
        employeeSet.add("Morgan Stark");
        employeeSet.add("Pepper Potts");
        employeeSet.add("Happy Hogan");
        employeeSet.add("Peter Parker");

        System.out.println("Employee: " + employeeSet);

        if(employeeSet.contains("Tony Stark")){
            System.out.println("Not after END GAME:(");
        }

        System.out.println(employeeSet.remove("Tony Stark"));

        System.out.println(employeeSet);
    }
}
