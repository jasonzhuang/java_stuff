<%@ page language="java" pageEncoding="gb2312"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<html:html locale="true">
	<head>
		<title>与比较运算相关标签的使用演示</title>
		<html:base/>		
	</head>
	<body>
	<h2>与比较运算相关标签的使用演示</h2>
	<hr>
	<%
		Cookie c = new Cookie("author","zyg");
		c.setMaxAge(3600);
		response.addCookie(c);
		
		Map map = new HashMap();
		map.put("strVar","test");
		pageContext.setAttribute("bean",map);
		
		pageContext.setAttribute("intVar","168");
	%>
	<logic:equal cookie="author" value="zyg">
		Cookie中author的值等于"zyg"！<br>
	</logic:equal>
	
	<logic:equal header="Accept-Language" value="zh-cn">
		客户端语言为：zh-cn!<br>
	</logic:equal>
	
	<logic:greaterEqual parameter="p" value="100">
		请求参数p的值大于或等于100!<br>
	</logic:greaterEqual>
	
	<logic:lessThan parameter="p" value="100">
		请求参数p的值小于100!<br>
	</logic:lessThan>
	
	<logic:equal name="intVar" value="168">
		变量intVar的值为：168!<br>
	</logic:equal>
	
	<logic:notEqual name="bean" property="strVar" value="测试">
		bean的strVar属性值不等于"测试"!<br>
	</logic:notEqual>				
	</body>
</html:html>