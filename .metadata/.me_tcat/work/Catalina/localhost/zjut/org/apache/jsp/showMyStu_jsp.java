package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;
import com.zjut.dao.impl.*;
import com.zjut.factory.*;
import com.zjut.entity.*;
import com.zjut.factory.TeacherFactory;

public final class showMyStu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("  body{\r\n");
      out.write("\tbackground-image: url(\"images/42wallpage1280.jpg\");\r\n");
      out.write("\tbackground-position:center;\r\n");
      out.write("  background-repeat:%100%50;\r\n");
      out.write("\tbackground-repeat: no-repeat;\r\n");
      out.write("  }\r\n");
      out.write("  </style>\r\n");
      out.write("    <title>查看我的学生</title>\r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"></head>\r\n");
      out.write("  <body>\r\n");

	String tea_id = (String)session.getAttribute("id");

      out.write("\r\n");
      out.write("<p align=\"center\">&nbsp;</p>\r\n");
      out.write("<p align=\"center\">&nbsp;</p>\r\n");
      out.write("<p align=\"center\"><font  size=\"3\" >选择您的学生 </font></p>\r\n");
      out.write("<table border=\"1\" align=\"center\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"150\">学号</td>\r\n");
      out.write("        <td width=\"174\">姓名</td>\r\n");
      out.write("        <td width=\"163\">所在学院</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      ");

	
	List<Student> students=TeacherFactory.newInstance().getStudents(tea_id);
	Iterator<Student> iter = students.iterator();
	while (iter.hasNext()) {
			Student student = iter.next();
	
      out.write("\r\n");
      out.write("      <tr >\r\n");
      out.write("        <td align=\"center\">");
      out.print(student.getId());
      out.write("</td>\r\n");
      out.write("        <td align=\"center\">");
      out.print(student.getName());
      out.write("</td>\r\n");
      out.write("        <td align=\"center\">");
      out.print(student.getDep());
      out.write("</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      ");
}
      out.write("\r\n");
      out.write("    </table>\r\n");
      out.write("\t<p align=\"right\">\r\n");
      out.write("  <p align=\"right\">    \r\n");
      out.write("  <p align=\"right\">    \r\n");
      out.write("  <p align=\"center\"><a href=\"./teacher.jsp?id=");
      out.print(tea_id);
      out.write("\">回到个人主页</a>\r\n");
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
