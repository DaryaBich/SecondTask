package com.example.SpringProject.repositories;

import com.example.SpringProject.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    @Query(value = "select d from Department d where id=?1")
    Department findById(long id);

    @Query(value = "select d from Department d")
    List<Department> findAllDepartments();

    @Query(value = "select d from Department d where depname=?1")
    Department findByName(String name);
}