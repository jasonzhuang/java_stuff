<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html:html locale="true">
	<head>
		<title>button��ǩʹ����ʾ</title>
		<html:base/>		
	</head>
	<body>
	<h2>button��ǩʹ����ʾ</h2>
	<hr>
	<html:form action="/processText">
		������URL��<html:text property="url"/>	
		<html:button property="btn" value="ת��" onclick="go()"/>	
	</html:form>
	<script language="javascript">
		function go(){
			if (document.all.url.value==""){
				alert("�Բ�������������URL!");
				return;
			}else{
				window.location = document.all.url.value;		
			}
		}
	</script>
	</body>
</html:html>