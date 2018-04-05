package com.digient.gitesh.exception;

import java.net.HttpURLConnection;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

public class IDNotFounfException extends Exception{

	
	private static final long serialVersionUID = 1L;

	public IDNotFounfException(String userId) {
		if (userId == null) {
			System.out.println("Please enter valid userid !!!");

			throw new WebApplicationException(Response.status(HttpURLConnection.HTTP_BAD_REQUEST)

					.entity("name parameter is mandatory").build());

		}
		
	}

	
	
	

}
