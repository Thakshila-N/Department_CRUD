package com.departmentcrud.deparmentcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.departmentcrud.deparmentcrud.entity.Department;
import com.departmentcrud.deparmentcrud.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService depService;

	// Save data into database
	@PostMapping("/department")
	public Department saveDep(@RequestBody Department dep) {
		System.out.println("Received department: " + dep);
		return depService.saveDep(dep);
	}

	// fetch data from the database
	@GetMapping("/departments")
	public List<Department> fetchDep() {
		return depService.fetchDep();
	}

	// fetch data by id
	@GetMapping("/department/id/{id}")
	public Department fetchDepByID(@PathVariable("id") Long depId) {
		return depService.fetchDataById(depId);

	}

	//fetch data by name
	@GetMapping("/department/name/{name}")
	public Department fetchDepByName(@PathVariable("name") String name) {
		return depService.fetchDataByName(name);
	}

}
