<%@ page language="java" pageEncoding="gb2312"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html:html locale="true">
	<head>
		<title>message��ǩʹ����ʾ</title>
		<html:base/>		
	</head>
	<body>
		<h2>message��ǩʹ����ʾ</h2>
		<hr>
		<bean:message key="msg.test1"/><br>
		<bean:message key="msg.test2" arg0="����" arg1="2006��10��15��" arg2="Struts����"/><br>
		<%
			String keystr = "msg.test1";
			Map keyBean = new HashMap();
			keyBean.put("p","msg.test2");
			pageContext.setAttribute("keystr",keystr);
			pageContext.setAttribute("keyBean",keyBean);
		%>
		<bean:message name="keystr"/><br>
		<bean:message name="keyBean" property="p" arg0="����" arg1="2006��10��15��" arg2="Struts����"/><br>
	</body>
</html:html>
