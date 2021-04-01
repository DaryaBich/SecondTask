package com.example.SpringProject;

import com.example.SpringProject.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

@Transactional
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    @Query("select * from employee where")
    Department findByEDepartmentId(long id);
}
