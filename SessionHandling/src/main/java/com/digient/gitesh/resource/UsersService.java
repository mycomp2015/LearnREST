package com.digient.gitesh.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.digient.gitesh.datetime.RESTDateParam;

@Path("/")
public class UsersService {
	
	
	@GET
	@Path("/get")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	
	public Response addUser() {
	
		RESTDateParam date= new RESTDateParam();		
		
		return Response.status(200)
			.entity("addUser is called   Date :  "+date.getMyTime())
			.build();	
		
	}

}
