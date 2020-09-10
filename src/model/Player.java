package model;

public class Player {
	Long playerld;
	String name;
	String country;
	String Skill;

	public Long getPlayerld() {
		return playerld;
	}

	public void setPlayerld(Long playerld) {
		this.playerld = playerld;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSkill() {
		return Skill;
	}

	public void setSkill(String skill) {
		Skill = skill;
	}

	public Player(Long playerld, String name, String country, String skill) {
		super();
		this.playerld = playerld;
		this.name = name;
		this.country = country;
		Skill = skill;
	}

}

