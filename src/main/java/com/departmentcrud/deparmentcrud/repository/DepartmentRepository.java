package com.departmentcrud.deparmentcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.departmentcrud.deparmentcrud.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
