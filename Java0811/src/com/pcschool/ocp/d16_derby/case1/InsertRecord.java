package com.pcschool.ocp.d16_derby.case1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertRecord {
	public static void main(String[] args) throws SQLException {
		String jdbcUrl = "jdbc:derby://localhost:1527/APP";
		String username = "app";
		String password = "app"; 
		
		// 建立資料庫鏈接
		Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
		String sql = "INSERT INTO book(bname, price) VALUES(?, ?)";
		PreparedStatement pstat = conn.prepareStatement(sql);
		pstat.setString(1, ".NET");
		pstat.setInt(2, 450);
		
		// 進行更新
		int rowcount = pstat.executeUpdate();
		if(rowcount > 0) {
			System.out.println("新增成功: " + rowcount);
		}else {
			System.out.println("新增失敗");
		}
	}
}
