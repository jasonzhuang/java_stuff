<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html:html locale="true">
	<head>
		<title>multibox��ǩʹ����ʾ</title>
		<html:base/>		
	</head>
	<body>
	<h2>multibox��ǩʹ����ʾ</h2>
	<hr>
	<html:form action="/processOther">
		����ϲ����������ǣ�<br>
		<html:multibox property="teams" value="�������"/>�������&nbsp;&nbsp;
		<html:multibox property="teams" value="������"/>������&nbsp;&nbsp;
		<html:multibox property="teams" value="������"/>������
		<html:reset>����</html:reset>&nbsp;
		<html:submit>�ύ</html:submit>		
	</html:form>
	</body>
</html:html>
