package com.cs.management.tournament;
import java.util.List;

import com.cs.management.team.Team;

public class TournamentHandler {
	TournamentService tournamentService = new TounamentServiceImpl();

	void groupAllocation(List<Team> team) {
		tournamentService.groupAllocation(team);
	}

	void tournamentMatchInfo(List<Team> team) {
		tournamentService.tournamentMatchInfo(team);
	}

	}
