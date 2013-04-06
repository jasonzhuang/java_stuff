package com.zjut.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.zjut.factory.StuFactory;
import com.zjut.dao.impl.*;


public class enrolCourse extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		String stu_id=(String) session.getAttribute("id");  //得到学号,以便知道是哪个学生注册课程
		String class_id=new String(request.getParameter("class_id").getBytes("utf-8"),"gbk");   //通过url得到课程号
		if(stu_id==null||class_id==null||stu_id.equals("")||class_id.equals(""))
		{
			response.sendRedirect("./displayCourse.jsp");
			return;
		}
		else if(StuFactory.newInstance().hasEnrolCourse(stu_id, class_id))
		{
			request.getRequestDispatcher("./hasEnrolCourse.jsp").forward(request, response);
		}
		else if(StuFactory.newInstance().enrolCourse(stu_id, class_id))
		{
			request.getRequestDispatcher("./enrolCourseSuccess.jsp").forward(request, response);
		}else
		{
			response.sendRedirect("./displayCourse.jsp");
			return;
		}
			
	
}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

					doGet(request,response);

		}
}
