<%@ page language="java" import="java.util.*,com.zjut.listener.*"
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
<title>学生页面</title>
</head>
<p>
<%
	String id = (String)session.getAttribute("id");
	if(id==null){response.sendRedirect("./stu_login.jsp");}                                 
%> <br>
</p>
<p>&nbsp;</p>
<p><br>
<br>
<center><font size="3">您已经成功通过验证! 您可以使用如下服务：</font></center>
</p>
<br>
<br>
<br>
<table width="58%" border="0" align="center">
	<tr>
		<td width="31%">
		<div align="right"><a href="./displayCourse.jsp">选修课程</a></div>
		</td>
		<td width="37%">
		<div align="center"><a href="./selectedCourse.jsp">查看已选课程</a></div>
		</td>
		<td width="32%"><a href="./updateStudent.jsp">修改个人信息</a></td>
	</tr>
</table>
<p>
<h3>在线用户数量：</h3>
<%=OnlineListener.getCount()%>
<center><a href="./logout">注销</a></center>
</html>
