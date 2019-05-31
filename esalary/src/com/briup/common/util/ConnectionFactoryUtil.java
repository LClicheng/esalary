package com.briup.common.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactoryUtil {
	private static Connection conn;
	public static Connection getConnection(){
		if(conn==null){
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xuexiaogongzi", "root", "root");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	public static void free(Statement statement,Connection conn){
		free(null,statement,conn);
	}
	public static void free(
			ResultSet rs,Statement statement,Connection conn){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(statement!=null){
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
