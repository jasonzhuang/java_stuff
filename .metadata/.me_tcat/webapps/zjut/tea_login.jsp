<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
<meta name="GENERATOR" content="Microsoft FrontPage 4.0">
<meta name="ProgId" content="FrontPage.Editor.Document">
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<style type="text/css">
body{
	background-image : url(images/bg1.gif);
	background-repeat : repeat-x;
}

td{
	color: #000000;
	font-family: Arial, Helvetica, sans-serif;
	font-size: 10px;
}
</style>
<title>Login for teacher</title> 
<SCRIPT LANGUAGE = "JavaScript"> 
function check()
{
var numb1= document.teacher.id.value;
var numb2= document.teacher.password.value;
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
<body leftmargin=0 topmargin=0 marginwidth=0 marginheight=0>
<form name="teacher" onSubmit="return check()" action="tealoginConfirm"  method="post" >
<table cellspacing=0 cellpadding=0>
 <tr><td><img src=images/spacer.gif width=1 height=41></td></tr>
 <tr><td><img src=images/m02.gif width=750 height=64></td></tr>
 <tr><td><img src=images/m03.gif width=473 height=19></td></tr>
 <tr><td><img src=images/spacer.gif width=1 height=31></td></tr>
<tr><td><table cellspacing=0 cellpadding=0>
 <tr><td rowspan=2><img src=images/m06.jpg width=163 height=194></td><td colspan=2 valign=top><img src=images/m07.gif width=587 height=55></td></tr>
 <tr><td bgcolor=#ffffff width=370 valign=top>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="id"size=12>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="password" size=12><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="submit" type="submit"value="LOGIN"/></td>
 <td><img src=images/m09.gif width=217 height=139></td></tr>
</table></td></tr>
 <tr><td><img src=images/m10.gif width=147 height=56></td></tr>
</table>
</form>
</body>
</html>