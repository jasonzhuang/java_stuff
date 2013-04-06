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
    <title></title>
  </head>
  <body>
  <%
	String tea_id = (String)session.getAttribute("id");
%>
   <font color="blue" size='10'><strong>打分成功</strong></font><p>
     <p align="center"><a href="./teacher.jsp?id=<%=tea_id%>">回到个人主页</a>
  </body>
  
</html>
