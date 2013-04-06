<%@ page language="java"
	import="java.util.*,java.sql.*,com.zjut.dao.impl.*,com.zjut.factory.*,com.zjut.entity.*"
	pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style type="text/css">
<!--
body {
	background-image: url(images/bb286.gif);
	background-repeat: repeat-y;
	background-position: center;
}

.STYLE3 {
	color: #000080;
	font-weight: bold;
}
-->
</style>
<title>选修课程</title>
</head>
<body>
<p align="center"><font size="3">您可以选报的课程为 </font></p>
<table border="1" align="center">
	<tr>
		<td width="54">课程号</td>
		<td width="54">课程名</td>
		<td width="80">开课学院</td>
		<td width="59">班级号</td>
		<td width="88">教师</td>
		<td width="83">选择</td>
	</tr>
	<%
	
	List<Course> courses=CourseFactory.newInstance().getAllCourse();
	Iterator<Course> iter = courses.iterator();
	while (iter.hasNext()) {
			Course course = iter.next();
	%>
	<tr>
		<td align="center"><%=course.getId()%></td>
		<td align="center"><%=course.getName()%></td>
		<td align="center"><%=course.getDep()%></td>
		<td align="center"><%=course.getClassid()%></td>
		<td align="center"><%=course.getTeachername()%></td>
		<td width="83"><a
			href="./enrolCourse?class_id=<%=course.getClassid()%>">选修</a></td>
	</tr>
	<%}%>
</table>
<%	  
	String stu_id=(String)session.getAttribute("id"); 
%>
<p>
<p>
<center><a href="./student.jsp?id=<%=stu_id%>">回到个人主页</a></center>
</body>
</html>

