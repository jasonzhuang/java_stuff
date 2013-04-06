package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import org.hotelmanager.dbprocess.ConnectionManager;
import org.hotelmanager.utils.Common;
import java.sql.SQLException;
import org.hotelmanager.factory.RoomTypeFactory;

public final class ViewRoom_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=GB2312");
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

	int dipage = 1;//当前页码数默认为1
	//获得请求参数
	String pages = request.getParameter("dipage");
	if (pages == null) {
		pages = "1";
	}
	try {
		dipage = Integer.parseInt(pages);
	} catch (Exception ex) {
		dipage = 1;
	}

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <title>客房信息一览</title>\r\n");
      out.write("  <body>\r\n");
      out.write("  \t<p>\r\n");
      out.write("\t<p>\r\n");
      out.write("\t<div align=\"center\"><h2>客房信息一览</h2></div>\r\n");
      out.write("\t<p>\r\n");
      out.write("    ");

    	//连接对象
    	Connection con;
    	//执行对象
    	Statement stmt;
    	//数据集对象
    	ResultSet rs;
    	try {
    		//获得连接
    		con = ConnectionManager.getConnection();
    		//创建执行对象
    		stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
    				ResultSet.CONCUR_READ_ONLY);
    		String sql = "SELECT * FROM Room";
    		rs = stmt.executeQuery(sql);
    		int countRecord = 0;//记录条数
    		int countPageRecord = 0;//每页记录条数
    		int countPage = 0;//总页数
    		countPageRecord = 5;//每页5条记录，要设置每页记录条数就更改这个变量的值
    		//得到记录的条数
    		rs.last();
    		countRecord = rs.getRow();
    		//得到总页数
    		if (countRecord % countPageRecord == 0)
    			countPage = countRecord / countPageRecord;
    		else
    			countPage = countRecord / countPageRecord + 1;
    		//把记录指针移至当前页第一条记录之前
    		if ((dipage - 1) * countPageRecord == 0)
    			rs.beforeFirst();
    		else
    			rs.absolute((dipage - 1) * countPageRecord);
      out.write("\r\n");
      out.write("    \t\t\t<table align=\"center\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" width=\"650\">\r\n");
      out.write("\t    \t\t\t<tr bgcolor=\"#99CCFF\">\r\n");
      out.write("\t    \t\t\t\t<td align=\"center\">房间号</td>\r\n");
      out.write("\t    \t\t\t\t<td align=\"center\">客房类型</td>\r\n");
      out.write("\t    \t\t\t\t<td align=\"center\">床位数</td>\r\n");
      out.write("\t    \t\t\t\t<td align=\"center\">客人数</td>\r\n");
      out.write("\t    \t\t\t\t<td align=\"center\">状态</td>\r\n");
      out.write("\t    \t\t\t\t<td align=\"center\">描述</td>\r\n");
      out.write("\t    \t\t\t\t<td align=\"center\">&nbsp;</td>\r\n");
      out.write("\t    \t\t\t\t<td align=\"center\">&nbsp;</td>\r\n");
      out.write("\t    \t\t\t</tr>\r\n");
      out.write("    \t\t");

    			int i = 0;
    			while (rs.next()) {
      out.write("\r\n");
      out.write("\t    \t\t\t<tr onMouseOver=\"color=this.style.backgroundColor;this.style.backgroundColor='#FFFFCC'\" onMouseOut=\"this.style.backgroundColor=color\">\r\n");
      out.write("\t    \t\t\t\t<td align=\"center\">");
      out.print(rs.getString("Number").trim() );
      out.write("</td>\r\n");
      out.write("\t    \t\t\t\t<td align=\"center\">");
      out.print(RoomTypeFactory.newInstance().getTypeNameByTypeId(rs.getInt("TypeId")) );
      out.write("</td>\r\n");
      out.write("\t    \t\t\t\t<td align=\"center\">");
      out.print(rs.getInt("BedNumber") );
      out.write("</td>\r\n");
      out.write("\t    \t\t\t\t<td align=\"center\">");
      out.print(rs.getInt("GusetNumber") );
      out.write("</td>\r\n");
      out.write("\t    \t\t\t\t<td align=\"center\">");
      out.print(rs.getString("State").trim() );
      out.write("</td>\r\n");
      out.write("\t    \t\t\t\t<td align=\"center\">");
      out.print(rs.getString("Description").trim() );
      out.write("</td>\r\n");
      out.write("\t    \t\t\t\t<td align=\"center\"><a href=\"servlet/GetRoomServlet?roomId=");
      out.print(rs.getInt("RoomId") );
      out.write("\"><img src=\"images/edit.gif\" width=\"16\" height=\"15\" border=\"0\"></a></td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"><a href=\"servlet/DelRoomServlet?roomId=");
      out.print(rs.getInt("RoomId") );
      out.write("\" onClick=\"return confirm('确认要删除么？')\"><img src=\"images/delete.gif\" width=\"16\" height=\"15\" border=\"0\"></a></td>\r\n");
      out.write("\t    \t\t\t</tr>\r\n");
      out.write("    \t\t\t");

    			i++;
    			if (i >= countPageRecord)
    				break; //当前页显示完，则退出循环
    		}
      out.write("\r\n");
      out.write("    \t\t\t<tr><td colspan=\"8\" align=\"center\">共");
      out.print(countRecord );
      out.write("条记录,共");
      out.print(countPage );
      out.write("页,\r\n");
      out.write("    \t\t\t 当前第");
      out.print(dipage );
      out.write("页，每页");
      out.print(countPageRecord );
      out.write("条记录<br/>\r\n");
      out.write("    \t\t");
if (dipage == 1)//当前是首页
    			;
    		else {
      out.write("\r\n");
      out.write("    \t\t\t<a href=ViewRoom.jsp?dipage=1>首页</a>&nbsp;&nbsp;\r\n");
      out.write("    \t\t\t<a href=ViewRoom.jsp?dipage=");
      out.print((dipage - 1) );
      out.write(">上一页</a>\r\n");
      out.write("    \t\t");
}
    		if (dipage == countPage)//当前是末页
    			;
    		else {
      out.write("\r\n");
      out.write("    \t\t\t<a href=ViewRoom.jsp?dipage=");
      out.print((dipage + 1) );
      out.write(">下一页</a>&nbsp;&nbsp;\r\n");
      out.write("    \t\t\t<a href=ViewRoom.jsp?dipage=");
      out.print(countPage );
      out.write(">尾页</a>\r\n");
      out.write("    \t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("    \t\t");
con.close();
    	} catch (SQLException ex) {
    		Common.errLog(ex.toString());
    	}
    
      out.write("\r\n");
      out.write("  </body>\r\n");
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
