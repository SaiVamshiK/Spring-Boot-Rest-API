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
    @PutMapping("/updateDepartment/{did}")
    public Department updateDepartmentById(@PathVariable("did") Long id,@RequestBody Department department){
        System.out.println("Update for id called:"+id);
        return departmentService.updateDepartmentById(id,department);
    }
    @GetMapping("/department/name/{name}")
    public Department getDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.getDepartmentByName(departmentName);
    }
    @GetMapping("/departments/name/{name}")
    public List<Department> getAllDepartmentsByName(@PathVariable("name") String departmentName){
        return departmentService.getAllDepartmentsByName(departmentName);
    }
    // https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods = Custom Query Methods.
    @GetMapping("/department/stname/{name}")
    public Department getDepartmentStartingByName(@PathVariable("name") String stDeptName)
    {
        return departmentService.getDepartmentStartingByName(stDeptName);
    }
    @GetMapping("/department/customName/{dname}")
    public List<Department> getDepartmentByCustomDname(@PathVariable("dname") String departmentName){
        return departmentService.getDepartmentByCustomDname(departmentName);
    }
    @GetMapping("/department/sorted")
    public List<Department> getDepartmentsSorted(){
        return departmentService.getDepartmentsSorted();
    }
    @GetMapping("/department/name/{dname}/add/{dadd}")
    public List<Department> getDeptByNameAdd(@PathVariable("dname") String departmentName,@PathVariable("dadd") String departmentAdd){
        return departmentService.getDeptByNameAdd(departmentName,departmentAdd);
    }
}















