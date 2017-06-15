package com.revature.divya;

import java.time.LocalDate;

public class BookListTest {

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			Books book = new Books();
			book.setName("divya");
			book.setPrice(2000);
			book.setAuthour_id(1);
			book.setPublished_date(LocalDate.now());
			BookDAO bookDAO = new BookDAO();
			bookDAO.listbook(book);

		}

	}



