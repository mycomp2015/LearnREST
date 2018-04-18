package com.api.gitesh.commonservices.resourse;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.api.gitesh.commonservices.dto.Game;
import com.api.gitesh.commonservices.time.TimeScheduling;


@Path("/")
public class GameResource {
	
	final static Logger logger = Logger.getLogger(GameResource.class);
	private TimeScheduling time=new TimeScheduling();
	
	@GET
	@Path("/log/{id}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	
	public Map<Object, Object> getDetails(@PathParam("id")int id){
		
		Map<Object,Object> users=new HashMap<Object,Object>();
		Game game=new Game();
		
		game.setPlayerId(id);
		game.setGameStartedTime(time.getMyTime());
		game.setPlayerName("Gitesh");
		game.setPlayGameName("Rullette");
		game.setBetAmount(100);
		
		users.put("Your game :", game);		
		logger.debug(""+users.toString());		
		return users;		
	}
}
