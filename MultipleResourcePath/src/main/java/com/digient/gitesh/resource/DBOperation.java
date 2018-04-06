package com.digient.gitesh.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class DBOperation {
	
	@GET
	@Path("user/{methoName: (create|read|update|delete).*}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response dbOp(@PathParam("methoName")String methoName,@QueryParam("userName") String userName) {
		return Response.status(200)
				.entity(methoName+" () method is called , Username :"+userName).build();

	}

	/*public Response read() {
		return Response.status(200)
				.entity("getUserByUserName is called, username : ").build();

	}

	public Response update() {
		return Response.status(200)
				.entity("getUserByUserName is called, username : ").build();

	}

	public Response delete() {
		return Response.status(200)
				.entity("getUserByUserName is called, username : ").build();

	}*/
}
