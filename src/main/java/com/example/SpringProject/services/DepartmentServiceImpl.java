package com.example.SpringProject.services;

import com.example.SpringProject.models.Department;
import com.example.SpringProject.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAllDepartments();
    }

    @Override
    public Department getDepartmentById(long departmentId) {
        return departmentRepository.findById(departmentId);
    }

    @Override
    public Department getDepartmentByName(String departmentName) {
        return departmentRepository.findByName(departmentName);
    }


}
