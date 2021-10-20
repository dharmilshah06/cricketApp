package com.cs.management.team;

public class TeamManagementServiceImpl implements TeamManagementService {
	TeamManagementRepository teamRepo=new TeamManagementRepository();
	@Override
	public void addTeam(Team team) {
		// TODO Auto-generated method stub
		teamRepo.save(team);
	}

}
