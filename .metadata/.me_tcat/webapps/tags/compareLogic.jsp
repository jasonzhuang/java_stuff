<%@ page language="java" pageEncoding="gb2312"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<html:html locale="true">
	<head>
		<title>��Ƚ�������ر�ǩ��ʹ����ʾ</title>
		<html:base/>		
	</head>
	<body>
	<h2>��Ƚ�������ر�ǩ��ʹ����ʾ</h2>
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
		Cookie��author��ֵ����"zyg"��<br>
	</logic:equal>
	
	<logic:equal header="Accept-Language" value="zh-cn">
		�ͻ�������Ϊ��zh-cn!<br>
	</logic:equal>
	
	<logic:greaterEqual parameter="p" value="100">
		�������p��ֵ���ڻ����100!<br>
	</logic:greaterEqual>
	
	<logic:lessThan parameter="p" value="100">
		�������p��ֵС��100!<br>
	</logic:lessThan>
	
	<logic:equal name="intVar" value="168">
		����intVar��ֵΪ��168!<br>
	</logic:equal>
	
	<logic:notEqual name="bean" property="strVar" value="����">
		bean��strVar����ֵ������"����"!<br>
	</logic:notEqual>				
	</body>
</html:html>