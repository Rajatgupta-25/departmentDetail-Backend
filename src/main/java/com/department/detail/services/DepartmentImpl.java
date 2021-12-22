package com.department.detail.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.detail.dao.DepartmentDao;
import com.department.detail.entities.Department;

@Service
public class DepartmentImpl implements DepartmentService {
	
	@Autowired
	private DepartmentDao deptDao;

	@Override
	public String addNewDept(Department dept) {
		deptDao.save(dept);
		return "Saved Successfully";
	}

	@Override
	public String editDept(Department dept) {
		deptDao.save(dept);
		return "Updated Successfully";
	}
	
}
