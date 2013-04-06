package com.zjut.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zjut.entity.Course;
import com.zjut.factory.AdmFactory;

public class Addcourse extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String name=request.getParameter("name");
		String course_id=request.getParameter("course_id");
		String mark=request.getParameter("mark");
		String dep=request.getParameter("dep");
		Course course=new Course();
		course.setId(course_id);
		course.setName(name);
		course.setDep(dep);
		course.setMark(mark);
		if(AdmFactory.newInstance().addCourse(course)){
			out.println("添加课程成功");
		}else
			response.sendRedirect("./Addcourse.jsp");
		
		
		
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request,response);
	}

}
