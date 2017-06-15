package com.revature.divya;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.divya.util.ConnectionUtil;

public class BookDAO {

		public void addBook(Books user) throws Exception {
			String sql = "insert into book(name ,price,author_id,published_date)values(?,?,?,?)";
			Connection con = ConnectionUtil.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, user.getName());
			pst.setInt(2, user.getPrice());
			pst.setInt(3, user.getAuthour_id());
			pst.setDate(4, Date.valueOf(user.getPublished_date()));

			int rows = pst.executeUpdate();
			System.out.println(rows);
			System.out.println("booksDAO->register:" + user);

		}

		public void listbook(Books user) throws Exception {
			Connection con = ConnectionUtil.getConnection();
			String sql = "select id,name from books";
			PreparedStatement pst = con.prepareStatement(sql);
			List<Books> booklist = new ArrayList<Books>();
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				int authour_id = rs.getInt("author_id");
				Date published_date = rs.getDate("date");
				Books b = new Books();
				b.setName(name);
				b.setPrice(price);
				b.setAuthour_id(authour_id);
				b.setPublished_date(published_date.toLocalDate());
				booklist.add(b);
			}
			System.out.println(booklist);
			for (Books b : booklist) {
				System.out.println(b);
			}

		}
	}



