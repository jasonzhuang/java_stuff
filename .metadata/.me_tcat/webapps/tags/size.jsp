<%@ page language="java" pageEncoding="gb2312"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html:html locale="true">
	<head>
		<title>size��ǩʹ����ʾ</title>
		<html:base/>		
	</head>
	<body>
		<h2>size��ǩʹ����ʾ</h2>
		<hr>
		<%
			List ft = new ArrayList();
			ft.add("�������");
			ft.add("������");
			ft.add("������");
			pageContext.setAttribute("teams",ft);
			
			HashMap cmap = new HashMap();
			cmap.put("c1","��ɫ");
			cmap.put("c2","��ɫ");
			Map map = new HashMap();
			map.put("color",cmap);
			pageContext.setAttribute("map",map);
		%>		
		<bean:size id="s1" name="teams"/>
		����Ӽ����е�Ԫ�ظ���Ϊ��
		<bean:write name="s1"/><br>
		
		<bean:size id="s2" name="map" property="color"/>		
		��ɫ�����е�Ԫ�ظ���Ϊ��
		<bean:write name="s2"/><br>	
	</body>
</html:html>
