package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class updateStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>更新个人信息</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <SCRIPT LANGUAGE = \"JavaScript\"> \r\n");
      out.write("function check()\r\n");
      out.write("{\r\n");
      out.write("var numb1= document.upadate.password.value;\r\n");
      out.write("if (numb1==\"\")\r\n");
      out.write("{\r\n");
      out.write("  alert(\"密码不能为空！\");\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("else \r\n");
      out.write("\treturn true;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("  <body>\r\n");
	 
	String stu_id=(String)session.getAttribute("id");
	

      out.write("\t\r\n");
      out.write("<form name=\"upadate\" onSubmit=\"return check()\" action=\"updateStudent\" method=\"post\">\r\n");
      out.write("<table width=\"51%\"  border=\"1\" align=\"center\">\r\n");
      out.write("    <tr> \r\n");
      out.write("      <td width=\"33%\">密码<font color=\"red\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>\r\n");
      out.write("      <td width=\"67%\"><input name=\"password\" type=\"password\" ></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr> \r\n");
      out.write("      <td>电话</td>\r\n");
      out.write("      <td><input name=\"tel\" type=\"text\" ></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr> \r\n");
      out.write("\t<td>邮箱</td>\r\n");
      out.write("    <td><input name=\"email\" type=\"text\" ></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("   <tr> \r\n");
      out.write("      <td>所在学院<font color=\"red\"></td>\r\n");
      out.write("      <td><select name=\"dep\" size=\"1\" id=\"dep\">\r\n");
      out.write("           <option>软件学院</option>\r\n");
      out.write("          <option>人文学院</option>\r\n");
      out.write("          <option>外语学院</option>\r\n");
      out.write("          <option>经贸学院</option>\r\n");
      out.write("          <option>理学院</option>\r\n");
      out.write("          <option>法学院</option>\r\n");
      out.write("          <option>教科学院</option>\r\n");
      out.write("          <option>政管学院</option>\r\n");
      out.write("          <option>健行学院</option>\r\n");
      out.write("          <option>生环学院</option>\r\n");
      out.write("       \t  <option>机械学院</option>\r\n");
      out.write("       \t  <option>信息学院</option>\r\n");
      out.write("       \t  <option>化材学院</option>\r\n");
      out.write("       \t  <option>国际学院</option>\r\n");
      out.write("       \t  <option>药学院</option>\r\n");
      out.write("       \t  <option>艺术学院</option>\r\n");
      out.write("       \t  <option>建工学院</option>\r\n");
      out.write("       \t  <option>之江学院</option>\r\n");
      out.write("        </select></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("   <p align=\"center\"> \r\n");
      out.write("    <input type=\"submit\" name=\"submit\" value=\"提交\">\r\n");
      out.write("  </p>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
