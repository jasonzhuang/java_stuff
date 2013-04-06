<%@ page language="java"
	import="java.util.*,java.sql.*,com.zjut.dao.impl.*,com.zjut.factory.*,com.zjut.entity.*"
	pageEncoding="utf-8"%>
<%@page session="true"%>
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
<title>查看已修课程</title>
</head>
<body>
<br>
<br>
<p align="center"><font size="3">您已选课程: </font></p>
<table border="1" align="center">
	<tr>
		<td width="54">课程号</td>
		<td width="54">课程名</td>
		<td width="80">开课学院</td>
		<td width="59">班级号</td>
		<td width="88">教师</td>
		<td with="95">上课地点</td>
		<td with="100">选择操作</td>
	</tr>
	<%
  	String stu_id=(String)session.getAttribute("id");
	List<Course> selectedCourses=StuFactory.newInstance().getCourse(stu_id);
	Iterator<Course> iter = selectedCourses.iterator();
	while (iter.hasNext()) {
			Course course = iter.next();
	%>
	<tr>
		<td align="center"><%=course.getId()%></td>
		<td align="center"><%=course.getName()%></td>
		<td align="center"><%=course.getDep()%></td>
		<td align="center"><%=course.getClassid()%></td>
		<td align="center"><%=course.getTeachername()%></td>
		<td align="center"><%=course.getAddress()%></td>
		<td align="center"><a
			href="./deleteCourse?class_id=<%=course.getClassid()%>">删除</a>
	</tr>
	<%}%>
</table>
<p>
<p>
<center><a href="./student.jsp?id=<%=stu_id%>">回到个人主页</a></center>
</body>
</html>
