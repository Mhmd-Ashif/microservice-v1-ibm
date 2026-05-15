package com.ibm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.model.Department;
import com.ibm.services.DepartmentServiceImp;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/dept")
public class DepartmentController {
	private final DepartmentServiceImp departmentService;
	
	@GetMapping("/{id}")
	public Department getDeptById(@PathVariable Long id) {
		return departmentService.getDept(id);
	}
	
	@PostMapping
	public String createDept(@RequestBody Department dept) {
		return departmentService.createDept(dept);
	}

	@GetMapping("/getdept/{deptname}")
	public Department getDept(@PathVariable String deptname){
		return departmentService.getDeptByName(deptname);
	}

	@GetMapping("/test")
	public String test() {
		return "WORKING ✅";
	}

}
