package com.teamroster.model;

public class TeamRoster {
	
	private String team, player;
	private int matches, runs, wickets;
	
	public TeamRoster() {
		// TODO Auto-generated constructor stub
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + matches;
		result = prime * result + ((player == null) ? 0 : player.hashCode());
		result = prime * result + runs;
		result = prime * result + ((team == null) ? 0 : team.hashCode());
		result = prime * result + wickets;
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
		TeamRoster other = (TeamRoster) obj;
		if (matches != other.matches)
			return false;
		if (player == null) {
			if (other.player != null)
				return false;
		} else if (!player.equals(other.player))
			return false;
		if (runs != other.runs)
			return false;
		if (team == null) {
			if (other.team != null)
				return false;
		} else if (!team.equals(other.team))
			return false;
		if (wickets != other.wickets)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TeamRoster [team=" + team + ", player=" + player + ", matches=" + matches + ", runs=" + runs
				+ ", wickets=" + wickets + "]";
	}
	
	

}
