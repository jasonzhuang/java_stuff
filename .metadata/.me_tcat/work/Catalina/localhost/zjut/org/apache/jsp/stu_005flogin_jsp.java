package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class stu_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("  <style type=\"text/css\">\r\n");
      out.write("  body{\r\n");
      out.write("  background-image: url(\"./images/grass.jpg\");\r\n");
      out.write("  background-position:center;\r\n");
      out.write("  background-repeat:%100%50;\r\n");
      out.write("  }\r\n");
      out.write("  </style>\r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("    <title>欢迎使用浙江工业大学选课系统</title>\r\n");
      out.write("      <SCRIPT LANGUAGE = \"JavaScript\"> \r\n");
      out.write("function check()\r\n");
      out.write("{\r\n");
      out.write("var numb1= document.student.id.value;\r\n");
      out.write("var numb2= document.student.password.value;\r\n");
      out.write("if (numb1==\"\"&&numb2==\"\")\r\n");
      out.write("{\r\n");
      out.write("  alert(\"登录名和密码不能为空！\");\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("else if (numb1==\"\")\r\n");
      out.write("{\r\n");
      out.write("  alert(\"登录名不能为空！\");\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("else if (numb2==\"\")\r\n");
      out.write("{\r\n");
      out.write("\t  alert(\"密码不能为空！\");\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("else \r\n");
      out.write("\treturn true;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("  </head>\r\n");
      out.write("  <form name=\"student\" onSubmit=\"return check()\" action=\"stuloginConfirm\" method=\"post\" >\r\n");
      out.write("  <p> \r\n");
      out.write("  <div align=\"center\"> \r\n");
      out.write("  <br><br><br><br><br><br><br><br><br>\r\n");
      out.write("  <h2>学生登录</h2>\r\n");
      out.write("   登录名：<input type=\"text\" name=\"id\"><p>\r\n");
      out.write("   密码：\t <input type=\"password\" name=\"password\"><p>\r\n");
      out.write("   \r\n");
      out.write("      <input type=\"submit\" name=\"submit\" value=\"登录\">\r\n");
      out.write("       <a href=\"enrol.jsp\">注册</a> \r\n");
      out.write("     \r\n");
      out.write("</form>\r\n");
      out.write(" \r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
