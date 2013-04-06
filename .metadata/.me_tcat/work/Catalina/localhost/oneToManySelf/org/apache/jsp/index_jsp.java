package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bean.TestBean;
import com.ORM.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      com.bean.TestBean test = null;
      synchronized (_jspx_page_context) {
        test = (com.bean.TestBean) _jspx_page_context.getAttribute("test", PageContext.PAGE_SCOPE);
        if (test == null){
          test = new com.bean.TestBean();
          _jspx_page_context.setAttribute("test", test, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>Hibernate的一对多双向自身关联关系映射</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("  \t<h2>Hibernate的一对多双向自身关联关系映射</h2>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t");

		//新增一个根类别
		test.addRootCate("R","日常用品");	
		//为第一个根类别增加两个子类别
		Integer id = new Integer(1);
		Goodscate rootCate = test.loadGoodscate(id);
		test.addChildCate(rootCate,"C","餐具");
		test.addChildCate(rootCate,"T","茶具");

		//根据指定的根类别，得到其所有下级类别	
		out.println("<br>根类别“"+rootCate.getCateName()+"”的所有下级类别:");					
		Iterator it = rootCate.getChilds().iterator();
		Goodscate clild = null;
		while (it.hasNext()){
			clild = (Goodscate)it.next();
			out.println("<br>类别编号："+clild.getCateNo().trim());
			out.println("<br>类别名称："+clild.getCateName().trim());			
		}
		
		//根据指定的子类别，得到其所父类别
		clild = test.loadGoodscate(new Integer(2));
		rootCate = clild.getParent();
		out.println("<br>");		
		out.println("<br>子类别“"+clild.getCateName().trim()+"”的父类别为：");
		out.println("<br>父类别编号："+rootCate.getCateNo().trim());
		out.println("<br>父类别名称："+rootCate.getCateName().trim());			
	
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
