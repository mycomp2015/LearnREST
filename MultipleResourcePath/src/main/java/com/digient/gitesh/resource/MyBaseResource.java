package com.digient.gitesh.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class MyBaseResource {

	@Path("a/b")
	@GET
	public Response method1() {
		return Response.ok("called method1 ").build();
	}

	@Path("a/b/c")
	@GET
	public Response method2() {
		return Response.ok("called method2 ").build();
	}

}
