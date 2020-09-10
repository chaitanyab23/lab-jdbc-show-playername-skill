package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO {
	public List<Skill> getSkillBylD(Long id) throws Exception {
		List<Skill> skills = new ArrayList<Skill>();
		Connection con = ConnectionManager.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM skill");
		while (rs.next()) {
			Skill skill = new Skill(rs.getLong("id"), rs.getString("name"));
			skills.add(skill);
		}
		return skills;
	}
}
