<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title></title>
	</head>
  <body>
    <form action="forward.jsp" method="post">
<center>
姓名:<input type="text" name="name">
密码:<input type="password" name="pwd">
<select name="logintype">
        <option value="student">学生</option>
        <option value="teacher">教师</option>
</select>
<input type="submit" value="登陆">
</center>
</form>
  </body>
</html>
