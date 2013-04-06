<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html:html locale="true">
	<head>
		<title>cookie标签使用演示</title>
		<html:base/>		
	</head>
	<body>
	<h2>cookie标签使用演示</h2>
	<hr>
	<bean:cookie id="userId" name="mycookie" value="zyg"/>
	cookie的名字为：
	<bean:write name="userId" property="name"/><br>
	cookie的值为：
	<bean:write name="userId" property="value"/><br>
	</body>
</html:html>