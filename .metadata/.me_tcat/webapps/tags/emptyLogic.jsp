<%@ page language="java" pageEncoding="gb2312"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<html:html locale="true">
	<head>
		<title>empty��notEmpty��ǩ��ʹ����ʾ</title>
		<html:base/>		
	</head>
	<body>
		<h2>empty��notEmpty��ǩ��ʹ����ʾ</h2>
		<hr>
		<%
			Map map = new HashMap();
			map.put("strVar","welcome");
			pageContext.setAttribute("bean",map);
			
			pageContext.setAttribute("str","This is a test");
		%>
		<logic:empty name="str">
			str����Ϊnull��Ϊ���ַ���!<br>
		</logic:empty>
		<logic:notEmpty name="str">
			str������Ϊnull��ǿ��ַ���!<br>
		</logic:notEmpty>
						
		<logic:empty name="bean" property="strVar">
			bean������strVarΪnull��Ϊ���ַ���!<br>
		</logic:empty>
		<logic:notEmpty name="bean" property="strVar">
			bean������strVar��Ϊnull��ǿ��ַ���!<br>
		</logic:notEmpty>						
	</body>
</html:html>