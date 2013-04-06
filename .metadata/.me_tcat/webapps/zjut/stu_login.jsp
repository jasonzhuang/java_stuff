<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <style type="text/css">
  body{
  background-image: url("./images/grass.jpg");
  background-position:center;
  background-repeat:%100%50;
  }
  </style>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>欢迎使用浙江工业大学选课系统</title>
      <SCRIPT LANGUAGE = "JavaScript"> 
function check()
{
var numb1= document.student.id.value;
var numb2= document.student.password.value;
if (numb1==""&&numb2=="")
{
  alert("登录名和密码不能为空！");
return false;
}
else if (numb1=="")
{
  alert("登录名不能为空！");
return false;
}
else if (numb2=="")
{
	  alert("密码不能为空！");
return false;
}
else 
	return true;

}

</SCRIPT>
  </head>
  <form name="student" onSubmit="return check()" action="stuloginConfirm" method="post" >
  <p> 
  <div align="center"> 
  <br><br><br><br><br><br><br><br><br>
  <h2>学生登录</h2>
   登录名：<input type="text" name="id"><p>
   密码：	 <input type="password" name="password"><p>
   
      <input type="submit" name="submit" value="登录">
       <a href="enrol.jsp">注册</a> 
     
</form>
 
</html>
