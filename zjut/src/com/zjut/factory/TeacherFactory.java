package com.zjut.factory;

import com.zjut.dao.TeacherDao;
import com.zjut.dao.impl.TeacherDaoImpl;



public class TeacherFactory {
	public static TeacherDao newInstance() {
		return new TeacherDaoImpl();
	}
}
