package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class tea_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"GENERATOR\" content=\"Microsoft FrontPage 4.0\">\r\n");
      out.write("<meta name=\"ProgId\" content=\"FrontPage.Editor.Document\">\r\n");
      out.write("<meta http-equiv=\"Content-Language\" content=\"zh-cn\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body{\r\n");
      out.write("\tbackground-image : url(images/bg1.gif);\r\n");
      out.write("\tbackground-repeat : repeat-x;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td{\r\n");
      out.write("\tcolor: #000000;\r\n");
      out.write("\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-size: 10px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<title>Login for teacher</title> \r\n");
      out.write("<SCRIPT LANGUAGE = \"JavaScript\"> \r\n");
      out.write("function check()\r\n");
      out.write("{\r\n");
      out.write("var numb1= document.teacher.id.value;\r\n");
      out.write("var numb2= document.teacher.password.value;\r\n");
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
      out.write("</head>\r\n");
      out.write("<body leftmargin=0 topmargin=0 marginwidth=0 marginheight=0>\r\n");
      out.write("<form name=\"teacher\" onSubmit=\"return check()\" action=\"tealoginConfirm\"  method=\"post\" >\r\n");
      out.write("<table cellspacing=0 cellpadding=0>\r\n");
      out.write(" <tr><td><img src=images/spacer.gif width=1 height=41></td></tr>\r\n");
      out.write(" <tr><td><img src=images/m02.gif width=750 height=64></td></tr>\r\n");
      out.write(" <tr><td><img src=images/m03.gif width=473 height=19></td></tr>\r\n");
      out.write(" <tr><td><img src=images/spacer.gif width=1 height=31></td></tr>\r\n");
      out.write("<tr><td><table cellspacing=0 cellpadding=0>\r\n");
      out.write(" <tr><td rowspan=2><img src=images/m06.jpg width=163 height=194></td><td colspan=2 valign=top><img src=images/m07.gif width=587 height=55></td></tr>\r\n");
      out.write(" <tr><td bgcolor=#ffffff width=370 valign=top>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"id\"size=12>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"password\" name=\"password\" size=12><br>\r\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name=\"submit\" type=\"submit\"value=\"LOGIN\"/></td>\r\n");
      out.write(" <td><img src=images/m09.gif width=217 height=139></td></tr>\r\n");
      out.write("</table></td></tr>\r\n");
      out.write(" <tr><td><img src=images/m10.gif width=147 height=56></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
