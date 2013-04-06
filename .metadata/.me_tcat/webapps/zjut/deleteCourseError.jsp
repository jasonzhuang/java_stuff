<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>错误提示</title>
  </head>
  <body>
   <%	   
	String stu_id=(String)session.getAttribute("id");  
%>	
<center>
   删除课程出错<p>
   <a href="./student.jsp?id=<%=stu_id%>">回到个人主页</a>
 </p>
 </center>  
  </body>
</html>
