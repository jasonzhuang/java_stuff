<%@ page language="java" import="java.util.*,java.sql.*,com.zjut.dao.impl.*,com.zjut.factory.*,com.zjut.entity.*" pageEncoding="utf-8"%>

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
    <title>操作教师</title>
  </head>
  <body>
 <table width="75%"  border="1" align="center">
    <tr> 
      <td>教师编号</td>
      <td>姓名</td>
      <td>职称</td>
      <td>密码</td>
      <td>更改</td>
    </tr>
     <%
	String teacher_id,teacher_name,title,password;
	List<Teacher> teachers=AdmFactory.newInstance().getAllTeacher();
	Iterator<Teacher> iter = teachers.iterator();
	while (iter.hasNext()) {
			Teacher teacher = iter.next();
	%>
		<tr >
			<td align="center"><%=teacher.getId()%></td>
			<td align="center"><%=teacher.getName()%></td>
			<td align="center"><%=teacher.getTitle()%></td>
			<td align="center"><%=teacher.getPassword()%></td>
			<td><a href="modifyTeacher.jsp?teacher_id=<%=teacher.getId()%>">更改</td>
		</tr>
<%}%>
  </body>
</html>
