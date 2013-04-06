package com.zjut.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zjut.entity.Student;
import com.zjut.entity.Teacher;
import com.zjut.factory.StuFactory;
import com.zjut.factory.TeacherFactory;

public class TeaLoginConfirm extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
	  String id=request.getParameter("id");
	  String password=request.getParameter("password");
	  Teacher tea=new Teacher();
	  tea.setId(id);
	  tea.setPassword(password);
	  if(TeacherFactory.newInstance().isLogin(tea))
	  {
		  HttpSession session=request.getSession();
		  session.setAttribute("id", id);    
		  response.sendRedirect("./teacher.jsp");//一定要加"./",否则页面出错
	  }
	  else
		  response.sendRedirect("./tea_login.jsp");
	  
}

    
public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

	doGet(request,response);
}
}