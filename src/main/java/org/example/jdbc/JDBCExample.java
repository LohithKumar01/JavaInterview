package org.example.jdbc;

import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        try {
            //1. Load the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded!");

            //2. Establish Connection.
            String url = "jdbc:mysql://localhost:3306/EmployeeDB";
            String username = "root";
            String password = "root";

            Connection connection = DriverManager.getConnection(url,username,password);

            //3. Create Statement
            Statement statement = connection.createStatement();
            
            //4. Maintaining result Set
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees;");

            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String department = resultSet.getString("department");
                String position = resultSet.getString("position");
                Double salary = resultSet.getDouble("salary");
                System.out.println("Id:" + id + "name: " + name + "department" + department + "position: " + position + "salary: " + salary);
            }
            //5. Closing all resources.
            resultSet.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
