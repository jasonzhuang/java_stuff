<%@ page language="java" pageEncoding="gb2312"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<html:html locale="true">
	<head>
		<title>empty与notEmpty标签的使用演示</title>
		<html:base/>		
	</head>
	<body>
		<h2>empty与notEmpty标签的使用演示</h2>
		<hr>
		<%
			Map map = new HashMap();
			map.put("strVar","welcome");
			pageContext.setAttribute("bean",map);
			
			pageContext.setAttribute("str","This is a test");
		%>
		<logic:empty name="str">
			str变量为null或为空字符串!<br>
		</logic:empty>
		<logic:notEmpty name="str">
			str变量不为null或非空字符串!<br>
		</logic:notEmpty>
						
		<logic:empty name="bean" property="strVar">
			bean的属性strVar为null或为空字符串!<br>
		</logic:empty>
		<logic:notEmpty name="bean" property="strVar">
			bean的属性strVar不为null或非空字符串!<br>
		</logic:notEmpty>						
	</body>
</html:html>