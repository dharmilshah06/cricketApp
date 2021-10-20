package com.cs.management.team;

import com.cs.management.score.Score;

public class Team implements Comparable<Team>{
  private Integer matchCount;
  private Integer winCount;
  private Integer teamPoint;
  private Integer playerCount;
  private String teamName;
  private Integer teamId;
  private Score score;
  private String group;
  private Integer groupId;
  private Integer semiFinalWin;
  private Integer finalWin;
  
  
  
  
public Integer getSemiFinalWin() {
	return semiFinalWin;
}
public void setSemiFinalWin(Integer semiFinalWin) {
	this.semiFinalWin = semiFinalWin;
}
public Integer getFinalWin() {
	return finalWin;
}
public void setFinalWin(Integer finalWin) {
	this.finalWin = finalWin;
}
public String getGroup() {
	return group;
}
public void setGroup(String group) {
	this.group = group;
}
public Integer getGroupId() {
	return groupId;
}
public void setGroupId(Integer groupId) {
	this.groupId = groupId;
}
public String getTeamName() {
	return teamName;
}
public void setTeamName(String teamName) {
	this.teamName = teamName;
}
public Score getScore() {
	return score;
}
public void setScore(Score score) {
	this.score = score;
}
public Integer getTeamId() {
	return teamId;
}
public void setTeamId(Integer teamId) {
	this.teamId = teamId;
}
public Integer getMatchCount() {
	return matchCount;
}
public void setMatchCount(Integer matchCount) {
	this.matchCount = matchCount;
}
public Integer getWinCount() {
	return winCount;
}
public void setWinCount(Integer winCount) {
	this.winCount = winCount;
}
public Integer getTeamPoint() {
	return teamPoint;
}
public void setTeamPoint(Integer teamPoint) {
	this.teamPoint = teamPoint;
}
public Integer getPlayerCount() {
	return playerCount;
}
public void setPlayerCount(Integer playerCount) {
	this.playerCount = playerCount;
}
@Override
public int compareTo(Team o) {
	if(this.getWinCount()==o.getWinCount())
	// TODO Auto-generated method stub
	return 0;
	else if(this.getWinCount()>o.getWinCount())
		return 1;
	else
		return -1;
	
}

  
}
