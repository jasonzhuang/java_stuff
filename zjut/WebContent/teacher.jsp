<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>教师页面</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
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
</head>
<body>
<p>
<%
	String id = (String)session.getAttribute("id");
	if(id==null){response.sendRedirect("./tea_login.jsp");}                                 
%>
</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p align="center">&nbsp;</p>
<p align="center"><span class="STYLE3">您已成功登陆，请选择操作：</span></p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<table width="58%" border="0" align="center">
	<tr>
		<td width="30%">
		<div align="right"><a href="./showMyStu.jsp">查看学生</a></div>
		</td>
		<td width="32%">
		<div align="center"><a href="./giveScore.jsp">录入成绩</a></div>
		</td>
		<td width="38%">
		<div align="left"><a href="./showClasses.jsp">查看代课班级信息</a></div>
		</td>
	</tr>
</table>
</html>
