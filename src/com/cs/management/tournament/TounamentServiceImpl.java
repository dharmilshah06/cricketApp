package com.cs.management.tournament;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cs.management.team.Team;

public class TounamentServiceImpl implements TournamentService {
	TournamentRepository tournamentRepo = new TournamentRepository();

	@Override
	public void groupAllocation(List<Team> team) {
		for (Team grp : team) {
			if (grp.getTeamId() % 2 == 0) {
				grp.setGroup("Group A");
				grp.setGroupId(1);
				tournamentRepo.updateGroup(grp);
			} else {
				grp.setGroup("Group B");
				grp.setGroupId(2);
				tournamentRepo.updateGroup(grp);
			}
		}

	}

	@Override
	public void tournamentMatchInfo(List<Team> team) {
		List<Team> grp1 = setMatchesforgrpA(team); // for grp A Matches and
													// winner wise sort in grp
													// League
		List<Team> grp2 = setMatchesforgrpB(team); // for grp B MAtches and
													// winner wise sort in grp
													// League
		Team t1 = semifinal1(grp1, grp2); // Semi-1 and winner
		Team t2 = semifinal2(grp1, grp2); // Semi-2 and winner
		finalMatch(t1, t2);

	}

	void finalMatch(Team t1, Team t2) {
		MatchVO tmpMt = new MatchVO();
		tmpMt.setTeam1(t1.getTeamId());
		tmpMt.setTeam2(t2.getTeamId());
	}

	Team semifinal1(List<Team> grp1, List<Team> grp2) {

		MatchVO tmpMt = new MatchVO();
		Team finalt1 = null;
		if (grp1 != null && grp1.get(0) != null && grp2 != null
				&& grp2.get(0) != null) {

			tmpMt.setTeam1(grp1.get(0).getTeamId());  // match Set
			
			tmpMt.setTeam2(grp2.get(1).getTeamId());
		}
		// result
		if (grp1 != null && grp1.get(0) != null
				&& grp1.get(0).getSemiFinalWin() == 1) {
			finalt1 = grp1.get(0);
		} else if (grp2 != null && grp2.get(1) != null
				&& grp2.get(1).getSemiFinalWin() == 1) {
			finalt1 = grp2.get(1);
		}
		return finalt1;
	}

	Team semifinal2(List<Team> grp1, List<Team> grp2) {
		MatchVO tmpMt = new MatchVO();
		Team finalt1 = null;
		if (grp2 != null && grp2.get(0) != null)
			tmpMt.setTeam1(grp2.get(0).getTeamId());
		if (grp1 != null && grp1.get(1) != null)// match Set
			tmpMt.setTeam2(grp1.get(1).getTeamId());
		// result ---win--semifinalWin---change to 1
		if (grp2 != null && grp2.get(0) != null
				&& grp2.get(0).getSemiFinalWin() == 1) {
			finalt1 = grp2.get(0);
		} else if (grp1 != null && grp1.get(1) != null
				&& grp1.get(1).getSemiFinalWin() == 1) {
			finalt1 = grp1.get(1);
		}
		return finalt1;
	}

	void tournamentteams(List<Team> teams) {
		Collections.sort(teams); // used compareTo method--Comparable Interface
	}

	private List<Team> setMatchesforgrpB(List<Team> team) {

		// TODO Auto-generated method stub
		List<Team> team1 = new ArrayList<>();
		for (Team grp2 : team) {
			if (grp2.getGroupId() == 2) {
				team1.add(grp2);
			}

		}
		setMatches(team1);
		tournamentteams(team1);
		return team1;
	}

	private List<Team> setMatchesforgrpA(List<Team> team) {
		// TODO Auto-generated method stub
		List<Team> team1 = new ArrayList<>();
		for (Team grp1 : team) {
			if (grp1.getGroupId() == 1) {
				team1.add(grp1);
			}

		}
		setMatches(team1);
		tournamentteams(team1);
		return team1;
	}

	void setMatches(List<Team> team) {
		// notepad
		List<MatchVO> mt = new ArrayList<>();
		for (int i = 0; i < team.size() - 1; i++) { // i=for 1st Team
			for (int j = i + 1; j < team.size(); j++) { // for 2nd Team
				// match 1
				MatchVO tmpMt = new MatchVO();
				tmpMt.setTeam1(team.get(i).getTeamId());
				tmpMt.setTeam2(team.get(i).getTeamId());

				mt.add(tmpMt);

			}

		}

	}

}
