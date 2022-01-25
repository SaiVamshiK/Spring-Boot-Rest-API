package com.example.demo.repository;

import com.example.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// here we are extending the built in JpaRepository as the Jpa Repository provides us lot of functions to interact with the database
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

}
