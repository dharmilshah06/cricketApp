package com.cs.management.score;

import com.cs.management.team.Team;

public class ScoreServiceImpl implements ScoreService {
	ScoreRepository scoreRepository = new ScoreRepository();

	@Override
	public Score downWicket(Team team, int wicket, Score score) {

		if (wicket >= 0 && wicket < 11) {
			if (wicket < 10)
				wicket++;
			if (team != null && team.getScore() != null)
				team.getScore().setWickets(wicket);
			// need to increment ball also
		}

		return score;
	}

	@Override
	public void addScore(Team team, int runs) {
		Integer balls = 0;
		Integer noOFDotballs = 0;
		Integer noOfFours = 0;
		Integer noOfSixes = 0;
		if (team != null && team.getScore() != null
				&& team.getScore().getBalls() != null)
			balls = team.getScore().getBalls();
		if (balls < 101) {
			if (runs == 0 || runs == 1 || runs == 2 || runs == 3 || runs == 4
					|| runs == 6) {
				if (team != null && team.getScore() != null) {
					// add balls to the score

					if (balls < 100)
						balls++;
					team.getScore().setBalls(balls);

					switch (runs) {
					case 0: // adding 0 to the count in Score

						if (team.getScore().getNoOfDotballs() != null)
							noOFDotballs = team.getScore().getNoOfDotballs();

						noOFDotballs++;
						team.getScore().setNoOfDotballs(noOFDotballs);

						break;

					case 4:

						if (team.getScore().getNoOfDotballs() != null)
							noOfFours = team.getScore().getNoOfFours();

						noOfFours++;

						team.getScore().setNoOfFours(noOfFours);

						break;
					case 6: // adding 6 to the count in Score

						if (team.getScore().getNoOfDotballs() != null)
							noOfSixes = team.getScore().getNoOfSixes();

						noOfSixes++;

						team.getScore().setNoOfSixes(noOfSixes);

						break;
					}

				}
			}
		} else {
			// Innings Complete
			scoreRepository.saveScore(team.getScore());
		}

	}
}
