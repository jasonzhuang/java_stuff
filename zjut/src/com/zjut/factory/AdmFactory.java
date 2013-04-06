package com.zjut.factory;

import com.zjut.dao.AdminDao;
import com.zjut.dao.impl.AdmDaoImpl;



public class AdmFactory {
	public static AdminDao newInstance() {
		return  new AdmDaoImpl();
	}
}
