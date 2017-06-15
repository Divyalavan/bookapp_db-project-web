package com.revature.divya;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import com.divya.util.ConnectionUtil;

public class OrderDAO {
		public void bookOrder(Order order) throws Exception {
			String sql = "insert into users (user_id,book_id,quantity,status,order_date) values (?,?,?,?)";
			Connection con = ConnectionUtil.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, order.getUserId());
			pst.setInt(2, order.getBookId());
			pst.setInt(3, order.getQuantity());
			pst.setString(4, order.getStatus());
			pst.setDate(5, Date.valueOf(order.getOrderDate()));

			int rows = pst.executeUpdate();
			System.out.println(rows);
			System.out.println("OrderDAO->register:" + order);
		}

	}



