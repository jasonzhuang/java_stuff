<%@ page language="java" pageEncoding="gb2312"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<html:html locale="true">
	<head>
		<title>present��notPresent��ǩ��ʹ����ʾ</title>
		<html:base/>		
	</head>
	<body>
		<h2>present��notPresent��ǩ��ʹ����ʾ</h2>
		<hr>
		<%
			Map map = new HashMap();
			map.put("strVar","welcome");
			pageContext.setAttribute("bean",map);
			
			pageContext.setAttribute("str","This is a test");
		%>
		<logic:notPresent cookie="cc">
			cookie��cc������!<br>
		</logic:notPresent>
		
		<logic:present header="user-agent">
			header��user-agent����!<br>
		</logic:present>
		
		<logic:notPresent parameter="p">
			�������p������!<br>
		</logic:notPresent>
						
		<logic:present name="s">
			str��������!<br>
		</logic:present>
		
		<logic:present name="bean" property="strVar">
			bean������strVar����!<br>
		</logic:present>
		<logic:notPresent name="zyg" property="z" >
			bean������z������!<br>
		</logic:notPresent>
	</body>
</html:html>