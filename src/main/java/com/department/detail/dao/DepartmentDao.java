package com.department.detail.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.department.detail.entities.Department;

public interface DepartmentDao extends JpaRepository<Department, Integer> {

}
