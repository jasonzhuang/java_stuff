<%@ page language="java"
	import="java.util.*,java.sql.*,com.zjut.dao.impl.*,com.zjut.factory.*,com.zjut.entity.*"
	pageEncoding="utf-8"%>
<%@page import="com.zjut.factory.TeacherFactory"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style type="text/css">
body {
	background-image: url("images/42wallpage1280.jpg");
	background-position: center;
	background-repeat: % 100% 50;
	background-repeat: no-repeat;
}
</style>
<title>查看我的学生</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<%
	String tea_id = (String)session.getAttribute("id");
%>
<p align="center">&nbsp;</p>
<p align="center">&nbsp;</p>
<p align="center"><font size="3">选择您的学生 </font></p>
<table border="1" align="center">
	<tr>
		<td width="150">学号</td>
		<td width="174">姓名</td>
		<td width="163">所在学院</td>
	</tr>
	<%
	
	List<Student> students=TeacherFactory.newInstance().getStudents(tea_id);
	Iterator<Student> iter = students.iterator();
	while (iter.hasNext()) {
			Student student = iter.next();
	%>
	<tr>
		<td align="center"><%=student.getId()%></td>
		<td align="center"><%=student.getName()%></td>
		<td align="center"><%=student.getDep()%></td>
	</tr>
	<%}%>
</table>
<p align="right">
<p align="right">
<p align="right">
<p align="center"><a href="./teacher.jsp?id=<%=tea_id%>">回到个人主页</a>
</body>
</html>
