package com.pcschool.ocp.d16_derby.case2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {
	public static void main(String[] args) throws SQLException {
		String jdbcUrl = "jdbc:derby://localhost:1527/APP";
		String username = "app";
		String password = "app"; 
		
		// 建立資料庫鏈接
		Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
		
		Statement stat = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
	
		String sql = "SELECT * FROM book WHERE id = 2";
		ResultSet rs = stat.executeQuery(sql);
		if(rs.last()) { // 將游標指向該筆紀錄
			rs.updateInt("price", 350);
			rs.updateRow();
//	 		rs.cancelRowUpdates();
			System.out.println("Update Sucess");
		} else {
			System.out.println("Update Error");
		}
		conn.close();
	}
}
