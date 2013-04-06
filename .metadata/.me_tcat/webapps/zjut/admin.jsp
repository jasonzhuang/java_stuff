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
    <title>Admin</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
<body>
<p>
<%
String admin_id = (String)session.getAttribute("id"); 
if(admin_id==null){response.sendRedirect("./adm_login.jsp");}         
%>
<p>
<p>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<p align="center">  <font color="blue" >您已经成功通过验证! 您可以更改以下内容：</font>
<p align="center">
<p align="center">
<br>
<br>
<table align="center" >
  <tr>
    <td ><a href="getTeacher.jsp">查看教师&gt;&gt;</a></td>
    <td><a href="Addcourse.jsp">新增课程</a>
  </tr>
</table>
</body>

</html>