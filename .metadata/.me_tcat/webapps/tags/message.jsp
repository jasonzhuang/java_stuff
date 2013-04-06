<%@ page language="java" pageEncoding="gb2312"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html:html locale="true">
	<head>
		<title>message标签使用演示</title>
		<html:base/>		
	</head>
	<body>
		<h2>message标签使用演示</h2>
		<hr>
		<bean:message key="msg.test1"/><br>
		<bean:message key="msg.test2" arg0="刘斌" arg1="2006年10月15日" arg2="Struts世界"/><br>
		<%
			String keystr = "msg.test1";
			Map keyBean = new HashMap();
			keyBean.put("p","msg.test2");
			pageContext.setAttribute("keystr",keystr);
			pageContext.setAttribute("keyBean",keyBean);
		%>
		<bean:message name="keystr"/><br>
		<bean:message name="keyBean" property="p" arg0="刘斌" arg1="2006年10月15日" arg2="Struts世界"/><br>
	</body>
</html:html>
