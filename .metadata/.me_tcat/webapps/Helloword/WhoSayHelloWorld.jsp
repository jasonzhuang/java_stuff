<%@ page contentType="text/html; charset=gb2312"%>
<%@ page import="struts.sample.cap1.sample2.form.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body>
  <!--ActionServlet�ὫActionFormһ���ͻ��� -->
    <% HelloWorldActionForm helloWorldActionForm = (HelloWorldActionForm)request.getAttribute("helloWorldActionForm"); %>
    <%= helloWorldActionForm.getUsername()%>
    ˵����Hello World��
  </body>
</html>
