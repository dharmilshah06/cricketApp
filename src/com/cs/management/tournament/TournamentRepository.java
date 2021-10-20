package com.cs.management.tournament;

import java.util.HashMap;
import java.util.Map;

import com.cs.management.team.Team;

public class TournamentRepository {
	private Map<String, String> teams = new HashMap<>();

	public boolean updateGroup(Team team) {
		try {
			teams.put("GRP_ID", team.getGroupId().toString());
			teams.put("GRP_NAME", team.getGroup());

			/**
			 * In case of Database , need to add product in Product table from
			 * here
			 */
			// add all data in db......
			// boolean flag=update flag in db
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;

	}
}
