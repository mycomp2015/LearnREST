package com.digient.gitesh.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class MultiPath {
	
	@GET
	@Path("user/{id : 1|2}")
	@Produces(MediaType.APPLICATION_JSON)
	public String myMethod(@PathParam("id")int id){
		
		return "myMthod is called ..";
		
	}

}
