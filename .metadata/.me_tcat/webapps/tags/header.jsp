<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html:html locale="true">
	<head>
		<title>header��ǩʹ����ʾ</title>
		<html:base/>		
	</head>
	<body>
	<h2>header��ǩʹ����ʾ</h2>
	<hr>
	<bean:header id="lang" name="Host"/>
	header��lang����ֵΪ��
	<bean:write name="lang"/><br>
	</body>
</html:html>