package com.sys.task.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.sys.task.entity.EmployeeVo;

@FeignClient(value="feignclient",url="http://localhost:8081")
public interface EmployeeFeignInterface {
	
	@GetMapping("/task1/employee")
	public EmployeeVo[] getAllEmployeeVo();

}

