<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html:html locale="true">
	<head>
		<title>password��ǩʹ����ʾ</title>
		<html:base/>		
	</head>
	<body>
	<h2>password��ǩʹ����ʾ</h2>
	<hr>
	<html:form action="/processText">
		�������룺<html:password property="textbox1" size="20"/><br>
		�˶����룺<html:password property="textbox2" size="20"/><br>	
		<html:reset>����</html:reset>&nbsp;
		<html:submit>�ύ</html:submit>		
	</html:form>
	</body>
</html:html>