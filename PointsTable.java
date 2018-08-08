package com.pointstable.model;

public class PointsTable {
	private int pos,matches,won,lost,points;
	private double nrr;
	private String team;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lost;
		result = prime * result + matches;
		long temp;
		temp = Double.doubleToLongBits(nrr);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + points;
		result = prime * result + pos;
		result = prime * result + ((team == null) ? 0 : team.hashCode());
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
		PointsTable other = (PointsTable) obj;
		if (lost != other.lost)
			return false;
		if (matches != other.matches)
			return false;
		if (Double.doubleToLongBits(nrr) != Double.doubleToLongBits(other.nrr))
			return false;
		if (points != other.points)
			return false;
		if (pos != other.pos)
			return false;
		if (team == null) {
			if (other.team != null)
				return false;
		} else if (!team.equals(other.team))
			return false;
		if (won != other.won)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PointsTable [pos=" + pos + ", matches=" + matches + ", won=" + won + ", lost=" + lost + ", points="
				+ points + ", nrr=" + nrr + ", team=" + team + "]";
	}
	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
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
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public double getNrr() {
		return nrr;
	}
	public void setNrr(double nrr) {
		this.nrr = nrr;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	

}
