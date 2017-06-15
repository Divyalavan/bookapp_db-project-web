package com.revature.divya;

import java.time.LocalDate;

public class OrderDAOTest {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Order order = new Order();
			order.setUserId(4);
			order.setBookId(5);
			order.setQuantity(5);
			order.setStatus("delievered");
			order.setOrderDate(LocalDate.now());
			System.out.println(order);

		}

	}



