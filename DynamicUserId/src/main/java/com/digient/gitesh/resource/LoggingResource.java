package com.digient.gitesh.resource;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import com.digient.gitesh.dto.Logging;
import com.digient.gitesh.exception.IDNotFounfException;
import com.digient.gitesh.exception.ParametersNotFound;

@Path("/")
public class LoggingResource {


	@Path("/log/{user}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)

	public Object getLoggingDetails(@PathParam("user") String user, @QueryParam("id") String userId) throws IDNotFounfException {

		Logging logging = new Logging();

		if (user.equals("user1")) {
			if(userId==null){
				throw new IDNotFounfException(userId);
			}
			
			logging.setUserId(userId);
			logging.setUserName("User1");
			logging.setAddress1("chennai");
			logging.setAddress2("Tamilnadu");		
			
			return logging;

		}
		if (user.equals("user2")) {
			
			if(userId==null){
				throw new IDNotFounfException(userId);
			}
			logging.setUserId(userId);
			logging.setUserName("User2");
			logging.setAddress1("Banglore");
			logging.setAddress2("Karnatak");	

			return logging;

		}		
		return new ParametersNotFound();

	}

}
