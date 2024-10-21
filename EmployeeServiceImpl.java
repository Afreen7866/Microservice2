package com.sys.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sys.task.bo.EmployeeBo;
import com.sys.task.entity.EmployeeVo;

@Component
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeBo employeeBo;
	
	@Override
	public EmployeeVo[] getAllEmployeeVo() {
		// TODO Auto-generated method stub
		EmployeeVo[] customer = employeeBo.getAllEmployeeVo();
		return customer;
	}

	@Override
	public EmployeeVo[] getEmployeebyRT() {
		// TODO Auto-generated method stub
		return employeeBo.getEmployeebyRT();
	}

}

