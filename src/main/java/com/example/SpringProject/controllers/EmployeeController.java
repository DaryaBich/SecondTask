package com.example.SpringProject.controllers;

import com.example.SpringProject.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/employee",
        produces = {APPLICATION_JSON_UTF8_VALUE,
                APPLICATION_JSON_VALUE})
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/getAll",
            method = RequestMethod.GET)
    public ResponseEntity<Object> getAll() {
        return ResponseEntity.ok().body(employeeService.getAllEmployees());
    }

    @RequestMapping(value = "/getById/{id}",
            method = RequestMethod.GET)
    public ResponseEntity<Object> getById(
            @PathVariable(value = "id") Long id) {
        return ResponseEntity.ok().body(employeeService.getById(id));
    }

    @RequestMapping(value = "/getByName/{name}", method = RequestMethod.GET)
    public ResponseEntity<Object> getByName(@PathVariable(value = "name") String name) {
        return ResponseEntity.ok().body(employeeService.getByName(name));
    }

    @RequestMapping(value = "/getByDepId/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getByDepId(@PathVariable(value = "depId") Long depId) {
        return ResponseEntity.ok().body(employeeService.getByDepId(depId));
    }

    @RequestMapping(value = "/getByFirstName/{firstName}", method = RequestMethod.GET)
    public ResponseEntity<Object> getByFirstName(@PathVariable(value = "firstName") String firstName) {
        return ResponseEntity.ok().body(employeeService.getByFirstName(firstName));
    }

    @RequestMapping(value = "/getBySalary/{min}", method = RequestMethod.GET)
    public ResponseEntity<Object> getBySalary(@PathVariable(value = "min") Double min) {
        return ResponseEntity.ok().body(employeeService.getWithSalaryMore(min));
    }

}
