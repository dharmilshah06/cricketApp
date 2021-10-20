package com.cs.management.score;

import com.cs.management.team.Team;

public interface ScoreService {
	public Score downWicket(Team team, int wicket,Score score);
	public void addScore(Team team, int runs);
}
