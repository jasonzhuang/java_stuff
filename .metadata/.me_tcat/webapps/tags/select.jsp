<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page import="java.util.*"%>
<%@ page import="org.apache.struts.util.LabelValueBean" %>
<%
	Vector v = new Vector();
	v.add(new LabelValueBean("中国队","中国队"));
	v.add(new LabelValueBean("美国队","美国队"));
	v.add(new LabelValueBean("德国队","德国队"));
	pageContext.setAttribute("v",v);
%>
<html:html locale="true">
	<head>
		<title>select标签使用演示</title>
		<html:base/>		
	</head>
	<body>
	<h2>select标签使用演示</h2>
	<hr>
	<html:form action="/processSelect">
		您最喜欢的足球队是：<br>
		<html:select property="team1">
			<html:option value="意大利队">意大利队</html:option>
			<html:option value="法国队">法国队</html:option>
			<html:option value="巴西队">巴西队</html:option>
		</html:select><br>
		<br>您最喜欢的篮球队是：<br>
		<html:select property="team2">
			<html:options collection="v" labelProperty="label" property="value"/>
		</html:select><br>
		<br>您最喜欢的颜色是：<br>
		<html:select property="color">
			<html:optionsCollection property="options" label="label" value="value"/>
		</html:select><br>				
		<html:reset>重填</html:reset>&nbsp;
		<html:submit>提交</html:submit>		
	</html:form>
	</body>
</html:html>