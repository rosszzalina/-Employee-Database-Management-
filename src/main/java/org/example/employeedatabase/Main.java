package org.example.employeedatabase;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmplyeeDaata employeeData = new EmplyeeDaata();

        // Create Employee
        Employee newEmployee = new Employee("John Doe", "Developer", 75000.0, (java.sql.Date) new Date(System.currentTimeMillis()));
        employeeData.createEmployee(newEmployee);

        // Get Employee by ID
        Employee employee = employeeData.getEmployeeById(1);
        System.out.println(employee);

        // Get All Employees
        List<Employee> employees = employeeData.getAllEmployees();
        employees.forEach(System.out::println);

        // Update Employee
        if (employee != null) {
            employee.setName("John Smith");
            employeeData.updateEmployee(employee);
        }

        // Delete Employee
        employeeData.deleteEmployee(1);
    }
}

