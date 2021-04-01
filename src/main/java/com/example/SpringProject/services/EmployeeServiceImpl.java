package com.example.SpringProject.services;

import com.example.SpringProject.models.Department;
import com.example.SpringProject.models.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Employee getEmployeeById(long employeeId) {
        return null;
    }

    @Override
    public Employee getByEmployeeName(String employeeName) {
        return null;
    }


    @Override
    public void addNewEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployeeById(long employeeId) {

    }
}
