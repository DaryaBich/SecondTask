package com.example.SpringProject.services;

import com.example.SpringProject.models.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartments();

    Department getDepartmentById(long departmentId);

    Department getDepartmentByName(String departmentName);

    void addNewDepartment(Department department);

    void deleteDepartmentById(long departmentId);

}
