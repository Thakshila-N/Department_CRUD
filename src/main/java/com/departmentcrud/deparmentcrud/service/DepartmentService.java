package com.departmentcrud.deparmentcrud.service;

import java.util.List;

import com.departmentcrud.deparmentcrud.entity.Department;

public interface DepartmentService {

	

	public Department saveDep(Department dep);

	public List<Department> fetchDep();

	public Department fetchDataById(Long depId);

	public Department fetchDataByName(String name);

}
