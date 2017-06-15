package com.revature.divya;

import java.time.LocalDate;

public class BookDAOTest {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Books book = new Books();
			book.setName("divi");
			book.setPrice(2000);
			book.setAuthour_id(1);
			book.setPublished_date(LocalDate.now());
			System.out.println(book);

		}

	}



