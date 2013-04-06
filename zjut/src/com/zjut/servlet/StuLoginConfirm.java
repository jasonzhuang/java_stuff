package com.zjut.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zjut.database.ConnectionManager;
import com.zjut.entity.Student;
import com.zjut.factory.StuFactory;

public class StuLoginConfirm extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			response.setContentType("text/html");
			response.setCharacterEncoding("gbk");
			request.setCharacterEncoding("gbk");
		  String id=request.getParameter("id");
		  String password=request.getParameter("password");
		  Student stu=new Student();
		  stu.setId(id);
		  stu.setPassword(password);
		  if(StuFactory.newInstance().isLogin(stu))
		  {
			  HttpSession session=request.getSession();
			  session.setAttribute("id", id);       //保存学生id
			  response.sendRedirect("./student.jsp");//一定要加"./",否则页面出错
		  }
		  else
			  response.sendRedirect("./stu_login.jsp");
		  
}
	
	    
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request,response);
	}

}
