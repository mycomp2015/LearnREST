package com.digient.gitesh.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.digient.gitesh.dto.Employee;

@Path("/")
public class EmployeeResource {

	
	@GET
	@Path("/user/1")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmpDetail(@QueryParam("emplyee-name") String name) {

		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println("methodName = " + methodName);

		Employee employee = new Employee();
		employee.setEmpName(name);
		employee.setEmpId("1");
		employee.setEmpAddress("chennai");
		employee.setEmpSal(354.33f);
		return employee;

	}

	@GET
	@Path("/user/2")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmpDetailAgain(@QueryParam("emplyee-name") String name) {
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println("methodName = " + methodName);

		Employee employee = new Employee();
		employee.setEmpName(name);
		employee.setEmpId("2");
		employee.setEmpAddress("banglore");
		employee.setEmpSal(324.33f);
		return employee;

	}
	
}
