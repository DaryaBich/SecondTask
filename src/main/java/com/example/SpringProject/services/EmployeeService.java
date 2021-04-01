package com.example.SpringProject.services;

import com.example.SpringProject.models.Department;
import com.example.SpringProject.models.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee getEmployeeById(long employeeId);

    Employee getByEmployeeName(String employeeName);

    void addNewEmployee(Employee employee);

    void deleteEmployeeById(long employeeId);
}
