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
<title>增加课程</title>
<SCRIPT LANGUAGE="JavaScript"> 
function check()
{
var numb1= document.addcourse.name.value;
var numb2= document.addcourse.course_id.value;
if (numb1==""&&numb2=="")
{
  alert("课程名和课程号不能为空！");
return false;
}
else if (numb1=="")
{
  alert("课程名不能为空！");
return false;
}
else if (numb2=="")
{
	  alert("课程号不能为空！");
return false;
}
else 
	return true;

}

</SCRIPT>
</head>
<body>
<%
String admin_id = (String)session.getAttribute("id"); 
if(admin_id==null){response.sendRedirect("./adm_login.jsp");}       
%>
<form name="addcourse" onSubmit="return check()" method="post"
	action="addcourse">
<p>&nbsp;</p>
<div align="center"></div>
<br>
<br>
<table width="37%" border="1" align="center">
	<tr>
		<td width="37%">课程名</td>
		<td width="63%"><input name="name" type="text"></td>
	</tr>
	<tr>
		<td>课程号</td>
		<td><input name="course_id" type="text"></td>
	</tr>
	<tr>
		<td>学分</td>
		<td><select name="mark" size="1" id="mark">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
		</select></td>
	</tr>
	<tr>
		<td>开课学院</td>
		<td><select name="dep" size="1">
			<option>软件学院</option>
			<option>人文学院</option>
			<option>外语学院</option>
			<option>经贸学院</option>
			<option>理学院</option>
			<option>法学院</option>
			<option>教科学院</option>
			<option>政管学院</option>
			<option>健行学院</option>
			<option>生环学院</option>
			<option>机械学院</option>
			<option>信息学院</option>
			<option>化材学院</option>
			<option>国际学院</option>
			<option>药学院</option>
			<option>艺术学院</option>
			<option>建工学院</option>
			<option>之江学院</option>
		</select></td>
	</tr>
</table>
<p align="center"><input type="submit" name="submit" value="提交">
</p>
</form>
</body>
</html>
