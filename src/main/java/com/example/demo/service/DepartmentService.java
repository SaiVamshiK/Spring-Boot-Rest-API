package com.example.demo.service;

import com.example.demo.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DepartmentService {
    Department createDepartment(Department department);

    List<Department> getAllDepartments();
}
