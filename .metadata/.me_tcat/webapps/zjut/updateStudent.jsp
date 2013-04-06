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
    <title>更新个人信息</title>
  </head>
  <SCRIPT LANGUAGE = "JavaScript"> 
function check()
{
var numb1= document.upadate.password.value;
if (numb1=="")
{
  alert("密码不能为空！");
return false;
}
else 
	return true;

}

</SCRIPT>
  <body>
<%	 
	String stu_id=(String)session.getAttribute("id");
	
%>	
<form name="upadate" onSubmit="return check()" action="updateStudent" method="post">
<table width="51%"  border="1" align="center">
    <tr> 
      <td width="33%">密码<font color="red">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
      <td width="67%"><input name="password" type="password" ></td>
    </tr>
    <tr> 
      <td>电话</td>
      <td><input name="tel" type="text" ></td>
    </tr>
    <tr> 
	<td>邮箱</td>
    <td><input name="email" type="text" ></td>
    </tr>
   <tr> 
      <td>所在学院<font color="red"></td>
      <td><select name="dep" size="1" id="dep">
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
   <p align="center"> 
    <input type="submit" name="submit" value="提交">
  </p>

</form>


  </body>
</html>
