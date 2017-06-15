package com.revature.divya;

import com.divya.model.User;

public class TestUserDAO {

		

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User();
		user.setName("divya");
		user.setEmail("divyaselvaraj77@gmail.com");
		user.setPassword("pass123");

		UserDAO userDAO = new UserDAO();
		userDAO.register(user);
	}

}

