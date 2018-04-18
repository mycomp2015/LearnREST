package com.digient.gitesh.test;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

import com.digient.gitesh.dto.Employee;

public class JsonToText {

	public static void main(String[] args) {

		 ObjectMapper mapper = new ObjectMapper();
		 
	        try {
	            File jsonInputFile = new File("D:\\Eclipse Project\\JavaToJson\\employeeJson.text");
	            Employee emp = mapper.readValue(jsonInputFile, Employee.class);
	            System.out.println(emp);
	             
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	}

}
