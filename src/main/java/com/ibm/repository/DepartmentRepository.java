package com.ibm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findDepartmentByDepartmentName(String departmentName);
}
