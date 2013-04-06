<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html:html locale="true">
	<head>
		<title>file标签使用演示</title>
		<html:base/>		
	</head>
	<body>
	<h2>file标签使用演示</h2>
	<hr>
	<html:form action="/processFile" enctype="multipart/form-data">
		文本框：<html:text property="text"/><br>
		文件：<html:file property="file"/><br>		
		<html:reset>重填</html:reset>&nbsp;
		<html:submit>提交</html:submit>		
	</html:form>
	</body>
</html:html>