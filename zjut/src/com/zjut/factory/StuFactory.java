package com.zjut.factory;


import com.zjut.dao.StuDao;
import com.zjut.dao.impl.StuDaoImpl;
import com.zjut.entity.Administrator;
import com.zjut.entity.Student;
import com.zjut.entity.Teacher;

public class StuFactory {
	
	public static StuDao newInstance() {
		return new StuDaoImpl();
	}
		
		


}

