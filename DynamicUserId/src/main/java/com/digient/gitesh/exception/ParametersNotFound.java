package com.digient.gitesh.exception;

import java.net.HttpURLConnection;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

public class ParametersNotFound extends Exception{
	
	private static final long serialVersionUID = 1L;

	public ParametersNotFound() {		
		
			throw new WebApplicationException(Response.status(HttpURLConnection.HTTP_BAD_REQUEST)
					.entity("please enter valid user and all its parameter ").build());		
		
	}
}
