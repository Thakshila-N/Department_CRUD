package com.departmentcrud.deparmentcrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.departmentcrud.deparmentcrud.entity.Department;
import com.departmentcrud.deparmentcrud.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository depRepo;

	@Override
	public Department saveDep(Department dep) {
		System.out.println("Saving department: " + dep);
		return depRepo.save(dep);
	}
	
	
	
	
	
	
	

}
