package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// We mark beans with @Service to indicate that they're holding the business logic.
@Service
public class DepartmentServiceImplementation implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Optional<Department> getDepartmentById(Long id) {
        System.out.println("ID is:"+id);
        return departmentRepository.findById(id);
    }

    @Override
    public Department deleteDepartmentById(Long id) {
        if(!departmentRepository.existsById(id))
        {
            return null;
        }
        Department department = departmentRepository.findById(id).get();
        departmentRepository.deleteById(id);
        return department;
    }
}
