<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html:html locale="true">
	<head>
		<title>include��ǩʹ����ʾ</title>
		<html:base/>		
	</head>
	<body>
	<h2>include��ǩʹ����ʾ</h2>
	<hr>
	<bean:include id="qq" href="http://www.qq.com"/>
	www.qq.com���ص�HTML����Ϊ��
	<bean:write name="qq"/><br>
	</body>
</html:html>