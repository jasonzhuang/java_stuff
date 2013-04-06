package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forward_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=gb2312");
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
      out.write("<title>Forward</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
 if (request.getParameter("name")!=null && request.getParameter("pwd")!=null && !request.getParameter("name").equals("") && !request.getParameter("pwd").equals("") ) {
      out.write("\r\n");
      out.write("     ");
 if(request.getParameter("logintype").equals("student")) { 
      out.write("\r\n");
      out.write("        ");
      if (true) {
        _jspx_page_context.forward("Student.jsp");
        return;
      }
      out.write("\r\n");
      out.write("     ");
}else{
      out.write("\r\n");
      out.write("        ");
      if (true) {
        _jspx_page_context.forward("Teacher.jsp");
        return;
      }
      out.write("\r\n");
      out.write("     ");
}
      out.write('\r');
      out.write('\n');
}else{ 
      out.write("\r\n");
      out.write("     <center>\r\n");
      out.write("     <font color=\"red\">\r\n");
      out.write("     用户名或密码不能为空！\r\n");
      out.write("     </font>\r\n");
      out.write("     </center>\r\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "login.jsp", out, false);
      out.write('\r');
      out.write('\n');
}
      out.write("\r\n");
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
