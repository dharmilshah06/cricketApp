package com.cs.management.team;

import java.util.HashMap;
import java.util.Map;

public class TeamManagementRepository {
//add team to db
	 private Map<Integer,Team> teams = new HashMap<>();

	    void save(Team team) {
	    	/**
	    	 * In case of Database , need to add product in Product table from here 
	    	 */
	    	teams.put(team.getTeamId(),team);
	    }

}
