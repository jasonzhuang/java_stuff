package com.zjut.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zjut.entity.Teacher;
import com.zjut.factory.AdmFactory;

public class ModifyTeacher extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");			//����Ҫ����Ȼд�����ݿ������
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		String id=(String) session.getAttribute("id");
		Teacher teacher=new Teacher();
		teacher.setId(id);
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String title=request.getParameter("title");
		teacher.setName(name);
		teacher.setPassword(password);
		teacher.setTitle(title);
		if(AdmFactory.newInstance().modifyTeacher(teacher))
		{
			response.sendRedirect("./getTeacher.jsp");
			return;
		}else
		{
			out.println("��ʦ��Ϣ�޸�ʧ�ܣ�");
			out.println("<a href='modifyTeacher.jsp'>���²���</a>");
		}
		
		
		
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

				doGet(request,response);
		
	}

}
