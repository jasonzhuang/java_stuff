<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html:html locale="true">
	<head>
		<title>header标签使用演示</title>
		<html:base/>		
	</head>
	<body>
	<h2>header标签使用演示</h2>
	<hr>
	<bean:header id="lang" name="Host"/>
	header中lang属性值为：
	<bean:write name="lang"/><br>
	</body>
</html:html>