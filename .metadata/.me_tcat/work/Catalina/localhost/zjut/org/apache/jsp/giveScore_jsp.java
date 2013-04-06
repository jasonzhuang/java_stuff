package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class giveScore_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--\r\n");
      out.write("body {\r\n");
      out.write("\tbackground-image: url(images/bb286.gif);\r\n");
      out.write("\tbackground-repeat: repeat-y;\r\n");
      out.write("\tbackground-position: center;\r\n");
      out.write("}\r\n");
      out.write(".STYLE3 {\r\n");
      out.write("\tcolor: #000080;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("  </style>\r\n");
      out.write("    <title>打分</title>\r\n");
      out.write(" <SCRIPT LANGUAGE = \"JavaScript\">\r\n");
      out.write("  function check()\r\n");
      out.write("{\r\n");
      out.write("var numb1= document.givescore.class_id.value;\r\n");
      out.write("var numb2= document.givescore.stu_id.value;\r\n");
      out.write("var numb3= document.givescore.score.value;\r\n");
      out.write("if (numb1==\"\"&&numb2==\"\")\r\n");
      out.write("{\r\n");
      out.write("  alert(\"班级，学号，分数不能为空！\");\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("else if (numb1==\"\")\r\n");
      out.write("{\r\n");
      out.write("  alert(\"班级号不能为空！\");\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("else if (numb2==\"\")\r\n");
      out.write("{\r\n");
      out.write("\t  alert(\"学号不能为空！\");\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("else if (numb3==\"\")\r\n");
      out.write("{\r\n");
      out.write("\t  alert(\"分数不为空！\");\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("else \r\n");
      out.write("return true;\r\n");
      out.write("}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("    </head>\r\n");
      out.write("     \r\n");
      out.write("  <body>\r\n");

	String tea_id = (String)session.getAttribute("id");
	if(tea_id==null){response.sendRedirect("./tea_login.jsp");} 

      out.write("\r\n");
      out.write("<form  name=\"givescore\" onSubmit=\"return check()\" method=\"post\" action=\"giveScore\">\r\n");
      out.write("  <div align=\"center\">\r\n");
      out.write("    <p>&nbsp;</p>\r\n");
      out.write("    <p>&nbsp;</p>\r\n");
      out.write("    <p>&nbsp;</p>\r\n");
      out.write("    <p>&nbsp;</p>\r\n");
      out.write("  </div>\r\n");
      out.write("  <table width=\"37%\"  border=\"1\" align=\"center\">\r\n");
      out.write("    <tr> \r\n");
      out.write("      <td width=\"37%\">班级号</td>\r\n");
      out.write("      <td width=\"63%\"><input name=\"class_id\" type=\"text\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr> \r\n");
      out.write("      <td>学生学号</td>\r\n");
      out.write("      <td><input name=\"stu_id\" type=\"text\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr> \r\n");
      out.write("      <td>分数</td>\r\n");
      out.write("      <td><input name=\"score\" type=\"text\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("    <p align=\"center\"> \r\n");
      out.write("    <input type=\"submit\" name=\"submit\" value=\"提交\">\r\n");
      out.write("  </p>\r\n");
      out.write("  </form>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<div align=\"center\"><a href=\"./teacher.jsp?id=");
      out.print(tea_id);
      out.write("\">回到个人主页</a>\r\n");
      out.write("</div>\r\n");
      out.write("  </body>\r\n");
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
