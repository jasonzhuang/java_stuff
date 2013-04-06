package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.hotelmanager.entity.Room;
import org.hotelmanager.factory.RoomFactory;
import java.util.List;
import java.util.Iterator;

public final class RoomState_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>客房状态管理</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.trBg {\r\n");
      out.write("\t\tbackground:url(images/state.jpg);\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\" language=\"javascript\">\r\n");
      out.write("\tfunction enabled() {\r\n");
      out.write("\t\tdocument.getElementById(\"txtTypeName\").disabled = true;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");

	//获得Session中存储的内容
	String typeName = (String)session.getAttribute("typeName");
	if (typeName != null) {
		pageContext.setAttribute("typeName",typeName);
	}

      out.write("\r\n");
      out.write("<body background=\"images/bg.jpg\" onLoad=\"enabled()\">\r\n");
      out.write("<p>\r\n");
      out.write("<h2 align=\"center\">房间状态管理</h2>\r\n");
      out.write("<div style=\"position:absolute; width: 184px; height: 400px;\">\r\n");
      out.write("<form action=\"\" name=\"myform\" method=\"post\">\r\n");
      out.write("\t<table style=\"position:absolute; width:180px; height:400px; left: 1px; top: 14px;\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"center\" colspan=\"2\">类型：<input type=\"text\" id=\"txtTypeName\" name=\"txtTypeName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageScope.typeName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"15\"><br></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"center\" colspan=\"2\">选择房间状态</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr class=\"trBg\">\r\n");
      out.write("\t\t<td width=\"80\" align=\"center\"><input type=\"radio\" name=\"radState\" value=\"空闲\">\r\n");
      out.write("\t    空闲</td>\r\n");
      out.write("\t\t  <td width=\"78\" align=\"center\"><img src=\"RoomImages/empty.jpg\" width=\"32\" height=\"32\" align=\"absmiddle\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr align=\"center\" class=\"trBg\">\r\n");
      out.write("\t\t<td align=\"center\"><input type=\"radio\" name=\"radState\" value=\"入住\">\r\n");
      out.write("\t\t入住</td>\r\n");
      out.write("\t\t<td align=\"center\"><img src=\"RoomImages/housing.jpg\" width=\"32\" height=\"32\" align=\"absmiddle\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr align=\"center\" class=\"trBg\">\r\n");
      out.write("\t\t<td align=\"center\"><input type=\"radio\" name=\"radState\" value=\"将到\">\r\n");
      out.write("\t\t将到</td>\r\n");
      out.write("\t\t<td align=\"center\"><img src=\"RoomImages/arrive.jpg\" width=\"32\" height=\"32\" align=\"absmiddle\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr align=\"center\" class=\"trBg\">\r\n");
      out.write("\t\t<td align=\"center\"><input type=\"radio\" name=\"radState\" value=\"将离\">\r\n");
      out.write("\t\t将离</td>\r\n");
      out.write("\t\t<td align=\"center\"><img src=\"RoomImages/leave.jpg\" width=\"32\" height=\"32\" align=\"absmiddle\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr align=\"center\">\r\n");
      out.write("\t\t<td align=\"center\" colspan=\"2\"><input name=\"btnModify\" type=\"button\" id=\"btnModify\" value=\" 更 新 \" onClick=\"modify()\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");

	//获得房间号
	String roomId = (String)session.getAttribute("roomId");
	if (roomId != null) {
      out.write("\t\t\r\n");
      out.write("\t\t<script type=\"text/javascript\" language=\"javascript\">\r\n");
      out.write("\t\t\tdocument.getElementById(\"btnModify\").disabled = false;\r\n");
      out.write("\t\t</script>\r\n");
} else {
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\" language=\"javascript\">\r\n");
      out.write("\t\t\tdocument.getElementById(\"btnModify\").disabled = true;\r\n");
      out.write("\t\t</script>\r\n");
}
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("<script type=\"text/javascript\" language=\"javascript\">\r\n");
      out.write("\t\t\tfunction modify() {\t\r\n");
      out.write("\t\t\t\tdocument.myform.action = \"servlet/MofifyRoomStateServlet?roomId=");
      out.print(roomId);
      out.write("\";\r\n");
      out.write("\t\t\t\tdocument.myform.submit();\r\n");
      out.write("\t\t\t}\t\r\n");
      out.write("</script>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"position:absolute; width:568px; left: 198px; top: 82px; height: 356px; height:400px;\" id=\"RoomView1\">\r\n");
      out.write("\t");

		List<Room> rooms = RoomFactory.newInstance().getAllRooms();
		Iterator<Room> iter = rooms.iterator();
		while (iter.hasNext()) {
			Room room = iter.next();
      out.write("\r\n");
      out.write("\t\t\t\t\t");

						if (room.getState().equals("空闲")) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"servlet/GetRoomStateServlet?roomId=");
      out.print(room.getRoomId() );
      out.write("\"><img src=\"RoomImages/empty.jpg\" width=\"32\" height=\"32\" align=\"absbottom\" style=\"margin:2px\"></a><span>");
      out.print(room.getNumber() );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t");
} else if (room.getState().equals("入住")) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"servlet/GetRoomStateServlet?roomId=");
      out.print(room.getRoomId() );
      out.write("\"><img src=\"RoomImages/housing.jpg\" width=\"32\" height=\"32\" align=\"absbottom\" style=\"margin:2px\"></a><span>");
      out.print(room.getNumber() );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t");
}  else if (room.getState().equals("将到")) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"servlet/GetRoomStateServlet?roomId=");
      out.print(room.getRoomId() );
      out.write("\"><img src=\"RoomImages/arrive.jpg\" width=\"32\" height=\"32\" align=\"absbottom\" style=\"margin:2px\"></a><span>");
      out.print(room.getNumber() );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t");
} else if (room.getState().equals("将离")) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"servlet/GetRoomStateServlet?roomId=");
      out.print(room.getRoomId() );
      out.write("\"><img src=\"RoomImages/leave.jpg\" width=\"32\" height=\"32\" align=\"absbottom\" style=\"margin:2px\"></a><span>");
      out.print(room.getNumber() );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t");
}	
      out.write("\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");

	//获得Session中存储的客房状态
	String state = (String)session.getAttribute("RoomState");
	if (state != null) {
		if (state.equals("空闲")) {
      out.write("\r\n");
      out.write("\t\t\t<script type=\"text/javascript\" language=\"javascript\">\r\n");
      out.write("\t\t\t\tdocument.myform.radState[0].checked = true;\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t");
} else if (state.equals("入住")) {
      out.write("\r\n");
      out.write("\t\t\t<script type=\"text/javascript\" language=\"javascript\">\r\n");
      out.write("\t\t\t\tdocument.myform.radState[1].checked = true;\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t");
} else if (state.equals("将到")) {
      out.write("\r\n");
      out.write("\t\t\t<script type=\"text/javascript\" language=\"javascript\">\r\n");
      out.write("\t\t\t\tdocument.myform.radState[4].checked = true;\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t");
} else if (state.equals("将离")) {
      out.write("\r\n");
      out.write("\t\t\t<script type=\"text/javascript\" language=\"javascript\">\r\n");
      out.write("\t\t\t\tdocument.myform.radState[5].checked = true;\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t");
}
	}

      out.write("\r\n");
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
