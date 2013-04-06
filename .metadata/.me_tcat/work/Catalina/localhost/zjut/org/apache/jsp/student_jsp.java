package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.zjut.listener.*;

public final class student_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <style type=\"text/css\">\r\n");
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
      out.write("    <title>学生页面</title>\r\n");
      out.write("  </head>\r\n");
      out.write("<p>\r\n");
      out.write("  ");

	String id = (String)session.getAttribute("id");
	if(id==null){response.sendRedirect("./stu_login.jsp");}                                 

      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("</p>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<p><br>\r\n");
      out.write("  <br>\r\n");
      out.write("  <center>\r\n");
      out.write("    <font size=\"3\" >您已经成功通过验证! 您可以使用如下服务：</font> \r\n");
      out.write("        </center>\r\n");
      out.write("</p>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<table width=\"58%\"  border=\"0\" align=\"center\">\r\n");
      out.write("  <tr> \r\n");
      out.write("    <td width=\"31%\"><div align=\"right\"><a href=\"./displayCourse.jsp\">选修课程</a></div></td>\r\n");
      out.write("    <td width=\"37%\"><div align=\"center\"><a href=\"./selectedCourse.jsp\">查看已选课程</a></div></td>\r\n");
      out.write("    <td width=\"32%\"><a href=\"./updateStudent.jsp\">修改个人信息</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table><p>\r\n");
      out.write("<h3>在线用户数量：</h3>\r\n");
      out.write(" ");
      out.print(OnlineListener.getCount());
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("\t<a href=\"./logout\">注销</a>\r\n");
      out.write("</center>\t\r\n");
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
