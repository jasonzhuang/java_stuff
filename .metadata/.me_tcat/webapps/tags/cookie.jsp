<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html:html locale="true">
	<head>
		<title>cookie��ǩʹ����ʾ</title>
		<html:base/>		
	</head>
	<body>
	<h2>cookie��ǩʹ����ʾ</h2>
	<hr>
	<bean:cookie id="userId" name="mycookie" value="zyg"/>
	cookie������Ϊ��
	<bean:write name="userId" property="name"/><br>
	cookie��ֵΪ��
	<bean:write name="userId" property="value"/><br>
	</body>
</html:html>