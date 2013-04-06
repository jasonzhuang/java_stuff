package com.zjut.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager {
	private static String sqlDriver="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/manager";
	private static String user="root";
	private static String password="123456";
	public ConnectionManager() {
		
	
	}
	
	/**
	 * 静态块，加载数据库连接驱动
	 */
	static {
		try {
			Class.forName(sqlDriver);
		}  catch (ClassNotFoundException e) {
			e.printStackTrace();
	}
}

	
	/**
	 * 连接方法
	 * @return 返回Connection对象
	 */
	public static Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,user,password);
			//System.out.println("连接数据库成功");//测试用
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return con;
	}
	
	/**
	 * 关闭Connection对象
	 * @param conn
	 */
	public static void closeConnection(Connection con) {
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
	}
	
	/**
	 * 关闭ResultSet对象
	 * @param rs
	 */
	public static void closeResultSet(ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	
	/**
	 * 关闭CallableStatement对象
	 * @param cstmt
	 */
	public static void closePrepareStatement(java.sql.PreparedStatement psmt) {
		try {
			if (psmt != null) {
				psmt.close();
			}
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
	}
	public static void closeStatement(Statement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
	}
	
}


