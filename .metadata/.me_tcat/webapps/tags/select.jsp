<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page import="java.util.*"%>
<%@ page import="org.apache.struts.util.LabelValueBean" %>
<%
	Vector v = new Vector();
	v.add(new LabelValueBean("�й���","�й���"));
	v.add(new LabelValueBean("������","������"));
	v.add(new LabelValueBean("�¹���","�¹���"));
	pageContext.setAttribute("v",v);
%>
<html:html locale="true">
	<head>
		<title>select��ǩʹ����ʾ</title>
		<html:base/>		
	</head>
	<body>
	<h2>select��ǩʹ����ʾ</h2>
	<hr>
	<html:form action="/processSelect">
		����ϲ����������ǣ�<br>
		<html:select property="team1">
			<html:option value="�������">�������</html:option>
			<html:option value="������">������</html:option>
			<html:option value="������">������</html:option>
		</html:select><br>
		<br>����ϲ����������ǣ�<br>
		<html:select property="team2">
			<html:options collection="v" labelProperty="label" property="value"/>
		</html:select><br>
		<br>����ϲ������ɫ�ǣ�<br>
		<html:select property="color">
			<html:optionsCollection property="options" label="label" value="value"/>
		</html:select><br>				
		<html:reset>����</html:reset>&nbsp;
		<html:submit>�ύ</html:submit>		
	</html:form>
	</body>
</html:html>