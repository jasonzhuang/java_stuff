package com.zjut.dao.impl;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import com.zjut.dao.StuDao;
import com.zjut.database.ConnectionManager;
import com.zjut.entity.Course;
import com.zjut.entity.Student;

public class StuDaoImpl implements StuDao {
	
	private Connection conn = null;
	private Statement stmt=null;
	private PreparedStatement psmt = null;
	private ResultSet rs=null;
	
	public boolean isLogin(Student stu) {
		boolean flag = false;
		conn = ConnectionManager.getConnection();
	    String id=stu.getId();
	    String password=stu.getPassword();
		String sql="select * from student";
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
	
	public boolean enrolCourse(String stu_id,String class_id) 
	{
		boolean flag = false;
		conn = ConnectionManager.getConnection();
		try{
			psmt = conn.prepareStatement("insert into enrol(stu_id,class_id) values(?,?)");
			psmt.setString(1,stu_id );
			psmt.setString(2,class_id);//注意中文乱码处理
			if (psmt.executeUpdate() > 0) {
				flag = true;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			ConnectionManager.closePrepareStatement(psmt);
			ConnectionManager.closeConnection(conn);
		}
		return flag;
	}
	
	public List<Course> getCourse(String stu_id)
    { 
			ArrayList<Course> courses = new ArrayList<Course>();
			conn = ConnectionManager.getConnection();
			String sql="select  course.id as \'id\' ,course.name as \'name\',course.dep as \'dep\',"+
			"classes.id as \'class_id\',classes.address as \'address\',"+
			"teacher.name as \'tea_name\' "+
			" from course,classes,teacher "+
			" where classes.cour_id=course.id "+
			" and classes.tea_id=teacher.id "+
			" and classes.id in "+
			"( select class_id from enrol "+
			" where stu_id='"+stu_id+"') ";
				
			
			try
			{
				stmt=conn.createStatement();
				rs=stmt.executeQuery(sql);
				while (rs != null && rs.next()) {
					Course course= new Course();
					course.setId(rs.getString("id"));
					course.setName(rs.getString("name"));
					course.setDep(rs.getString("dep"));
					course.setClassid(rs.getString("class_id"));
					course.setTeachername(rs.getString("tea_name"));
					course.setAddress(rs.getString("address"));
					courses.add(course);
				}
			}catch(SQLException e){
				e.printStackTrace();
			}finally {
				ConnectionManager.closePrepareStatement(psmt);
				ConnectionManager.closeConnection(conn);
			}
  		return courses;
  	  }

	public boolean enrolStudent(Student stu) {
		boolean flag = false;
		conn = ConnectionManager.getConnection();
		try{
			
			psmt = conn.prepareStatement("insert into student(id,name,password,jiguan,department,sex)" +
					" values(?,?,?,?,?,?)");
			psmt.setString(1,stu.getId());
			psmt.setString(2,stu.getName());
			psmt.setString(3,stu.getPassword());
			psmt.setString(4,stu.getJiguan());
			psmt.setString(5,stu.getDep());
			psmt.setString(6,stu.getSex());
		
			if (psmt.executeUpdate() > 0) {
				flag = true;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			ConnectionManager.closePrepareStatement(psmt);
			ConnectionManager.closeConnection(conn);
		}
		return flag;
	}

	public boolean update(Student stu) {
		boolean flag = false;
		conn = ConnectionManager.getConnection();
	    String id=stu.getId();
	    try
	    {
	    	psmt=conn.prepareStatement("update student set password=?,tel=?,e_mail=?,department=? where id='"+id+"'");
	    	psmt.setString(1, stu.getPassword());
	    	psmt.setString(2, stu.getTel());
	    	psmt.setString(3,stu.getEmail());
	    	psmt.setString(4, stu.getDep());
	    	if(psmt.executeUpdate()>0)
	    	{
	    		flag=true;
	    	}
	    	
	    }catch(SQLException e)
	    {
	    	e.printStackTrace();
	    }finally {
			ConnectionManager.closePrepareStatement(psmt);
			ConnectionManager.closeConnection(conn);
		}
	    return flag;
	    
	}

	public boolean hasEnrolCourse(String stu_id,String class_id) {
		boolean flag = false;
		conn = ConnectionManager.getConnection();
		String sql="select * from enrol where stu_id='"+stu_id +"'"+" and class_id='"+class_id+"'";
	    try
	    {
	    	stmt=conn.createStatement();
	    	ResultSet rs=stmt.executeQuery(sql);
	    	if(rs.next()){
	    		flag=true;
	    		
	    	}
	    }catch(SQLException e)
	    {
	    		e.printStackTrace();
	    }finally
	    {
	    	ConnectionManager.closeStatement(stmt);
	    	ConnectionManager.closeConnection(conn);
	    }
		return flag;
	} 
  	                          
}
