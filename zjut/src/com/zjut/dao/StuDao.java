package com.zjut.dao;

import java.util.List;

import com.zjut.entity.Course;
import com.zjut.entity.Student;

public interface StuDao {
	public boolean isLogin(Student stu);
	public boolean enrolCourse(String stu_id,String class_id);
	public List<Course> getCourse(String stu_id);
	public boolean enrolStudent(Student stu);
	public boolean update(Student stu);
	public boolean hasEnrolCourse(String stu_id,String class_id);
	
}
