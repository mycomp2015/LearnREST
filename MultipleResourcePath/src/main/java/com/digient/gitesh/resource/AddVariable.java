package com.digient.gitesh.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class AddVariable {
	
	@GET
	//@Path("users/{name : (qt|player|xpg|rtg).*}/{id}")
	@Path("users/{name: [a-zA-Z\\s]+}/{id}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	
	public String getMethod(@PathParam("name") String userName,@PathParam("id")String id){
		
		return "method is called , Name :"+userName+" and id is :"+id;
		
	}

}
