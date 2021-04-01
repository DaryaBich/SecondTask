package com.example.SpringProject.repositories;

import com.example.SpringProject.models.Department;
import com.example.SpringProject.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query(value = "select e from Employee e where id=?1")
    Employee findById(long id);

    @Query(value = "select e from Employee e")
    List<Employee> findAllEmployee();

    @Query(value = "select e from Employee e where empname=?1")
    Employee findByName(String name);

    @Query(value = "select e from Employee e where depid=?1")
    List<Employee> findByDepId(Long depId);

    @Query(value = "select e from Employee e where salary > ?1")
    List<Employee> findWithSalaryMore(Double minSalary);

    @Query(value = "select e from Employee e where empname like concat(concat('%', ?1), '%')")
    List<Employee> findByFirstName(String firstName);
}
