package com.zjut.factory;

import com.zjut.dao.CourseDao;
import com.zjut.dao.impl.CourseDaoImpl;

public class CourseFactory {
	public static CourseDao newInstance()
	{
		return new CourseDaoImpl();
	}
}
