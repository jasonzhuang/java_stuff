<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html:html locale="true">
	<head>
		<title>button标签使用演示</title>
		<html:base/>		
	</head>
	<body>
	<h2>button标签使用演示</h2>
	<hr>
	<html:form action="/processText">
		请输入URL：<html:text property="url"/>	
		<html:button property="btn" value="转到" onclick="go()"/>	
	</html:form>
	<script language="javascript">
		function go(){
			if (document.all.url.value==""){
				alert("对不起，请您先输入URL!");
				return;
			}else{
				window.location = document.all.url.value;		
			}
		}
	</script>
	</body>
</html:html>