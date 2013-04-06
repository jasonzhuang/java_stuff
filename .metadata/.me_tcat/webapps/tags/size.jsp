<%@ page language="java" pageEncoding="gb2312"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html:html locale="true">
	<head>
		<title>size标签使用演示</title>
		<html:base/>		
	</head>
	<body>
		<h2>size标签使用演示</h2>
		<hr>
		<%
			List ft = new ArrayList();
			ft.add("意大利队");
			ft.add("法国队");
			ft.add("巴西队");
			pageContext.setAttribute("teams",ft);
			
			HashMap cmap = new HashMap();
			cmap.put("c1","白色");
			cmap.put("c2","黑色");
			Map map = new HashMap();
			map.put("color",cmap);
			pageContext.setAttribute("map",map);
		%>		
		<bean:size id="s1" name="teams"/>
		足球队集合中的元素个数为：
		<bean:write name="s1"/><br>
		
		<bean:size id="s2" name="map" property="color"/>		
		颜色集合中的元素个数为：
		<bean:write name="s2"/><br>	
	</body>
</html:html>
