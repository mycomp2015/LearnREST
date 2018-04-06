package com.digient.gitesh.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/")
public class UserResource {

	@GET
	@Path("username/1/{name : [a-zA-Z]}")
	public Response getUserByUserName(@PathParam("name") String username) {

	   return Response.status(200)
		.entity("getUserByUserName is called, username : " + username).build();

	}
	@GET
	@Path("username/2/{name : [a-zA-Z]}")
	public Response getUserByUserNameAgain(@PathParam("name") String username) {

	   return Response.status(200)
		.entity("getUserByUserNameAgain is called, username : " + username).build();

	}
	

	/*@GET
	@Path("{id : \\d+}") // support digit only
	public Response getUserById(@PathParam("id") String id) {

		return Response.status(200).entity("getUserById is called, id : " + id).build();

	}*/

}
