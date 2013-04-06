<%@ page language="java" pageEncoding="gb2312"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html:html locale="true">
	<head>
		<title>struts标签使用演示</title>
		<html:base/>		
	</head>
	<body>
		<h2>struts标签使用演示</h2>
		<hr>
		<bean:struts id="f" forward="goPage"/>
		全局转发goPage的name属性为：
		<bean:write name="f" property="name"/>
	</body>
</html:html>