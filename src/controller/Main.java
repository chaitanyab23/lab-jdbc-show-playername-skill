package controller;

import java.util.List;

import dao.PlayerDAO;
import dao.SkillDAO;
import model.Player;
import model.Skill;

public class Main {
	public static void main(String[] args) throws Exception {
		SkillDAO skilldao = new SkillDAO();
		PlayerDAO playerdao = new PlayerDAO();

		List<Player> players = playerdao.getAllPlayers();

		System.out.println("List of all Players and  Skill");
		System.out.println("ID   NAME   COUNTRY   SKILL");
		for (int i = 0; i < players.size(); i++) {
			System.out.println(i+1+". "+players.get(i).getPlayerld()+"   "+players.get(i).getName()+"   "+players.get(i).getCountry()+"   "+players.get(i).getSkill());
		}
	}
}
