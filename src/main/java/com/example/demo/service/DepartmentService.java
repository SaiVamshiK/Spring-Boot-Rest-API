package com.example.demo.service;

import com.example.demo.entity.Department;
import org.springframework.stereotype.Service;

public interface DepartmentService {
    Department createDepartment(Department department);
}
