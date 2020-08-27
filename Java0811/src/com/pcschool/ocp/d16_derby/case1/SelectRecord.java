package com.pcschool.ocp.d16_derby.case1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SelectRecord {
	public static void main(String[] args) throws SQLException {
		
		String jdbcUrl = "jdbc:derby://localhost:1527/App";
		String username = "app";
		String password = "app"; 
		
		// 建立資料庫鏈接
		Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
		
		// 建立 Statement 物件
		Statement stat = conn.createStatement();
		
		// 執行查詢語句
		String sql = "SELECT * FROM book";
		ResultSet rs = stat.executeQuery(sql);
		
		// 將資料輪詢後印出
		ResultSetMetaData md = rs.getMetaData();
		System.out.printf("%4s %10s %4s %30s", md.getColumnName(1), md.getColumnName(2), md.getColumnName(3), md.getColumnName(4));
		while(rs.next()) {
			int id =  rs.getInt("id");
			String bname = rs.getString("bname");
			int price = rs.getInt("price");
			Date ts = rs.getTimestamp("ts");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
			System.out.printf("%4d %10s %4d %50s\n", id, bname, price, sdf.format(ts));
		}
		
		conn.close();
	}
}
