<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
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
<title>注册</title>
</head>
<body>
<form method="post" action="enrolStudent"><input type="hidden"
	name="action" value="new">
<p>&nbsp;</p>
<table width="49%" height="50" border="1" align="center" cellpadding="0"
	cellspacing="0">
	<tr>
		<td width="24%">学号</td>
		<td width="68%"><input name="id" type="text"></td>
	</tr>
	<tr>
		<td>姓名</td>
		<td><input name="name" type="text"></td>
	</tr>
	<tr>
		<td>密码</td>
		<td><input name="password" type="password" maxlength="10"></td>
	</tr>
	<tr>
		<td>所在学院</td>
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
	<tr>
		<td>性别</td>
		<td><select name="sex" size="1" id="sex">
			<option>男</option>
			<option>女</option>
		</select></td>
	</tr>
	<tr>
		<td>籍贯</td>
		<td><select name="jiguan" size="1" id="jiguan">
			<option>浙江</option>
			<option>福建</option>
			<option>黑龙江</option>
			<option>湖南</option>
			<option>河北</option>
			<option>江苏</option>
			<option>湖北</option>
			<option>河南</option>
			<option>山西</option>
			<option>广东</option>
			<option>北京</option>
			<option>上海</option>
			<option>安徽</option>
			<option>海南</option>
			<option>其他</option>
		</select></td>
	</tr>
</table>
<p>&nbsp;</p>
<p align="center"><input type="submit" name="submit" value="确定">
</p>
</form>
</body>

</html>
