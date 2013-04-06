<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html:html locale="true">
	<head>
		<title>Welcome</title>
		<html:base/>		
	</head>
	<body>
		<html:messages id="m1" property="prompt" message="true">
			<bean:write name="m1"/><br>
		</html:messages>		
		<html:messages id="m2" property="welcome" message="true" bundle="MyResources">
			<bean:write name="m2"/><br>
		</html:messages>
		
		<html:messages id="m3" name="msg" property="prompt">
			<bean:write name="m3"/><br>
		</html:messages>
		<html:messages id="m4" name="msg" property="welcome" bundle="MyResources">
			<bean:write name="m4"/><br>
		</html:messages>						
	</body>
</html:html>