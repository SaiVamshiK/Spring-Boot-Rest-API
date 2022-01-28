package com.example.demo.repository;

import com.example.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

// here we are extending the built-in JpaRepository as the Jpa Repository provides us lot of functions to interact with the database
// @Repository’s job is to catch persistence-specific exceptions and re-throw them as one of Spring’s unified unchecked exceptions.
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    public Department findByDepartmentNameIgnoreCase(String departmentName);

    public List<Department> findAllByDepartmentNameIgnoreCase(String departmentName);

    public Department findByDepartmentNameStartingWith(String stDeptName);

    @Query(value = "select * from department where department_name=?1",nativeQuery = true)
    public List<Department> getDepartmentByCustomDname(String departmentName);

    @Query(value = "select * from department order by department_name",nativeQuery = true)
    public List<Department> getDepartmentsSorted();

    List<Department> findByDepartmentNameAndDepartmentAddress(String departmentName, String departmentAdd);
}
