<%@page contentType="text/html;charset=gb2312" %>
<html>
<head>
<title>Forward</title>
</head>
<body>
<% if (request.getParameter("name")!=null && request.getParameter("pwd")!=null && !request.getParameter("name").equals("") && !request.getParameter("pwd").equals("") ) {%>
     <% if(request.getParameter("logintype").equals("student")) { %>
        <jsp:forward page="student.jsp" />
     <%}else{%>
        <jsp:forward page="teacher.jsp" />
     <%}%>
<%}else{ %>
     <center>
     <font color="red">
     �û��������벻��Ϊ�գ�
     </font>
     </center>
     <jsp:include page="login.jsp" />
<%}%>
</body>
</html>