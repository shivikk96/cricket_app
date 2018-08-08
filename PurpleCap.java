package com.purplecap.model;

public class PurpleCap {
	
	private int position,innings,wickets,four_haul,five_haul;
	private String player;
	private double average,economy,strike_rate;
	
	public PurpleCap() {
		// TODO Auto-generated constructor stub
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
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
	public int getFour_haul() {
		return four_haul;
	}
	public void setFour_haul(int four_haul) {
		this.four_haul = four_haul;
	}
	public int getFive_haul() {
		return five_haul;
	}
	public void setFive_haul(int five_haul) {
		this.five_haul = five_haul;
	}
	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
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
	public double getStrike_rate() {
		return strike_rate;
	}
	public void setStrike_rate(double strike_rate) {
		this.strike_rate = strike_rate;
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
		result = prime * result + five_haul;
		result = prime * result + four_haul;
		result = prime * result + innings;
		result = prime * result + ((player == null) ? 0 : player.hashCode());
		result = prime * result + position;
		temp = Double.doubleToLongBits(strike_rate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		PurpleCap other = (PurpleCap) obj;
		if (Double.doubleToLongBits(average) != Double.doubleToLongBits(other.average))
			return false;
		if (Double.doubleToLongBits(economy) != Double.doubleToLongBits(other.economy))
			return false;
		if (five_haul != other.five_haul)
			return false;
		if (four_haul != other.four_haul)
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
		if (Double.doubleToLongBits(strike_rate) != Double.doubleToLongBits(other.strike_rate))
			return false;
		if (wickets != other.wickets)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PurpleCap [position=" + position + ", innings=" + innings + ", wickets=" + wickets + ", four_haul="
				+ four_haul + ", five_haul=" + five_haul + ", player=" + player + ", average=" + average + ", economy="
				+ economy + ", strike_rate=" + strike_rate + "]";
	}
	
}
