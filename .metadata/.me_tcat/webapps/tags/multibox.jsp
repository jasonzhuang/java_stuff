<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html:html locale="true">
	<head>
		<title>multibox标签使用演示</title>
		<html:base/>		
	</head>
	<body>
	<h2>multibox标签使用演示</h2>
	<hr>
	<html:form action="/processOther">
		您最喜欢的足球队是：<br>
		<html:multibox property="teams" value="意大利队"/>意大利队&nbsp;&nbsp;
		<html:multibox property="teams" value="法国队"/>法国队&nbsp;&nbsp;
		<html:multibox property="teams" value="巴西队"/>巴西队
		<html:reset>重填</html:reset>&nbsp;
		<html:submit>提交</html:submit>		
	</html:form>
	</body>
</html:html>
