package com.digient.gitesh.test;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

import com.digient.gitesh.dto.Employee;

public class JsonTestWithObjectMapper {

	public static void main(String[] args) {
		Employee employee = new Employee();

		employee.setEmpId(105);
		employee.setName("John");
		employee.setDesignation("Software Engineer");
		employee.setDepartment("PHP");
		employee.setSalary(200);

		ObjectMapper mapperObj = new ObjectMapper();

		try {
			// get Employee object as a json string
			String jsonStr = mapperObj.writeValueAsString(employee);
			System.out.println(jsonStr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
