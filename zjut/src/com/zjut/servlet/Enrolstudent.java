package com.zjut.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zjut.entity.Student;
import com.zjut.factory.StuFactory;

public class Enrolstudent extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String dep=request.getParameter("dep");
		String sex=request.getParameter("sex");
		String jiguan=request.getParameter("jiguan");
		Student student=new Student();
		student.setId(id);
		student.setName(name);
		student.setPassword(password);
		student.setDep(dep);
		student.setSex(sex);
		student.setJiguan(jiguan);
		if(StuFactory.newInstance().enrolStudent(student))
		{
			HttpSession session=request.getSession();
			session.setAttribute("id", student.getId());		//»á»°¸ú×Ù
			response.sendRedirect("./student.jsp");
			return;
		}
		else
			response.sendRedirect("./enrol.jsp");
			return ;
		
		
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				doGet(request,response);
	}

}
