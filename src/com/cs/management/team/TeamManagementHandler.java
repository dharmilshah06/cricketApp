package com.cs.management.team;

public class TeamManagementHandler {
	TeamManagementService teamManagementService = new TeamManagementServiceImpl();

	void team(Team team) {
		teamManagementService.addTeam(team);
	}
}
