package org.example.collections;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    public static void main(String[] args) {
        List<String> employeeList = new ArrayList<>();
        employeeList.add("Lohith");
        employeeList.add("Krish");
        employeeList.add("Tony");
        employeeList.add("Jane");

        System.out.println(employeeList);
    }
}
