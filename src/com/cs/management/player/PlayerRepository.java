package com.cs.management.player;

import java.util.HashMap;
import java.util.Map;

/**
 * this class used to save product details in database 
 *  * **/
public class PlayerRepository {
	 private Map<String,String> teams = new HashMap<>();
	  
	
	    	/**
	    	 * In case of Database , need to add product in Product table from here 
	    	 */	    	
	public boolean savePlayer(PlayerVO player) {
		// TODO Auto-generated method stub
		
		 teams.put("FIRST_NAME",player.getfName());
		 teams.put("LAST_NAME",player.getlName());
		 teams.put("TEAM_ID",player.getTeamId()!=null?player.getTeamId().toString():"");
		 //add all data in db......
		//boolean flag=insert flag in db
		 return true;
	}
	
}
