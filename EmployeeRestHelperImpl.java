package com.sys.task.resthelper;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.sys.task.entity.EmployeeVo;

@Component
public class EmployeeRestHelperImpl implements EmployeeRestHelper {

	@Override
	public RestTemplate getEmployeebyRT() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}

	@Override
	public EmployeeVo[] getAllEmployeeVo() {
		return null;
	}

}
