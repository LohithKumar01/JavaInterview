package org.example.examples;

public class Employee{
    private int empId;
    private String empName;
    private String deptName;

    public Employee(String deptName, int empId, String empName) {
        this.deptName = deptName;
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void displayEmployeeDetails(){
        System.out.println("Employee Id: " + empId + " Employee Name: " + empName 
        + " Employee Working Department: " + deptName);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Finance", 201, "Tony");

        employee.displayEmployeeDetails();

        employee.setDeptName("Sales");
        System.out.println("Department: " + employee.getDeptName());
    }
}