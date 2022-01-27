package com.example.demo.service;

import com.example.demo.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    Department createDepartment(Department department);

    List<Department> getAllDepartments();

    Optional<Department> getDepartmentById(Long id);

    Department deleteDepartmentById(Long id);

    Department updateDepartmentById(Long id, Department department);

    Department getDepartmentByName(String departmentName);

    List<Department> getAllDepartmentsByName(String departmentName);

    Department getDepartmentStartingByName(String stDeptName);

    List<Department> getDepartmentByCustomDname(String departmentName);
}
