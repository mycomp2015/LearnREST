package com.digient.gitesh.test;

import java.io.IOException;

import org.json.JSONObject;

import com.digient.gitesh.dto.Employee;

public class JsonTestWithJSONObject {

	public static void main(String[] args) throws IOException {

		Employee employee=new Employee();
		
		employee.setEmpId(105);
		employee.setName("Gitesh");
		employee.setDesignation("Software Engineer");
		employee.setDepartment("b2b");
		employee.setSalary(200);
		
		JSONObject json   = new JSONObject();
		JSONObject jsonStr=json.put("Employee details ", employee);
		System.out.println(jsonStr);
	}

}
