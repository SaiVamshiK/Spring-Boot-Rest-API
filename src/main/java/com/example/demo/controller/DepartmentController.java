package com.example.demo.controller;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/department/{did}")
    public Optional<Department> getDepartmentById(@PathVariable("did") Long id)
    {
        System.out.println("ID is:"+id);
        return departmentService.getDepartmentById(id);
    }
    @DeleteMapping("/delDepartment/{did}")
    public Department deleteDepartmentById(@PathVariable("did") Long id)
    {
        System.out.println("ID is:"+id);
        return departmentService.deleteDepartmentById(id);
    }
}
