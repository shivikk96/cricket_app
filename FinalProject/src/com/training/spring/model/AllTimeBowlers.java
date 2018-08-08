package com.training.spring.model;

public class AllTimeBowlers {
	private int position;
	private String player;
	private String team;
	private int innings;
	private int wickets;
	private double average;
	private double economy;
	private double strikeRate;
	private int fourHaul;
	private int fiveHaul;
	
	
	public AllTimeBowlers() {
	}


	public AllTimeBowlers(int position, String player, String team, int innings, int wickets, double average,
			double economy, double strikeRate, int fourHaul, int fiveHaul) {
		
		this.position = position;
		this.player = player;
		this.team = team;
		this.innings = innings;
		this.wickets = wickets;
		this.average = average;
		this.economy = economy;
		this.strikeRate = strikeRate;
		this.fourHaul = fourHaul;
		this.fiveHaul = fiveHaul;
	}


	public int getPosition() {
		return position;
	}


	public void setPosition(int position) {
		this.position = position;
	}


	public String getPlayer() {
		return player;
	}


	public void setPlayer(String player) {
		this.player = player;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	public int getInnings() {
		return innings;
	}


	public void setInnings(int innings) {
		this.innings = innings;
	}


	public int getWickets() {
		return wickets;
	}


	public void setWickets(int wickets) {
		this.wickets = wickets;
	}


	public double getAverage() {
		return average;
	}


	public void setAverage(double average) {
		this.average = average;
	}


	public double getEconomy() {
		return economy;
	}


	public void setEconomy(double economy) {
		this.economy = economy;
	}


	public double getStrikeRate() {
		return strikeRate;
	}


	public void setStrikeRate(double strikeRate) {
		this.strikeRate = strikeRate;
	}


	public int getFourHaul() {
		return fourHaul;
	}


	public void setFourHaul(int fourHaul) {
		this.fourHaul = fourHaul;
	}


	public int getFiveHaul() {
		return fiveHaul;
	}


	public void setFiveHaul(int fiveHaul) {
		this.fiveHaul = fiveHaul;
	}


	@Override
	public String toString() {
		return "allTimeBowlers [position=" + position + ", player=" + player + ", team=" + team + ", innings=" + innings
				+ ", wickets=" + wickets + ", average=" + average + ", economy=" + economy + ", strikeRate="
				+ strikeRate + ", fourHaul=" + fourHaul + ", fiveHaul=" + fiveHaul + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(average);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(economy);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + fiveHaul;
		result = prime * result + fourHaul;
		result = prime * result + innings;
		result = prime * result + ((player == null) ? 0 : player.hashCode());
		result = prime * result + position;
		temp = Double.doubleToLongBits(strikeRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		AllTimeBowlers other = (AllTimeBowlers) obj;
		if (Double.doubleToLongBits(average) != Double.doubleToLongBits(other.average))
			return false;
		if (Double.doubleToLongBits(economy) != Double.doubleToLongBits(other.economy))
			return false;
		if (fiveHaul != other.fiveHaul)
			return false;
		if (fourHaul != other.fourHaul)
			return false;
		if (innings != other.innings)
			return false;
		if (player == null) {
			if (other.player != null)
				return false;
		} else if (!player.equals(other.player))
			return false;
		if (position != other.position)
			return false;
		if (Double.doubleToLongBits(strikeRate) != Double.doubleToLongBits(other.strikeRate))
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
	
	
}
