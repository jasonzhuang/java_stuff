package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddRoomType_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=gb2312");
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>添加客房类型</title>\r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\" src=\"js/Common.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"images/bg.jpg\">\r\n");
      out.write("<p>\r\n");
      out.write("<p>\r\n");
      out.write("<p>\r\n");
      out.write("<p>\r\n");
      out.write("<p>\r\n");
      out.write("<p><h2 align=\"center\">添加客房类型</h2>\r\n");
      out.write("<form action=\"servlet/AddRoomTypeServlet\" name=\"myform\" method=\"post\">\r\n");
      out.write("  <table width=\"500\" border=\"1\" align=\"center\" cellpadding=\"3\" cellspacing=\"3\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"87\">类型名称：</td>\r\n");
      out.write("        <td width=\"386\">\r\n");
      out.write("          <input name=\"txtTypeName\" type=\"text\" id=\"txtTypeName\" size=\"25\">&nbsp;<div id=\"errTypeName\" style=\"display:inline; color:#FF0000\"></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>类型价格：</td>\r\n");
      out.write("        <td><input name=\"txtTypePrice\" type=\"text\" id=\"txtTypePrice\" size=\"25\">&nbsp;<div id=\"errTypePrice\" style=\"display:inline; color:#FF0000\"></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>加床价格：</td>\r\n");
      out.write("        <td><input name=\"txtAddBedPrice\" type=\"text\" id=\"txtAddBedPrice\" size=\"25\">&nbsp;<div id=\"errAddBedPrice\" style=\"display:inline; color:#FF0000\"></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>是否加床：</td>\r\n");
      out.write("        <td><input type=\"radio\" name=\"radIsAddBed\" value=\"是\">\r\n");
      out.write("          是\r\n");
      out.write("          <input name=\"radIsAddBed\" type=\"radio\" value=\"否\" checked>\r\n");
      out.write("          否</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>备&nbsp;&nbsp;&nbsp;&nbsp;注：</td>\r\n");
      out.write("        <td><textarea name=\"txaRemark\" cols=\"30\" rows=\"5\" id=\"txaRemark\"></textarea>&nbsp;<div id=\"errRemark\" style=\"display:inline; color:#FF0000\"></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td colspan=\"2\" align=\"center\"><input name=\"btnAdd\" type=\"button\" id=\"btnAdd\" value=\" 添 加 \" onClick=\"checkRoomTypeForm()\"></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
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
