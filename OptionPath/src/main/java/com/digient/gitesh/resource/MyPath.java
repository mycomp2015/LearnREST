package com.digient.gitesh.resource;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.Response;

@Path("/")
public class MyPath {
	
	
	@GET
	@Path("users/{op: (QT|Player|XPG|RTG)}{other: .*}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})	
	
	public Response getMethod(
			@PathParam("op") PathSegment op,
			@PathParam("other") String other,
			@Context HttpServletRequest request) throws UnknownHostException{
		
		
		int portno=request.getLocalPort();
		String port = Integer.toString(portno);
		
		
		InetAddress localhost = InetAddress.getLocalHost();
		String host=localhost.getHostAddress().trim();	
		
		String url = new String();
		 url=url+"http://"+localhost+":"+port+"/user/"+op.getPath()+other;
		 System.out.println(url);		
		
		return Response.status(200)
				.entity("method is called, username : " + op+" other path : "+other).build();
		
	}

}
