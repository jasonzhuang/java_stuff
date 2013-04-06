<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html:html locale="true">
	<head>
		<title>password标签使用演示</title>
		<html:base/>		
	</head>
	<body>
	<h2>password标签使用演示</h2>
	<hr>
	<html:form action="/processText">
		输入密码：<html:password property="textbox1" size="20"/><br>
		核对密码：<html:password property="textbox2" size="20"/><br>	
		<html:reset>重填</html:reset>&nbsp;
		<html:submit>提交</html:submit>		
	</html:form>
	</body>
</html:html>