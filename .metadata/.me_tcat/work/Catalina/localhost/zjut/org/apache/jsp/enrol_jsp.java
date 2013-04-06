package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class enrol_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
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
      out.write("    <title>注册</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body >\r\n");
      out.write("<form  method=\"post\" action=\"enrolStudent\">\r\n");
      out.write("<input type=\"hidden\" name=\"action\" value=\"new\">\r\n");
      out.write("  <p>&nbsp;</p>\r\n");
      out.write("  <table width=\"49%\" height=\"50\"  border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("    <tr> \r\n");
      out.write("      <td width=\"24%\">学号</td>\r\n");
      out.write("      <td width=\"68%\"><input name=\"id\" type=\"text\" ></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr> \r\n");
      out.write("      <td>姓名</td>\r\n");
      out.write("      <td><input name=\"name\" type=\"text\" ></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr> \r\n");
      out.write("      <td>密码</td>\r\n");
      out.write("      <td><input name=\"password\" type=\"password\" maxlength=\"10\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr> \r\n");
      out.write("      <td>所在学院</td>\r\n");
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
      out.write("    <tr> \r\n");
      out.write("      <td>性别</td>\r\n");
      out.write("      <td><select name=\"sex\" size=\"1\" id=\"sex\">\r\n");
      out.write("          <option>男</option>\r\n");
      out.write("          <option>女</option>\r\n");
      out.write("        </select></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr> \r\n");
      out.write("      <td>籍贯</td>\r\n");
      out.write("      <td><select name=\"jiguan\" size=\"1\" id=\"jiguan\">\r\n");
      out.write("          <option>浙江</option>\r\n");
      out.write("          <option>福建</option>\r\n");
      out.write("          <option>黑龙江</option>\r\n");
      out.write("          <option>湖南</option>\r\n");
      out.write("          <option>河北</option>\r\n");
      out.write("          <option>江苏</option>\r\n");
      out.write("          <option>湖北</option>\r\n");
      out.write("          <option>河南</option>\r\n");
      out.write("          <option>山西</option>\r\n");
      out.write("          <option>广东</option>\r\n");
      out.write("          <option>北京</option>\r\n");
      out.write("          <option>上海</option>\r\n");
      out.write("          <option>安徽</option>\r\n");
      out.write("          <option>海南</option>\r\n");
      out.write("          <option>其他</option>\r\n");
      out.write("        </select></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  <p>&nbsp;</p>\r\n");
      out.write("  <p align=\"center\"> \r\n");
      out.write("    <input type=\"submit\" name=\"submit\" value=\"确定\">\r\n");
      out.write("  </p>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write(" \r\n");
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
