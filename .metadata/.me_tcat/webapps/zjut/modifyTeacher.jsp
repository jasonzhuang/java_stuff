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
    <title>修改教师信息</title>

  </head>
  <body>
<% 
String tea_id=request.getParameter("teacher_id"); 
session.setAttribute("id",String.valueOf(tea_id)); 
%>
<p align="center">更新教师</p>
<form action="modifyTeacher" method="post">
<table width="51%"  border="1" align="center">
    <tr> 
      <td width="33%">教师姓名</td>
      <td width="67%"><input name="name" type="text" ></td>
    </tr>
    <tr> 
      <td>密码</td>
      <td><input name="password" type="password" ></td>
    </tr>
    <tr> 
      <td>职称</td>
      <td><select name="title" size="1" >
          <option value="讲师">讲师</option>
          <option value="副教授">副教授</option>
          <option value="教授">教授</option>
        </select></td>
    </tr>
  </table>
   <p align="center"> 
    <input type="submit" name="submit" value="提交">
  </p>

</form>
  </body>
</html>
