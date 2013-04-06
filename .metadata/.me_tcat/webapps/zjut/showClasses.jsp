<%@ page language="java" import="java.util.*,java.sql.*,com.zjut.dao.impl.*,com.zjut.factory.*,com.zjut.entity.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
      <style type="text/css">
  body{
	background-image: url("images/42wallpage1280.jpg");
	background-position:center;
  background-repeat:%100%50;
	background-repeat: no-repeat;
  }
  </style>
    <title></title>
  </head> 
  <body>
<%
	String tea_id = (String)session.getAttribute("id");
%>
<p align="center"><font  size="3" >您的课程信息 </font></p>
	<table border="1" align="center">
  	<tr>
    <td width="80">课程号</td>
    <td width="80">课程名</td>
  	</tr>
  <%
	
	List<Course> courses=TeacherFactory.newInstance().getCourses(tea_id);
	Iterator<Course> iter = courses.iterator();
	while (iter.hasNext()) {
			Course course = iter.next();
	%>
		<tr >
			<td align="center"><%=course.getClassid()%></td>
			<td align="center"><%=course.getName()%></td>	
		</tr>
<%}%>
</table><p>
<center>
  <a href="./teacher.jsp?id=<%=tea_id%>"><font color="orange">回到个人主页</font></a>
 </center>
  </body>
  </body>
</html>
