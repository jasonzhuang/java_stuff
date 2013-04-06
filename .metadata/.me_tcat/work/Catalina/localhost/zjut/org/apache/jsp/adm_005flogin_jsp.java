package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class adm_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("<meta name=\"GENERATOR\" content=\"Microsoft FrontPage 4.0\">\r\n");
      out.write("<meta name=\"ProgId\" content=\"FrontPage.Editor.Document\">\r\n");
      out.write("<meta http-equiv=\"Content-Language\" content=\"zh-cn\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<style>\r\n");
      out.write("a:link {text-decoration:none; color:#7C6F69}\r\n");
      out.write("a:visited {text-decoration:none; color:#7C6F69}\r\n");
      out.write("a:active {text-decoration:none; color:#7C6F69}\r\n");
      out.write("a:hover {text-decoration:none; color:#7C6F69}\r\n");
      out.write("</style>\r\n");
      out.write("<title>浙江工业大学选课系统后台管理</title>\r\n");
      out.write("<SCRIPT LANGUAGE = \"JavaScript\"> \r\n");
      out.write("function check()\r\n");
      out.write("{\r\n");
      out.write("var numb1= document.admin.id.value;\r\n");
      out.write("var numb2= document.admin.password.value;\r\n");
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
      out.write("\r\n");
      out.write("<body bgcolor=\"#F7EFE1\" scroll=\"no\" leftmargin=\"0\" oncontextmenu=\"return false\" ondragstart=\"return false\" onselectstart=\"return false\">\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("  <center>\r\n");
      out.write("  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse: collapse\" bordercolor=\"#111111\" width=\"625\" id=\"AutoNumber1\" height=\"500\">\r\n");
      out.write("    <tr>\r\n");
      out.write("           \r\n");
      out.write("        <td width=\"100%\" background=\"images/001.gif\"><br>\r\n");
      out.write("                    <p>&nbsp;</p>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("\r\n");
      out.write("  </center>\r\n");
      out.write("</div>\r\n");
      out.write("<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse: collapse; border-left-width: 1; border-right-width: 1; border-top-style: solid; border-top-width: 1; border-bottom-style: solid; border-bottom-width: 1\" bordercolor=\"#7C6F69\" width=\"100%\" id=\"AutoNumber2\">\r\n");
      out.write("  <tr>\r\n");
      out.write("         <td width=\"100%\" bgcolor=\"#DFD2C1\"><div align=\"center\">\r\n");
      out.write("             <center>\r\n");
      out.write("             <table border=\"0\" cellpadding=\"2\" cellspacing=\"0\" style=\"border-collapse: collapse\" bordercolor=\"#111111\" width=\"500\" id=\"AutoNumber3\">\r\n");
      out.write("           <form name=\"admin\" onSubmit=\"return check()\" action=\"admloginConfirm\"  method=\"post\" >\r\n");
      out.write("                          <tr>\r\n");
      out.write("                                 <td width=\"13%\" align=\"center\"><img border=\"0\" src=\"images/002.gif\" width=\"60\" height=\"18\"></td>\r\n");
      out.write("                                 <td width=\"12%\" align=\"center\"><input type=\"text\" size=\"20\" name=\"id\" style=\"color: #7C6F69; width: 150; height: 18; font-size: 9pt; cursor: default; font-family: Verdana; text-align: center; background-image: url('images/003.gif'); border-width: 0\"></td>\r\n");
      out.write("                                 <td width=\"13%\" align=\"center\"><img border=\"0\" src=\"images/004.gif\" width=\"60\" height=\"18\"></td>\r\n");
      out.write("                                 <td width=\"12%\" align=\"center\"><input type=\"password\" size=\"20\" name=\"password\" style=\"color: #7C6F69; width: 150; height: 18; font-size: 9pt; cursor: default; font-family: Verdana; text-align: center; background-image: url('images/003.gif'); border-width: 0\"></td>\r\n");
      out.write("                                 <td width=\"13%\" align=\"center\">&nbsp;</td>\r\n");
      out.write("                                 <td width=\"12%\" align=\"center\">&nbsp;</td>\r\n");
      out.write("                                 <td width=\"13%\" align=\"center\"><input type=\"submit\" name=\"submit\" value=\"登录\">\r\n");
      out.write("                                 <td width=\"12%\" align=\"center\">&nbsp;</td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("               </form>\r\n");
      out.write("             </table>\r\n");
      out.write("\r\n");
      out.write("             </center>\r\n");
      out.write("             </div>\r\n");
      out.write("         </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("  <p>　</center>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
