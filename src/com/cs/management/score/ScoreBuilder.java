package com.cs.management.score;


public class ScoreBuilder {
	ScoreService s=new ScoreServiceImpl();
	
	
	
	private ScoreService scoreService;
	

	public ScoreBuilder(ScoreService scoreService) {
		this.scoreService = scoreService;

	}
	scoreService.addScore();
	
	
}
