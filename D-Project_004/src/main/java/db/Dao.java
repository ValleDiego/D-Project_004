package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import model.Pokemon;


public class Dao {
	
	public TreeMap<String, Pokemon> getAllPokemon(){
		String sql = "";
		TreeMap<String, Pokemon> result = new TreeMap<>();
		try {
			Connection conn = DBConncet.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet res = st.executeQuery();

			while (res.next()) {
				//aggiungo pokemon
			}
			
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("SQL Error");
		}

		return result;
	}
}
