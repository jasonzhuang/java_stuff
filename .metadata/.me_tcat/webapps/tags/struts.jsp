<%@ page language="java" pageEncoding="gb2312"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html:html locale="true">
	<head>
		<title>struts��ǩʹ����ʾ</title>
		<html:base/>		
	</head>
	<body>
		<h2>struts��ǩʹ����ʾ</h2>
		<hr>
		<bean:struts id="f" forward="goPage"/>
		ȫ��ת��goPage��name����Ϊ��
		<bean:write name="f" property="name"/>
	</body>
</html:html>