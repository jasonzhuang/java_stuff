package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;
import com.zjut.dao.impl.*;
import com.zjut.factory.*;
import com.zjut.entity.*;

public final class selectedCourse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>查看已修课程</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("  <br>\r\n");
      out.write("  <br>\r\n");
      out.write("   <p align=\"center\"><font  size=\"3\" >您已选课程: </font></p>\r\n");
      out.write("\t<table border=\"1\" align=\"center\">\r\n");
      out.write("  \t<tr>\r\n");
      out.write("    <td width=\"54\">课程号</td>\r\n");
      out.write("    <td width=\"54\">课程名</td>\r\n");
      out.write("    <td width=\"80\">开课学院</td>\r\n");
      out.write("    <td width=\"59\">班级号</td>\r\n");
      out.write("\t<td width=\"88\">教师</td>\r\n");
      out.write("\t<td with=\"95\">上课地点</td>\r\n");
      out.write("\t<td with=\"100\">选择操作</td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  ");

  	String stu_id=(String)session.getAttribute("id");
	List<Course> selectedCourses=StuFactory.newInstance().getCourse(stu_id);
	Iterator<Course> iter = selectedCourses.iterator();
	while (iter.hasNext()) {
			Course course = iter.next();
	
      out.write("\r\n");
      out.write("\t\t<tr >\r\n");
      out.write("\t\t\t<td align=\"center\">");
      out.print(course.getId());
      out.write("</td>\r\n");
      out.write("\t\t\t<td align=\"center\">");
      out.print(course.getName());
      out.write("</td>\r\n");
      out.write("\t\t\t<td align=\"center\">");
      out.print(course.getDep());
      out.write("</td>\r\n");
      out.write("\t\t\t<td align=\"center\">");
      out.print(course.getClassid());
      out.write("</td>\r\n");
      out.write("\t\t\t<td align=\"center\">");
      out.print(course.getTeachername());
      out.write("</td>\r\n");
      out.write("\t\t\t<td align=\"center\">");
      out.print(course.getAddress());
      out.write("</td>\r\n");
      out.write("\t\t\t<td align=\"center\"><a href=\"./deleteCourse?class_id=");
      out.print(course.getClassid());
      out.write("\">删除</a>\r\n");
      out.write("\t\t</tr>\r\n");
}
      out.write("\r\n");
      out.write("</table><p>\r\n");
      out.write("<p>\r\n");
      out.write("<center>\r\n");
      out.write("<a href=\"./student.jsp?id=");
      out.print(stu_id);
      out.write("\">回到个人主页</a>\r\n");
      out.write("</center>\r\n");
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
