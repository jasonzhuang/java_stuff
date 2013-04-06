package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bean.TestBean;
import com.ORM.*;
import java.util.*;
import java.text.NumberFormat;

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
      out.write("    <title>Hibernate的一对多双向关联关系映射</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("  \t<h2>Hibernate的一对多双向关联关系映射</h2>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t");

		test.addCustomer();
		Integer id = new Integer(9);
		Customer customer = test.loadCustomer(id);
		test.addOrders(customer);
		test.addOrders(customer);
		test.addOrders(customer);

		//根据指定的客户，得到该客户的所有订单	
		NumberFormat  nf = NumberFormat.getCurrencyInstance();			
		out.println("<br>客户"+customer.getCname()+"的所有订单:");					
		Iterator it = customer.getOrders().iterator();
		Orders order = null;
		while (it.hasNext()){
			order = (Orders)it.next();
			out.println("<br>订单号："+order.getOrderno());
			out.println("<br>订单金额："+nf.format(order.getMoney()));			
		}
		
		//根据指定的订单，得到其所属的客户
		order = test.loadOrders(new Integer(29));
		customer = order.getCustomer();
		out.println("<br>");		
		out.println("<br>订单号为"+order.getOrderno().trim()+"的所属客户为："+customer.getCname());
	
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
