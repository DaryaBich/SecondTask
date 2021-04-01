package com.example.SpringProject;

import com.example.SpringProject.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByEmployeeId(long id);
}
