package com.example.SpringProject.services;

import com.example.SpringProject.models.Department;
import com.example.SpringProject.models.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee getById(long employeeId);

    Employee getByName(String employeeName);

    List<Employee> getByDepId(Long departmentId);

    List<Employee> getWithSalaryMore(Double minSalary);

    List<Employee> getByFirstName(String fisrtName);
}
