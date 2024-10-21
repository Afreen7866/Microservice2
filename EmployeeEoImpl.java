package com.sys.task.eo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.sys.task.resthelper.EmployeeRestHelper;

@Component
public class EmployeeEoImpl implements EmployeeEo{
	
	@Autowired
	private EmployeeRestHelper employeeRestHelper;
	

	@Override
	public RestTemplate getEmployeebyRT() {
		return employeeRestHelper.getEmployeebyRT();
	}

	
}
