package com.zjut.dao;

import java.util.List;

import com.zjut.entity.*;

public interface AdminDao {
   public boolean isLogin(Administrator adm);
   public List<Teacher> getAllTeacher();
   public boolean modifyTeacher(Teacher teacher);
   public boolean addCourse(Course course);
}
