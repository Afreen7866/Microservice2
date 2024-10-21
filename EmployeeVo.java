package com.sys.task.entity;

import org.springframework.lang.NonNull;

public class EmployeeVo {

	@NonNull
	private int Id;
	
	@NonNull
	private String Name;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public EmployeeVo(int id, String name) {
		super();
		Id = id;
		Name = name;
	}

	public EmployeeVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
