package com.zjut.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zjut.factory.TeacherFactory;

public class GiveScore extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String tea_id =(String) request.getAttribute("tea_id");
		String class_id=request.getParameter("class_id");
		String stu_id=request.getParameter("stu_id");
		String score=request.getParameter("score");
		if(TeacherFactory.newInstance().giveScore(stu_id, class_id, score))
		{
			request.getRequestDispatcher("./giveScoreSuccess.jsp").forward(request, response);
		}
		else
			request.getRequestDispatcher("./giveScore.jsp").forward(request, response);
		
		
	
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
		
	}

}
