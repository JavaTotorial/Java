package com.pcschool.ocp.finish.d16_derby.case1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class UpdateRecord {
	public static void main(String[] args) throws SQLException {
		String jdbcUrl = "jdbc:derby://localhost:1527/APP";
		String username = "app";
		String password = "app"; 
		
		// 建立資料庫鏈接
		Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
		String sql = "UPDATE book SET price = ? WHERE id = ?";
		PreparedStatement pstat = conn.prepareStatement(sql);
		pstat.setInt(1, new Random().nextInt(1000));
		pstat.setInt(2, 1);
		
		// 進行更新
		int rowcount = pstat.executeUpdate();
		if(rowcount > 0) {
			System.out.println("修改成功: " + rowcount);
		}else {
			System.out.println("修改失敗");
		}
	}
}
