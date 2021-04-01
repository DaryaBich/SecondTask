package com.example.SpringProject.services;

import com.example.SpringProject.repositories.EmployeeRepository;
import com.example.SpringProject.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAllEmployee();
    }

    @Override
    public Employee getById(long employeeId) {
        return employeeRepository.findById(employeeId);
    }

    @Override
    public Employee getByName(String employeeName) {
        return employeeRepository.findByName(employeeName);
    }

    @Override
    public List<Employee> getByDepId(Long departmentId) {
        return employeeRepository.findByDepId(departmentId);
    }

    @Override
    public List<Employee> getWithSalaryMore(Double minSalary) {
        return employeeRepository.findWithSalaryMore(minSalary);
    }

    @Override
    public List<Employee> getByFirstName(String fisrtName) {
        return employeeRepository.findByFirstName(fisrtName);
    }


}
