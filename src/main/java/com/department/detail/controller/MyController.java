package com.department.detail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.department.detail.entities.Department;
import com.department.detail.services.DepartmentService;

@RestController
@CrossOrigin(origins = "*")
public class MyController {
	
	@Autowired
	private DepartmentService deptService;
	
	@PostMapping("/add")
	public String addNew(@RequestBody Department deptInfo) {
		return deptService.addNewDept(deptInfo);
	}
	
	@PostMapping("/edit")
	public String edit(@RequestBody Department deptInfo) {
		return deptService.editDept(deptInfo);
	}
}
