<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html:html locale="true">
	<head>
		<title>checkbox标签使用演示</title>
		<html:base/>		
	</head>
	<body>
	<h2>checkbox标签使用演示</h2>
	<hr>
	<html:form action="/processOther">
		您最喜欢的足球队是：<br>
		<html:checkbox property="team1"/>意大利队&nbsp;&nbsp;
		<html:checkbox property="team2"/>法国队&nbsp;&nbsp;
		<html:checkbox property="team3"/>巴西队
		<html:reset>重填</html:reset>&nbsp;
		<html:submit>提交</html:submit>		
	</html:form>
	</body>
</html:html>