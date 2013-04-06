<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html:html locale="true">
	<head>
		<title>text标签使用演示</title>
		<html:base/>		
	</head>
	<body>
	<h2>text标签使用演示</h2>
	<hr>
	<html:form action="/processText">
		文本框1：<html:text property="textbox1"/><br>	
		文本框2：<html:text property="textbox2" maxlength="6"/><br>
		文本框3：<html:text property="textbox3" maxlength="6" size="10"/><br>
		文本框4：<html:text property="textbox4" readonly="true" value="此框为只读" style="background-color:#eeeeee"/><br>	
		文本框5：<html:text property="textbox5" disabled="true" value="此框被禁用" style="background-color:#eeeeee"/><br>	
		文本框6：<html:text property="textbox6" onclick="alert(this.value)"/><br>	
		文本框7：<html:text property="textbox7" value="测试内容" title="点一下吧" onclick="this.value='';"/><br>
		<html:reset>重填</html:reset>&nbsp;
		<html:submit>提交</html:submit>			
	</html:form>
	</body>
</html:html>