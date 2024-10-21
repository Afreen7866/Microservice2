package com.sys.task.resthelper;

import org.springframework.web.client.RestTemplate;

import com.sys.task.entity.EmployeeVo;

public interface EmployeeRestHelper {

     public RestTemplate getEmployeebyRT();
	 
	 public EmployeeVo[] getAllEmployeeVo();

}
