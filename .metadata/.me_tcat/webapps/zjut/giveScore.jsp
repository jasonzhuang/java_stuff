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
    <title>打分</title>
 <SCRIPT LANGUAGE = "JavaScript">
  function check()
{
var numb1= document.givescore.class_id.value;
var numb2= document.givescore.stu_id.value;
var numb3= document.givescore.score.value;
if (numb1==""&&numb2=="")
{
  alert("班级，学号，分数不能为空！");
return false;
}
else if (numb1=="")
{
  alert("班级号不能为空！");
return false;
}
else if (numb2=="")
{
	  alert("学号不能为空！");
return false;
}
else if (numb3=="")
{
	  alert("分数不为空！");
return false;
}
else 
return true;
}
</SCRIPT>
    </head>
     
  <body>
<%
	String tea_id = (String)session.getAttribute("id");
	if(tea_id==null){response.sendRedirect("./tea_login.jsp");} 
%>
<form  name="givescore" onSubmit="return check()" method="post" action="giveScore">
  <div align="center">
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
  </div>
  <table width="37%"  border="1" align="center">
    <tr> 
      <td width="37%">班级号</td>
      <td width="63%"><input name="class_id" type="text"></td>
    </tr>
    <tr> 
      <td>学生学号</td>
      <td><input name="stu_id" type="text"></td>
    </tr>
    <tr> 
      <td>分数</td>
      <td><input name="score" type="text"></td>
    </tr>
  </table>
    <p align="center"> 
    <input type="submit" name="submit" value="提交">
  </p>
  </form>
<br>
<br>
<div align="center"><a href="./teacher.jsp?id=<%=tea_id%>">回到个人主页</a>
</div>
  </body>
</html>
