package com.departmentcrud.deparmentcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.departmentcrud.deparmentcrud.entity.Department;
import com.departmentcrud.deparmentcrud.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService depService;
	
	@PostMapping("/department")
	public Department saveDep(@RequestBody Department dep) {
		System.out.println("Received department: " + dep);
		return depService.saveDep(dep);
	}

}
