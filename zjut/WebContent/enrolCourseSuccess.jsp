<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

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
<title>选课成功</title>
</head>
<body>
<%	   
	String stu_id=(String)session.getAttribute("id");  
%>
<center><front color="orange"><strong>选课成功</strong></font>
<p>
<p><a href="./student.jsp?id=<%=stu_id%>">回到个人主页</a>
</center>
</body>
</html>
