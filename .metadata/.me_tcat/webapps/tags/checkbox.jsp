<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html:html locale="true">
	<head>
		<title>checkbox��ǩʹ����ʾ</title>
		<html:base/>		
	</head>
	<body>
	<h2>checkbox��ǩʹ����ʾ</h2>
	<hr>
	<html:form action="/processOther">
		����ϲ����������ǣ�<br>
		<html:checkbox property="team1"/>�������&nbsp;&nbsp;
		<html:checkbox property="team2"/>������&nbsp;&nbsp;
		<html:checkbox property="team3"/>������
		<html:reset>����</html:reset>&nbsp;
		<html:submit>�ύ</html:submit>		
	</html:form>
	</body>
</html:html>