package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddRoom_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/MyTag.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmytag_005fAddTypeTag_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fmytag_005fAddTypeTag_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fmytag_005fAddTypeTag_005fnobody.release();
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>添加客房信息</title>\r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\" src=\"js/Common.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"images/bg.jpg\">\r\n");
      out.write("<p>\r\n");
      out.write("<p>\r\n");
      out.write("<p>\r\n");
      out.write("<p>\r\n");
      out.write("<p>\r\n");
      out.write("<p>\r\n");
      out.write("<h2 align=\"center\">添加客房信息</h2>\r\n");
      out.write("<form action=\"servlet/AddRoomServlet\" name=\"myform\" method=\"post\" id=\"myform\">\r\n");
      out.write("  <table width=\"600\" border=\"1\" align=\"center\" cellpadding=\"3\" cellspacing=\"3\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td width=\"75\">房&nbsp;间&nbsp;号：</td>\r\n");
      out.write("      <td width=\"498\"><input name=\"txtRoomNo\" type=\"text\" id=\"txtRoomNo\" size=\"25\">&nbsp;<div id=\"errRoomNo\" style=\"display:inline; color:#FF0000\"></div></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>客房类型：</td>\r\n");
      out.write("      <td>");
      if (_jspx_meth_mytag_005fAddTypeTag_005f0(_jspx_page_context))
        return;
      out.write("&nbsp;<div id=\"errRoomType\" style=\"display:inline; color:#FF0000\"></div></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>客房状态：</td>\r\n");
      out.write("      <td><select name=\"cboState\" id=\"cboState\">\r\n");
      out.write("        <option value=\"--客房状态--\">--客房状态--</option>\r\n");
      out.write("        <option value=\"将离\">将离</option>\r\n");
      out.write("        <option value=\"将到\">将到</option>\r\n");
      out.write("        <option value=\"入住\">入住</option>\r\n");
      out.write("        <option value=\"空闲\">空闲</option>\r\n");
      out.write("      </select>&nbsp;<div id=\"errState\" style=\"display:inline; color:#FF0000\"></div>\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>床&nbsp;位&nbsp;数：</td>\r\n");
      out.write("      <td><input name=\"txtBedNumber\" type=\"text\" id=\"txtBedNumber\" size=\"25\">&nbsp;<div id=\"errBedNumber\" style=\"display:inline; color:#FF0000\"></div></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>客&nbsp;人&nbsp;数：</td>\r\n");
      out.write("      <td><input name=\"txtGuestNumber\" type=\"text\" id=\"txtGuestNumber\" size=\"25\">&nbsp;<div id=\"errGusetNumber\" style=\"display:inline; color:#FF0000\"></div></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>描&nbsp;&nbsp;&nbsp;&nbsp;述：</td>\r\n");
      out.write("      <td><textarea name=\"txtDescription\" cols=\"30\" rows=\"5\" id=\"txtDescription\"></textarea>&nbsp;<div id=\"errDescription\" style=\"display:inline; color:#FF0000\"></div></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td colspan=\"2\" align=\"center\"><input name=\"btnAdd\" type=\"button\" id=\"btnAdd\" value=\" 添 加 \" onClick=\"checkRoomForm()\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
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

  private boolean _jspx_meth_mytag_005fAddTypeTag_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mytag:AddTypeTag
    org.hotelmanager.jstl.AddRoomTypeTag _jspx_th_mytag_005fAddTypeTag_005f0 = (org.hotelmanager.jstl.AddRoomTypeTag) _005fjspx_005ftagPool_005fmytag_005fAddTypeTag_005fnobody.get(org.hotelmanager.jstl.AddRoomTypeTag.class);
    _jspx_th_mytag_005fAddTypeTag_005f0.setPageContext(_jspx_page_context);
    _jspx_th_mytag_005fAddTypeTag_005f0.setParent(null);
    int _jspx_eval_mytag_005fAddTypeTag_005f0 = _jspx_th_mytag_005fAddTypeTag_005f0.doStartTag();
    if (_jspx_th_mytag_005fAddTypeTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmytag_005fAddTypeTag_005fnobody.reuse(_jspx_th_mytag_005fAddTypeTag_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fmytag_005fAddTypeTag_005fnobody.reuse(_jspx_th_mytag_005fAddTypeTag_005f0);
    return false;
  }
}
