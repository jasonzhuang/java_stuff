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
	 * ��̬�飬�������ݿ���������
	 */
	static {
		try {
			Class.forName(sqlDriver);
		}  catch (ClassNotFoundException e) {
			e.printStackTrace();
	}
}

	
	/**
	 * ���ӷ���
	 * @return ����Connection����
	 */
	public static Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,user,password);
			//System.out.println("�������ݿ�ɹ�");//������
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return con;
	}
	
	/**
	 * �ر�Connection����
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
	 * �ر�ResultSet����
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
	 * �ر�CallableStatement����
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


