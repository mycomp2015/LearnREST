package com.digient.gitesh.resource;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.digient.gitesh.datetime.RESTDateParam;

@Path("/user")
public class MyMap {

	@Path("/getUser")
	@GET	
	@Consumes("application/json")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	
	public Response getUser() {

		Map<String, String> usersMap = new HashMap<>();
		RESTDateParam date= new RESTDateParam();		
		
		usersMap.put("101", "gitesh");
		usersMap.put("Phone", "87540255");
		usersMap.put("Mobile", "112458033");
		
		//return Response.ok(usersMap).build();
		return Response.status(200)
				.entity("addUser is called "+usersMap +"  Loggin Date and Time is :  "+date.getMyTime())
				.build();

	}

}
