package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>管理员登录</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".bgimg{\r\n");
      out.write("\tbackground-image:url(images/login.jpg);\r\n");
      out.write("\tbackground-repeat:no-repeat;\r\n");
      out.write("}\r\n");
      out.write(".mytext{\r\n");
      out.write("\tbackground-image:url(images/txt.jpg);\r\n");
      out.write("\tborder-style:none;\r\n");
      out.write("\tbackground-color:#FFFFFF;\r\n");
      out.write("\twidth:104px;\r\n");
      out.write("\theight:21px;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("}\r\n");
      out.write(".mybutton{\r\n");
      out.write("\tbackground-image:url(images/submit.jpg);\r\n");
      out.write("\twidth:41px;\r\n");
      out.write("\theight:22px;\r\n");
      out.write("\tborder:thin;\r\n");
      out.write("}\r\n");
      out.write(".mybutton1{\r\n");
      out.write("\tbackground-image:url(images/Reset.jpg);\r\n");
      out.write("\twidth:41px;\r\n");
      out.write("\theight:22px;\r\n");
      out.write("\tborder:thin;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("function checkForm(){\r\n");
      out.write("\tvar username=document.myform.txtUserName.value;\r\n");
      out.write("\tvar password=document.myform.txtPassword.value;\r\n");
      out.write("\tvar sncode = document.myform.txtSnCode.value;\r\n");
      out.write("\tvar patternName=/\\W/;\r\n");
      out.write("\tvar patternPwd=/[\\W_]/;\r\n");
      out.write("\tif(username.length==0){\r\n");
      out.write("\t\twindow.alert(\"请输入用户名！\");\r\n");
      out.write("\t\tdocument.myform.txtUserName.focus();\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(patternName.test(username)){\r\n");
      out.write("\t\twindow.alert(\"用户名中不能含有中文！\");\r\n");
      out.write("\t\tdocument.myform.txtUserName.value=\"\";\r\n");
      out.write("\t\tdocument.myform.txtUserName.focus();\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(password.length!=0){\r\n");
      out.write("\t\tif(password.length<6){\r\n");
      out.write("\t\t\twindow.alert(\"密码长度无效！\");\r\n");
      out.write("\t\t\tdocument.myform.txtPassword.select();\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(patternPwd.test(password)){\r\n");
      out.write("\t\t\twindow.alert(\"密码中含有非法字符！\");\r\n");
      out.write("\t\t\tdocument.myform.txtPassword.value=\"\";\r\n");
      out.write("\t\t\tdocument.myform.txtPassword.focus();\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\twindow.alert(\"请输入密码！\");\r\n");
      out.write("\t\tdocument.myform.txtPassword.focus();\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\tif (sncode.length!=0) {\r\n");
      out.write("\t\tif (sncode.length!=4) {\r\n");
      out.write("\t\t\twindow.alert(\"验证码无效！\");\r\n");
      out.write("\t\t\tdocument.myform.txtSnCode.value=\"\";\r\n");
      out.write("\t\t\tdocument.myform.txtSnCode.focus();\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\twindow.alert(\"请输入验证码！\");\r\n");
      out.write("\t\tdocument.myform.txtSnCode.focus();\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\tmyform.submit();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onLoad=\"myform.txtUserName.focus()\">\r\n");
      out.write("<form action=\"servlet/LoginServlet\" method=\"post\" name=\"myform\" id=\"myform\">\r\n");
      out.write("  <p>&nbsp;</p>\r\n");
      out.write("  <p>&nbsp;</p>\r\n");
      out.write("  <table width=\"408\" height=\"272\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" class=\"bgimg\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td valign=\"top\"><p>&nbsp;</p>\r\n");
      out.write("        <p>&nbsp;</p>\r\n");
      out.write("        <p>&nbsp;</p>\r\n");
      out.write("        <table width=\"408\" height=\"151\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"170\" align=\"center\">用户名：</td>\r\n");
      out.write("            <td width=\"238\"><label>\r\n");
      out.write("              <input name=\"txtUserName\" type=\"text\" class=\"mytext\" id=\"txtUserName\">\r\n");
      out.write("            </label></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td align=\"center\">密&nbsp;&nbsp;码：</td>\r\n");
      out.write("            <td><input name=\"txtPassword\" type=\"password\" class=\"mytext\" id=\"txtPassword\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"38\" align=\"center\">验证码：</td>\r\n");
      out.write("            <td><input name=\"txtSnCode\" type=\"text\" class=\"mytext\" id=\"txtSnCode\">&nbsp;<img src=\"servlet/RandomNumCode\" alt=\"snCode\" border=\"1\" style=\"height:21px;\"/></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td colspan=\"2\" align=\"center\"><input name=\"btnLogin\" type=\"button\" class=\"mybutton\" id=\"btnLogin\" value=\"   \" onClick=\"checkForm()\">\r\n");
      out.write("            &nbsp;<input name=\"btnReset\" type=\"reset\" class=\"mybutton1\" id=\"btnReset\" value=\"   \"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>        \r\n");
      out.write("        <p><br>\r\n");
      out.write("            </p></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write(" </form>\r\n");
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
