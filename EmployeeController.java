package com.sys.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sys.task.entity.EmployeeVo;
import com.sys.task.service.EmployeeService;

@RestController
@RequestMapping("/task2")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee")
	public ResponseEntity<EmployeeVo[]> getAllEmployeeVo(){
		return new ResponseEntity(employeeService.getAllEmployeeVo(),HttpStatus.OK);
	}
	
	@GetMapping("/employee1")
	public ResponseEntity<EmployeeVo[]> getEmployeebyRT(){
		return new ResponseEntity(employeeService.getEmployeebyRT(),HttpStatus.OK);
	}

}
