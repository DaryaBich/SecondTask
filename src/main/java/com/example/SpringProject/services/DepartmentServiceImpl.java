package com.example.SpringProject.services;

import com.example.SpringProject.models.Department;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Override
    public List<Department> getAllDepartments() {
        return null;
    }

    @Override
    public Department getDepartmentById(long departmentId) {
        return null;
    }

    @Override
    public Department getDepartmentByName(String departmentName) {
        return null;
    }

    @Override
    public void addNewDepartment(Department department) {

    }

    @Override
    public void deleteDepartmentById(long departmentId) {

    }
}
