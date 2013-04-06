<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<html>
<body>
<% 
String name=request.getParameter("user");
%>
你输入的用户名是：
<%=name %>
<%  if (application.getAttribute("counter")==null)
	          application.setAttribute("counter","1");
	  else{
	          String strnum=null;
	          strnum=application.getAttribute("counter").toString();
	          int icount=0;
	          icount=Integer.parseInt(strnum);
	          icount++;
	          application.setAttribute("counter",Integer.toString(icount));
	   }  %>
        您是第<%=application.getAttribute("counter")%>位访问者！

</body>
</html>


  
  