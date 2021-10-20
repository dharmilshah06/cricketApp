package com.cs.management.score;

public class Score {

	
	private Integer runs;
	private Integer balls;
	private Integer noOfDotballs;
	private Integer noOfOnes;
	private Integer noOfTwos;
	private Integer noOfThrees;
	private Integer noOfFours;
	private Integer noOfSixes;
	private Integer wickets;
	public Integer getRuns() {
		return runs;
	}
	public void setRuns(Integer runs) {
		this.runs = runs;
	}
	public Integer getBalls() {
		return balls;
	}
	public void setBalls(Integer balls) {
		this.balls = balls;
	}
	public Integer getNoOfDotballs() {
		return noOfDotballs;
	}
	public void setNoOfDotballs(Integer noOfDotballs) {
		this.noOfDotballs = noOfDotballs;
	}
	public Integer getNoOfOnes() {
		return noOfOnes;
	}
	public void setNoOfOnes(Integer noOfOnes) {
		this.noOfOnes = noOfOnes;
	}
	public Integer getNoOfTwos() {
		return noOfTwos;
	}
	public void setNoOfTwos(Integer noOfTwos) {
		this.noOfTwos = noOfTwos;
	}
	public Integer getNoOfThrees() {
		return noOfThrees;
	}
	public void setNoOfThrees(Integer noOfThrees) {
		this.noOfThrees = noOfThrees;
	}
	public Integer getNoOfFours() {
		return noOfFours;
	}
	public void setNoOfFours(Integer noOfFours) {
		this.noOfFours = noOfFours;
	}
	public Integer getNoOfSixes() {
		return noOfSixes;
	}
	public void setNoOfSixes(Integer noOfSixes) {
		this.noOfSixes = noOfSixes;
	}
	public Integer getWickets() {
		return wickets;
	}
	public void setWickets(Integer wickets) {
		this.wickets = wickets;
	}
	@Override
	public String toString() {
		return "Score [runs=" + runs + ", balls=" + balls + ", noOfDotballs="
				+ noOfDotballs + ", noOfOnes=" + noOfOnes + ", noOfTwos="
				+ noOfTwos + ", noOfThrees=" + noOfThrees + ", noOfFours="
				+ noOfFours + ", noOfSixes=" + noOfSixes + ", wickets="
				+ wickets + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((balls == null) ? 0 : balls.hashCode());
		result = prime * result
				+ ((noOfDotballs == null) ? 0 : noOfDotballs.hashCode());
		result = prime * result
				+ ((noOfFours == null) ? 0 : noOfFours.hashCode());
		result = prime * result
				+ ((noOfOnes == null) ? 0 : noOfOnes.hashCode());
		result = prime * result
				+ ((noOfSixes == null) ? 0 : noOfSixes.hashCode());
		result = prime * result
				+ ((noOfThrees == null) ? 0 : noOfThrees.hashCode());
		result = prime * result
				+ ((noOfTwos == null) ? 0 : noOfTwos.hashCode());
		result = prime * result + ((runs == null) ? 0 : runs.hashCode());
		result = prime * result + ((wickets == null) ? 0 : wickets.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		if (balls == null) {
			if (other.balls != null)
				return false;
		} else if (!balls.equals(other.balls))
			return false;
		if (noOfDotballs == null) {
			if (other.noOfDotballs != null)
				return false;
		} else if (!noOfDotballs.equals(other.noOfDotballs))
			return false;
		if (noOfFours == null) {
			if (other.noOfFours != null)
				return false;
		} else if (!noOfFours.equals(other.noOfFours))
			return false;
		if (noOfOnes == null) {
			if (other.noOfOnes != null)
				return false;
		} else if (!noOfOnes.equals(other.noOfOnes))
			return false;
		if (noOfSixes == null) {
			if (other.noOfSixes != null)
				return false;
		} else if (!noOfSixes.equals(other.noOfSixes))
			return false;
		if (noOfThrees == null) {
			if (other.noOfThrees != null)
				return false;
		} else if (!noOfThrees.equals(other.noOfThrees))
			return false;
		if (noOfTwos == null) {
			if (other.noOfTwos != null)
				return false;
		} else if (!noOfTwos.equals(other.noOfTwos))
			return false;
		if (runs == null) {
			if (other.runs != null)
				return false;
		} else if (!runs.equals(other.runs))
			return false;
		if (wickets == null) {
			if (other.wickets != null)
				return false;
		} else if (!wickets.equals(other.wickets))
			return false;
		return true;
	}
	
	
}
