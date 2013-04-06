package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.Iterator;
import org.hotelmanager.entity.RoomType;
import org.hotelmanager.factory.RoomTypeFactory;

public final class ViewRoomType_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>客房类型信息一览</title>\r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("\tvar color;\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"images/bg.jpg\">\r\n");
      out.write("<p>\r\n");
      out.write("<p>\r\n");
      out.write("<div align=\"center\"><h2>客房类型信息一览</h2></div>\r\n");
      out.write("<p>\r\n");
      out.write("<table width=\"600\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("\t<tr bgcolor=\"#99CCFF\">\r\n");
      out.write("\t\t<td align=\"center\"><b>类型名称</b></td>\r\n");
      out.write("\t\t<td align=\"center\"><b>类型价格</b></td>\r\n");
      out.write("\t\t<td align=\"center\"><b>加床价格</b></td>\r\n");
      out.write("\t\t<td align=\"center\"><b>是否加床</b></td>\r\n");
      out.write("\t\t<td align=\"center\"><b>备注</b></td>\r\n");
      out.write("\t\t<td align=\"center\">&nbsp;</td>\r\n");
      out.write("\t\t<td align=\"center\">&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");

		List<RoomType> types = RoomTypeFactory.newInstance().getAllRoomTypes();
		//遍历集合动态显示表格
		Iterator<RoomType> iter = types.iterator();
		while (iter.hasNext()) {
			RoomType type = iter.next();
      out.write("\r\n");
      out.write("\t\t\t<tr onMouseOver=\"color=this.style.backgroundColor;this.style.backgroundColor='#FFFFCC'\" onMouseOut=\"this.style.backgroundColor=color\">\r\n");
      out.write("\t\t\t\t<td align=\"center\">");
      out.print(type.getTypeName() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td align=\"center\">");
      out.print(type.getTypePrice() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td align=\"center\">");
      out.print(type.getAddBedPrice() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td align=\"center\">");
      out.print(type.getIsAddBed() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td align=\"center\">");
      out.print(type.getRemark() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><a href=\"servlet/GetRoomTypeServlet?typeId=");
      out.print(type.getTypeId() );
      out.write("\"><img src=\"images/edit.gif\" width=\"16\" height=\"15\" border=\"0\"></a></td>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><a href=\"servlet/DelRoomTypeServlet?typeId=");
      out.print(type.getTypeId() );
      out.write("\" onClick=\"return confirm('确认要删除么？')\"><img src=\"images/delete.gif\" width=\"16\" height=\"15\" border=\"0\"></a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("</table>\r\n");
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
