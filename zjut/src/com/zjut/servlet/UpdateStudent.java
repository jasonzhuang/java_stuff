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

public class UpdateStudent extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		String stu_id=(String) session.getAttribute("id"); 
		String password=request.getParameter("password");
		String tel=request.getParameter("tel");
		String email=request.getParameter("email");
		String dep=request.getParameter("dep");
		Student stu=new Student();
		stu.setId(stu_id);
		stu.setPassword(password);
		stu.setTel(tel);
		stu.setEmail(email);
		stu.setDep(dep);
		if(StuFactory.newInstance().update(stu))
		{
			request.getRequestDispatcher("./updateSuucess.jsp").forward(request, response);
			
		}
		else
			request.getRequestDispatcher("./updateStudent.jsp").forward(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request,response);
		
	}

}
