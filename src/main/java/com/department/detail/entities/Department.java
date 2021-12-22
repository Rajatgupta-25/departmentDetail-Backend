package com.department.detail.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private String departmentName;
	@Column
	private String type;
	@Column
	private String hod;
	@Column
	private String misCats;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getHod() {
		return hod;
	}
	public void setHod(String hod) {
		this.hod = hod;
	}
	public String getMisCats() {
		return misCats;
	}
	public void setMisCats(String misCats) {
		this.misCats = misCats;
	}
	
}
