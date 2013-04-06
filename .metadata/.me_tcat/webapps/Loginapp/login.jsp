<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title><bean:message key="login.jsp.title"/></title>
	</head>
	<body>
		<h2><bean:message key="login.jsp.head"/></h2>
		<hr>
		<html:form action="/login">
			<bean:message key="login.jsp.loginNameLabel"/> 
			<html:text property="loginName"/><br/>
			<bean:message key="login.jsp.passwordLabel"/> 
			<html:password property="password"/><br/>
			<html:submit>
				<bean:message key="login.jsp.submit"/> 
			</html:submit>
			<html:cancel>
				<bean:message key="login.jsp.cancel"/> 
			</html:cancel>
			<br/><br/>
			<html:errors/>
		</html:form>
	</body>
</html>
