package com.sys.task.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sys.task.controller.EmployeeFeignInterface;
import com.sys.task.entity.EmployeeVo;
import com.sys.task.eo.EmployeeEo;

@Service
public class EmployeeBoImpl implements EmployeeBo {
	
	@Autowired
	private EmployeeEo employeeEo;
	
	@Autowired
	private EmployeeFeignInterface feignclient;

	@Override
	public EmployeeVo[] getAllEmployeeVo() {
		// TODO Auto-generated method stub
		EmployeeVo[] customer = feignclient.getAllEmployeeVo();
		return customer;
	}

	@Override
	public EmployeeVo[] getEmployeebyRT() {
		// TODO Auto-generated method stub
		RestTemplate restTemplate = employeeEo.getEmployeebyRT();
		return restTemplate.getForObject("http://localhost:8081/task1/employee", EmployeeVo[].class);
	}

}
