<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>


<%String name=request.getParameter("user");
String password=request.getParameter("pwd");%>
<% if(name.equals("TEACHER")&&password.equals("TEACHER")){
session.setAttribute("success","name");
out.println("��½�ɹ�");}
else{%>
<%--<jsp:forward page="login.html" />--%>
<%--��forwordע�͵������Ѻõķ�ʽ��ʾ��������--%>
�û����������������
<% }%>
 

  