package org.example.collections;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {
    public static void main(String[] args) {
        Map<Integer,String> employeeDetailsMap = new HashMap<>();   //Ordered Map.
        employeeDetailsMap.put(001, "Robin");
        employeeDetailsMap.put(002, "Mike");
        employeeDetailsMap.put(005, "El");
        employeeDetailsMap.put(003, "Dustin");
        employeeDetailsMap.put(004, "Steve");

        System.out.println(employeeDetailsMap);

        System.out.println(employeeDetailsMap.containsValue("Elm"));
    }
}
