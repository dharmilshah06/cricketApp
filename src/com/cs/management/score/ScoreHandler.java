package com.cs.management.score;

import com.cs.management.team.Team;

public class ScoreHandler {

	private ScoreService service = new ScoreServiceImpl();

	public Score downWicket(Team team, int wicket, Score score) {

		Score updatedscre = service.downWicket(team, wicket, score);

		return updatedscre;

	}

	public void addScore(Team team, int runs) {

		service.addScore(team, runs);

	}
}
