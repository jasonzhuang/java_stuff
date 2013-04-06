<%@ page language="java" pageEncoding="gb2312"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<html:html locale="true">
	<head>
		<title>present与notPresent标签的使用演示</title>
		<html:base/>		
	</head>
	<body>
		<h2>present与notPresent标签的使用演示</h2>
		<hr>
		<%
			Map map = new HashMap();
			map.put("strVar","welcome");
			pageContext.setAttribute("bean",map);
			
			pageContext.setAttribute("str","This is a test");
		%>
		<logic:notPresent cookie="cc">
			cookie的cc不存在!<br>
		</logic:notPresent>
		
		<logic:present header="user-agent">
			header的user-agent存在!<br>
		</logic:present>
		
		<logic:notPresent parameter="p">
			请求参数p不存在!<br>
		</logic:notPresent>
						
		<logic:present name="s">
			str变量存在!<br>
		</logic:present>
		
		<logic:present name="bean" property="strVar">
			bean的属性strVar存在!<br>
		</logic:present>
		<logic:notPresent name="zyg" property="z" >
			bean的属性z不存在!<br>
		</logic:notPresent>
	</body>
</html:html>