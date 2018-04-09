package com.digient.gitesh.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.Response;

@Path("/")
public class MyOptionPath {
	
	
	@GET
	//@Path("/user/{slash : (/)?}{name :((?<=/).*)?}")
	//@Path("/user/{name: [a-zA-Z\\s]+}/{slash : (/)?}{id :((?<=/).*)?}")
	//@Path("/user/{name :(/name)?}")
	//@Path("/b{c : (/c)?}")
	//@Path("user/{name: [a-zA-Z\\s]+}{slash : (/)?}{id :((?<=/).*)?}")
	
	@Path("user/{name: (QT|Player|XPG|RTG)}{slash : (/)?}{path :((?<=/).*)?}")
	
	
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})	
	
	public Response getMethod(@PathParam("name") PathSegment name,@PathParam("path") String path){
		
		
		 String url = new String();
		 url=url+"/user/"+name.getPath();
		 System.out.println(url);

		System.out.println("Path: " + name.getPath());
		
		return Response.status(200)
				.entity("method is called, username : " + name+" rest path is : "+path).build();
		
		
	}
}
