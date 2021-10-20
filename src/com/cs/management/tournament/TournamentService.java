package com.cs.management.tournament;

import java.util.List;

import com.cs.management.team.Team;

public interface TournamentService {

	void groupAllocation(List<Team> team);
	
	void tournamentMatchInfo(List<Team> team);
}
