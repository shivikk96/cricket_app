package com.training.spring.model;

public class TeamRecordAlltime {
	private String team;
	private int points;
	private int won;
	private int lost;
	private double winPercent;
	
	public TeamRecordAlltime() {
	}

	public TeamRecordAlltime(String team, int points, int won, int lost, double winPercent) {
		super();
		this.team = team;
		this.points = points;
		this.won = won;
		this.lost = lost;
		this.winPercent = winPercent;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getWon() {
		return won;
	}

	public void setWon(int won) {
		this.won = won;
	}

	public int getLost() {
		return lost;
	}

	public void setLost(int lost) {
		this.lost = lost;
	}

	public double getWinPercent() {
		return winPercent;
	}

	public void setWinPercent(double winPercent) {
		this.winPercent = winPercent;
	}

	@Override
	public String toString() {
		return "teamRecordAlltime [team=" + team + ", points=" + points + ", won=" + won + ", lost=" + lost
				+ ", winPercent=" + winPercent + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lost;
		result = prime * result + points;
		result = prime * result + ((team == null) ? 0 : team.hashCode());
		long temp;
		temp = Double.doubleToLongBits(winPercent);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + won;
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
		TeamRecordAlltime other = (TeamRecordAlltime) obj;
		if (lost != other.lost)
			return false;
		if (points != other.points)
			return false;
		if (team == null) {
			if (other.team != null)
				return false;
		} else if (!team.equals(other.team))
			return false;
		if (Double.doubleToLongBits(winPercent) != Double.doubleToLongBits(other.winPercent))
			return false;
		if (won != other.won)
			return false;
		return true;
	}
	
	
}
