package com.zjut.dao;

import java.util.List;

import com.zjut.entity.Course;
import com.zjut.entity.Student;
import com.zjut.entity.Teacher;

public interface TeacherDao {
		public boolean isLogin(Teacher tea);
		public List<Student> getStudents(String tea_id);
		public List<Course> getCourses(String tea_id);
		public boolean giveScore(String stu_id,String class_id,String score);
}
