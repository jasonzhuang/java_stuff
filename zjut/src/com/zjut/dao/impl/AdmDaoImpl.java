package com.zjut.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.zjut.dao.AdminDao;
import com.zjut.database.ConnectionManager;
import com.zjut.entity.Administrator;
import com.zjut.entity.Course;
import com.zjut.entity.Student;
import com.zjut.entity.Teacher;

public class AdmDaoImpl implements AdminDao{
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private Statement stmt=null;
	private ResultSet rs = null;
	
	public boolean isLogin(Administrator adm) {
		boolean flag = false;
		conn = ConnectionManager.getConnection();
	    String id=adm.getId();
	    String password=adm.getPassword();
		String sql="select * from admin";
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				
				if(rs.getString("id").equals(id)&&rs.getString("password").equals(password))
					flag = true;
			}
				
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		} finally {
			
			ConnectionManager.closeConnection(conn);
		}
		return flag;
	}
	public List<Teacher> getAllTeacher()
	{
		ArrayList<Teacher> teachers = new ArrayList<Teacher>();
		conn = ConnectionManager.getConnection();
		String sql="select * from teacher";
		try{
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs != null && rs.next()) {
				Teacher teacher= new Teacher();
				teacher.setId(rs.getString("id"));
				teacher.setName(rs.getString("name"));
				teacher.setTitle(rs.getString("title"));
				teacher.setPassword(rs.getString("password"));
				teachers.add(teacher);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.closeResultSet(rs);
			ConnectionManager.closeStatement(stmt);
			ConnectionManager.closeConnection(conn);
		}
		return teachers;
	}
	public boolean modifyTeacher(Teacher teacher) {
		boolean flag = false;
		conn = ConnectionManager.getConnection();
		try{
			psmt=conn.prepareStatement("update teacher set name=?,password=?,title=? where id=?");
			psmt.setString(1, teacher.getName());
			psmt.setString(2, teacher.getPassword());
			psmt.setString(3, teacher.getTitle());
			psmt.setString(4, teacher.getId());
			if (psmt.executeUpdate() > 0) {
				flag = true;
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}finally
		{
			ConnectionManager.closeConnection(conn);
		}
		return flag;
	}
	public boolean addCourse(Course course) {
		boolean flag = false;
		conn = ConnectionManager.getConnection();
		try{
			psmt=conn.prepareStatement("insert into course(id,name,mark,dep) values(?,?,?,?)");
			psmt.setString(1, course.getId());
			psmt.setString(2, course.getName());
			psmt.setString(3, course.getMark());
			psmt.setString(4, course.getDep());
			if(psmt.executeUpdate()>0){
				flag=true;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally
		{
			ConnectionManager.closeConnection(conn);
		}
		return flag;
	}
	

}
