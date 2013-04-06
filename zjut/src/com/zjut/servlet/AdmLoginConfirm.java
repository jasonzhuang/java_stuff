package com.zjut.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zjut.entity.Administrator;
import com.zjut.entity.Student;
import com.zjut.factory.AdmFactory;
import com.zjut.factory.StuFactory;

public class AdmLoginConfirm extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("gbk");
		request.setCharacterEncoding("gbk");
		HttpSession session=request.getSession(true);//用于跟踪会话
		
	  String id=request.getParameter("id");
	  session.setAttribute("id",id);//将id保存到session
	  String password=request.getParameter("password");
	  Administrator adm=new Administrator();
	  adm.setId(id);
	  adm.setPassword(password);
	  if(AdmFactory.newInstance().isLogin(adm))
	  {  
		  response.sendRedirect("./admin.jsp");//一定要加"./",否则页面出错
	  }
	  else
		  response.sendRedirect("./adm_login.jsp");
	  
}

    
public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

	doGet(request,response);
}


}
