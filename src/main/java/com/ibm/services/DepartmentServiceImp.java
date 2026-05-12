package com.ibm.services;

import org.springframework.stereotype.Service;

import com.ibm.model.Department;
import com.ibm.repository.DepartmentRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DepartmentServiceImp implements DepartmentService {
	private final DepartmentRepository departmentRepo;
	
	@Override
	public Department getDept(Long id) {
		Department dept = departmentRepo.findById(id).orElseThrow(()->new EntityNotFoundException("Department not found"));
		return dept;
	}

	public String createDept(Department dept) {
		// TODO Auto-generated method stub
		Department data = departmentRepo.save(dept);
		if(data != null) {
			return "Data Inserted Successfully ✅";
		}
		return "Data is not inserted ❌";
	}

	public Department getDeptByName(String deptname) {
		Department dept = departmentRepo.findDepartmentByDepartmentName(deptname);
		if (dept == null) {
			throw new EntityNotFoundException("Department not found");
		}
		return dept;
	}
}
