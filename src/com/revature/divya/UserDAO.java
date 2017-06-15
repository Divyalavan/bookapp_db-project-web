package com.revature.divya;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.divya.model.User;
import com.divya.util.ConnectionUtil;

public class UserDAO {
	
	
	public void register(User user) throws Exception {
		String sql = "insert into users (name ,email,password) values (?,?,?)";
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, user.getName());
		pst.setString(2, user.getEmail());
		pst.setString(3, user.getPassword());

		int rows = pst.executeUpdate();
				System.out.println("No.of rows inserted:" +rows);
	}

	public User login(String email, String password) throws Exception {
		
		
		String sql = "select id,name,email,password from user where email=? and password=?";
		User user = null;
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);

		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
			int id = rs.getInt("id");
			String Name = rs.getString("Name");
			String Email = rs.getString("Email");
			String Password = rs.getString("Password");

			user = new User();
			user.setId(id);
			user.setName(Name);
			user.setEmail(Email);
			user.setPassword(Password);
		}
		return user;

	}

}


