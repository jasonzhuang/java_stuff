package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class book_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("本Motel。。。。。。。。。。（描述基本信息)<p>\r\n");
      out.write("地址： 西湖区。。。。。<p>\r\n");
      out.write("周边环境：。。。。。。。。。<p>\r\n");
      out.write("<title>预定</title><p>\r\n");
      out.write("<form action=\"servlet/Book\" method=\"post\" name=\"book\">\r\n");
      out.write("\t入住时间：<input name=\"inTime\" type=\"text\">(yyyy-mm-rr格式,如2009-06-15)<p>\r\n");
      out.write("\t离店时间：<input name=\"outTime\" type=\"text\">(yyyy-mm-rr格式)<p>\r\n");
      out.write("\t房间类型：<input name=\"roomType\" type=\"text\"><p> \r\n");
      out.write("\t姓名：\t  <input name=\"customName\" type=\"text\"><p>\r\n");
      out.write("\t身份证号:  <input namne=\"personId\" type=\"text\"><p>\r\n");
      out.write("\t联系电话:  <input name=\"phone\" type=\"text\"><p> \r\n");
      out.write("\t<input name=\"submit\" type=\"submit\" value=\"预定\">\r\n");
      out.write("</form>\r\n");
      out.write("<a href=\"main.htm\">返回首页</a>");
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
