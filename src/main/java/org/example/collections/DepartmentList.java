package org.example.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DepartmentList {
    public static void main(String[] args) {
        List<String> departmentList = Arrays.asList("Finance","Sales","Hr","Designer","Developer","Security");
        iteration1(departmentList);
        iteration2(departmentList);
    }

    private static void iteration1(List<String> departmentList) {
        for (String dept : departmentList) {
            System.out.println(dept);
        }
        System.out.println();
    }

    private static void iteration2(List<String> departmentList) {
        Iterator<String> it = departmentList.iterator();
        while (it.hasNext()) {
            String dept =  it.next();
            System.out.println(dept);
        }
    }
}
