package com.example.SpringProject.controllers;

import com.example.SpringProject.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/department",
        produces = {APPLICATION_JSON_UTF8_VALUE,
                APPLICATION_JSON_VALUE})
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/getAll",
            method = RequestMethod.GET)
    public ResponseEntity<Object> getAllDepartments() {
        return ResponseEntity.ok().body(departmentService.getAllDepartments());
    }

    @RequestMapping(value = "/getById/{id}",
            method = RequestMethod.GET)
    public ResponseEntity<Object> getById(
            @PathVariable(value = "id") Long id) {
        return ResponseEntity.ok().body(departmentService.getDepartmentById(id));
    }

    @RequestMapping(value = "/getByName/{name}", method = RequestMethod.GET)
    public ResponseEntity<Object> getByName(@PathVariable(value = "name") String name) {
        return ResponseEntity.ok().body(departmentService.getDepartmentByName(name));
    }
}
