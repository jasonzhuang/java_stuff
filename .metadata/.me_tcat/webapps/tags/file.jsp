<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html:html locale="true">
	<head>
		<title>file��ǩʹ����ʾ</title>
		<html:base/>		
	</head>
	<body>
	<h2>file��ǩʹ����ʾ</h2>
	<hr>
	<html:form action="/processFile" enctype="multipart/form-data">
		�ı���<html:text property="text"/><br>
		�ļ���<html:file property="file"/><br>		
		<html:reset>����</html:reset>&nbsp;
		<html:submit>�ύ</html:submit>		
	</html:form>
	</body>
</html:html>