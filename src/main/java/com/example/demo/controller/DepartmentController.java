package com.example.demo.controller;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/createDepartment")
    public Department createDepartment(@RequestBody Department department)
    {
        System.out.println("Create method called");
        return departmentService.createDepartment(department);
    }
    @GetMapping("/departments")
    public List<Department> getAllDepartments()
    {
        return departmentService.getAllDepartments();
    }
}
