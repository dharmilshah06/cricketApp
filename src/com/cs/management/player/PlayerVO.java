package com.cs.management.player;

public class PlayerVO {
private String fName;
private String lName;
private Integer age;
private String teamName;
private Integer outFlag;
private Integer playerId;
private Integer teamId;



public Integer getTeamId() {
	return teamId;
}
public void setTeamId(Integer teamId) {
	this.teamId = teamId;
}
public Integer getPlayerId() {
	return playerId;
}
public void setPlayerId(Integer playerId) {
	this.playerId = playerId;
}
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getTeamName() {
	return teamName;
}
public void setTeamName(String teamName) {
	this.teamName = teamName;
}
public Integer getOutFlag() {
	return outFlag;
}
public void setOutFlag(Integer outFlag) {
	this.outFlag = outFlag;
}


}
