<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html:html locale="true">
	<head>
		<title>text��ǩʹ����ʾ</title>
		<html:base/>		
	</head>
	<body>
	<h2>text��ǩʹ����ʾ</h2>
	<hr>
	<html:form action="/processText">
		�ı���1��<html:text property="textbox1"/><br>	
		�ı���2��<html:text property="textbox2" maxlength="6"/><br>
		�ı���3��<html:text property="textbox3" maxlength="6" size="10"/><br>
		�ı���4��<html:text property="textbox4" readonly="true" value="�˿�Ϊֻ��" style="background-color:#eeeeee"/><br>	
		�ı���5��<html:text property="textbox5" disabled="true" value="�˿򱻽���" style="background-color:#eeeeee"/><br>	
		�ı���6��<html:text property="textbox6" onclick="alert(this.value)"/><br>	
		�ı���7��<html:text property="textbox7" value="��������" title="��һ�°�" onclick="this.value='';"/><br>
		<html:reset>����</html:reset>&nbsp;
		<html:submit>�ύ</html:submit>			
	</html:form>
	</body>
</html:html>