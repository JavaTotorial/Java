package com.pcschool.ocp.d16_derby.case4_book;

import java.sql.Connection;
import java.sql.DriverManager;

public class BookDao {
	private static final BookDao DAO = new BookDao();
	private Connection conn;
	
	private BookDao() {
		String jdbcUrl = "jdbc:derby://localhost:1527/APP";
		String username = "app";
		String password = "app";
		try {
			conn = DriverManager.getConnection(jdbcUrl, username, password);
		} catch (Exception e) {
		}
	}
	
	public Connection getConn() {
		return conn;
	}

	public static BookDao getInstance() {
		return DAO;
	}

	@Override
	protected void finalize() throws Throwable {
		if(conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
			}
		}
	}
}
