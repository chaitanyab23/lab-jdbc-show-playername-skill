package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Player;
import utility.ConnectionManager;

public class PlayerDAO{
	public List<Player> getAllPlayers() throws Exception{
		List <Player> players= new ArrayList<Player>();
		Connection con=ConnectionManager.getConnection();
		Statement st= con.createStatement();
		ResultSet rs=st.executeQuery("SELECT * FROM Players");
		
		while (rs.next()){
			Player player=new Player(rs.getLong("playerld"),rs.getString("name"),rs.getString("country"),rs.getString("skill"));
			players.add(player);
		}
		return players;
	}
}