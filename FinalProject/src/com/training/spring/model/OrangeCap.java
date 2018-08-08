package com.training.spring.model;

public class OrangeCap {
	private int position;
	private String player;
	private String team;
	private int innings;
	private int runs;
	private double average;
	private double strikeRate;
	private int hundreds;
	private int fifties;
	private int highScore;
	
	public OrangeCap() {
	}

	public OrangeCap(int position, String player, String team, int innings, int runs, double average, double strikeRate,
			int hundreds, int fifties, int highScore) {
		
		this.position = position;
		this.player = player;
		this.team = team;
		this.innings = innings;
		this.runs = runs;
		this.average = average;
		this.strikeRate = strikeRate;
		this.hundreds = hundreds;
		this.fifties = fifties;
		this.highScore = highScore;
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

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public double getStrikeRate() {
		return strikeRate;
	}

	public void setStrikeRate(double strikeRate) {
		this.strikeRate = strikeRate;
	}

	public int getHundreds() {
		return hundreds;
	}

	public void setHundreds(int hundreds) {
		this.hundreds = hundreds;
	}

	public int getFifties() {
		return fifties;
	}

	public void setFifties(int fifties) {
		this.fifties = fifties;
	}

	public int getHighScore() {
		return highScore;
	}

	public void setHighScore(int highScore) {
		this.highScore = highScore;
	}

	@Override
	public String toString() {
		return "orangeCap [position=" + position + ", player=" + player + ", team=" + team + ", innings=" + innings
				+ ", runs=" + runs + ", average=" + average + ", strikeRate=" + strikeRate + ", hundreds=" + hundreds
				+ ", fifties=" + fifties + ", highScore=" + highScore + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(average);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + fifties;
		result = prime * result + highScore;
		result = prime * result + hundreds;
		result = prime * result + innings;
		result = prime * result + ((player == null) ? 0 : player.hashCode());
		result = prime * result + position;
		result = prime * result + runs;
		temp = Double.doubleToLongBits(strikeRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((team == null) ? 0 : team.hashCode());
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
		OrangeCap other = (OrangeCap) obj;
		if (Double.doubleToLongBits(average) != Double.doubleToLongBits(other.average))
			return false;
		if (fifties != other.fifties)
			return false;
		if (highScore != other.highScore)
			return false;
		if (hundreds != other.hundreds)
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
		if (runs != other.runs)
			return false;
		if (Double.doubleToLongBits(strikeRate) != Double.doubleToLongBits(other.strikeRate))
			return false;
		if (team == null) {
			if (other.team != null)
				return false;
		} else if (!team.equals(other.team))
			return false;
		return true;
	}
	
	
}
