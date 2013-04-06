package org.apache.jsp.administrotor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=GB2312");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Login</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body BGCOLOR=\"#FDF5E6\">\r\n");
      out.write("\r\n");
      out.write("\t\t<H1 align=\"center\">Login Page</H1>\r\n");
      out.write("\r\n");
      out.write("\t\t");
 if(request.getAttribute("err")!=null){
      out.write("\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t<FONT color=\"red\">\r\n");
      out.write("\t\t");
      out.print(request.getAttribute("err"));
      out.write("\r\n");
      out.write("\t\t</FONT>\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\t\t");
 }
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<form method=\"POST\" name=\"frm1\" action=\"../LoginCheck\">\r\n");
      out.write("    \r\n");
      out.write("\t\t<p align=\"center\">UserName: <input type=\"text\" name=\"name\" value=\"Moteladminst\" /></p>\r\n");
      out.write("\t\t<p align=\"center\">PassWord: <input type=\"password\" name=\"pwd\" value=\"Moteladminst\" /></p>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div align=\"center\">\r\n");
      out.write("    \t<input type=\"radio\" name=\"choice\" value=\"Client\" checked=\"checked\"/>Client\r\n");
      out.write("    \t<input type=\"radio\" name=\"choice\" value=\"Administrator\" />Administrator\r\n");
      out.write("    \t</div>\r\n");
      out.write(" \r\n");
      out.write("\t\t<div>\r\n");
      out.write("    \t<p align=\"center\"><input type=\"submit\" name=\"Submit\" value=\"Login\" /></p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t\r\n");
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
