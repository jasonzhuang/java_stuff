<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<html>
<body>
<% 
String name=request.getParameter("user");
%>
��������û����ǣ�
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
        ���ǵ�<%=application.getAttribute("counter")%>λ�����ߣ�

</body>
</html>


  
  