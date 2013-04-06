package com.zjut.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.zjut.dao.TeacherDao;
import com.zjut.database.ConnectionManager;
import com.zjut.entity.Course;
import com.zjut.entity.Student;
import com.zjut.entity.Teacher;

public class TeacherDaoImpl implements TeacherDao{

	private Connection conn = null;
	private Statement stmt=null;
	private PreparedStatement psmt = null;
	private ResultSet rs=null;
	
	public boolean isLogin(Teacher tea) {
		boolean flag = false;
		conn = ConnectionManager.getConnection();
	    String id=tea.getId();
	    String password=tea.getPassword();
		String sql="select * from teacher";
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

	public List<Student> getStudents(String tea_id) {
		ArrayList<Student> students = new ArrayList<Student>();
		conn = ConnectionManager.getConnection();
		String sql="select distinct student.id as \'id\' ,student.name as \'name\' ,student.department as \'dep\' "+
				" from student,classes,enrol"+
				" where student.id =enrol.stu_id"+
				" and classes.id=enrol.class_id "+
				" and classes.tea_id='"+tea_id+"' ";
		try
		{
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while (rs != null && rs.next()) {
				Student stu=new Student();
				stu.setId(rs.getString("id"));
				stu.setName(rs.getString("name"));
				stu.setDep(rs.getString("dep"));
				students.add(stu);
			}
		}catch(SQLException e)
		{
		e.printStackTrace();
		}finally {
		ConnectionManager.closeStatement(stmt);
		ConnectionManager.closeConnection(conn);
		}
		return students;
	}

	public List<Course> getCourses(String tea_id) {
		ArrayList<Course> courses = new ArrayList<Course>();
		conn = ConnectionManager.getConnection();
		String sql="select classes.id,course.name  "+
		"from classes,course "+
		"where course.id=classes.cour_id "+
		"and classes.tea_id='"+tea_id+"' ";
		try
		{
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while (rs != null && rs.next()) {
				Course course=new Course();
				course.setClassid(rs.getString("classes.id"));
				course.setName(rs.getString("course.name"));
				courses.add(course);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
		ConnectionManager.closeStatement(stmt);
		ConnectionManager.closeConnection(conn);
		}
	return courses;
	}

	public boolean giveScore(String stu_id,String class_id,String score) {
		boolean flag = false;
		conn = ConnectionManager.getConnection();
		try
		{
			psmt=conn.prepareStatement("update enrol set score=? where stu_id=? and class_id=?");
			psmt.setString(1, score);
			psmt.setString(2,stu_id );
			psmt.setString(3,class_id );
			if(psmt.executeUpdate()>0)
				flag=true;
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}finally {
			ConnectionManager.closePrepareStatement(psmt);
			ConnectionManager.closeConnection(conn);
			}
		return flag;
	}
}
