<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>


<%String name=request.getParameter("user");
String password=request.getParameter("pwd");%>
<% if(name.equals("TEACHER")&&password.equals("TEACHER")){
session.setAttribute("success","name");
out.println("登陆成功");}
else{%>
<%--<jsp:forward page="login.html" />--%>
<%--将forword注释掉，以友好的方式提示输入有误--%>
用户名或密码输入错误
<% }%>
 

  