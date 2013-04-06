<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html:html locale="true">
	<head>
		<title>include标签使用演示</title>
		<html:base/>		
	</head>
	<body>
	<h2>include标签使用演示</h2>
	<hr>
	<bean:include id="qq" href="http://www.qq.com"/>
	www.qq.com返回的HTML内容为：
	<bean:write name="qq"/><br>
	</body>
</html:html>