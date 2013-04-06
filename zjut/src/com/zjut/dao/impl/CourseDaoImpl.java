package com.zjut.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.zjut.dao.CourseDao;
import com.zjut.database.ConnectionManager;
import com.zjut.entity.Course;

public class CourseDaoImpl implements CourseDao {
	
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private Statement stmt=null;
	private ResultSet rs = null;
	public CourseDaoImpl()
	{
		
	}
	public List<Course> getAllCourse() {
		ArrayList<Course> courses = new ArrayList<Course>();
		conn = ConnectionManager.getConnection();
		String sql="select course.id as \'id\' ,course.name as \'name\',course.dep as \'dep\',"+
		"classes.id as \'class_id\',"+
		"teacher.name as \'tea_name\'"+
		"from course,classes,teacher "+
		"where classes.tea_id=teacher.id and classes.cour_id=course.id";
		try{
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs != null && rs.next()) {
				Course course= new Course();
				course.setId(rs.getString("id"));
				course.setName(rs.getString("name"));
				course.setDep(rs.getString("dep"));
				course.setClassid(rs.getString("class_id"));
				course.setTeachername(rs.getString("tea_name"));
				courses.add(course);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.closeResultSet(rs);
			ConnectionManager.closeStatement(stmt);
			ConnectionManager.closeConnection(conn);
		}
		return courses;
		
	
	}
		
}
