/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-01-17 02:22:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
 
String path = request.getContextPath(); 
String basePath = request.getScheme()+"://"+ request.getServerName()+":"+ request.getServerPort()+ path +"/"; 

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<script src=\"");
      out.print(path );
      out.write("/styles/js/jquery-2.1.1.min.js\"></script> \r\n");
      out.write("<script src=\"");
      out.print(path );
      out.write("/styles/layer/layer.js\"></script> \r\n");
      out.write("<title>登录界面</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("        *{\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("        }\r\n");
      out.write("        .center0 {\r\n");
      out.write("\t\t\t  position: fixed;\r\n");
      out.write("\t\t\t  top: 50%;\r\n");
      out.write("\t\t\t  left: 50%;\r\n");
      out.write("\t\t\t  background-color: #3385FF;\r\n");
      out.write("\t\t\t  width:50%;\r\n");
      out.write("\t\t\t  height: 50%;\r\n");
      out.write("\t\t\t  -webkit-transform: translateX(-50%) translateY(-50%);\r\n");
      out.write("\t\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"center0\">\r\n");
      out.write("\t<form action=\"login\" id=\"loginForm\" method=\"post\" class=\"center0\">\r\n");
      out.write("\t\t<table style=\"margin-top: 10%;margin-left: 20%;\">\r\n");
      out.write("\t\t   \t<tr>\r\n");
      out.write("\t\t   \t\t<td style=\"color: #FFFFFF;\">用户名:</td>\r\n");
      out.write("\t\t   \t\t<td><input name=\"username\" id=\"username\" type=\"text\" placeholder=\"请输入用户名\"/></td>\r\n");
      out.write("\t\t   \t</tr>\r\n");
      out.write("\t\t   \t<tr>\r\n");
      out.write("\t\t   \t\t<td style=\"color: #FFFFFF;\">密码:</td>\r\n");
      out.write("\t\t   \t\t<td><input name=\"password\" id=\"password\" type=\"password\" placeholder=\"请输入密码\"/></td>\r\n");
      out.write("\t\t   \t</tr>\r\n");
      out.write("\t\t   \t<tr>\r\n");
      out.write("\t\t   \t\t<td><input id=\"login\" type=\"button\" value=\"登录\"/></td>\r\n");
      out.write("\t\t   \t</tr>\r\n");
      out.write("\t\t</table>  \r\n");
      out.write("\t</form>   \r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t$(\"#login\").click(function(){\r\n");
      out.write("\t\t\tvar username = $(\"#username\").val();\r\n");
      out.write("\t\t\tvar password = $(\"#password\").val();\r\n");
      out.write("\t\t\tif(username == null || username == \"\") {\r\n");
      out.write("\t\t\t\tlayer.alert(\"用户名不为空\");\r\n");
      out.write("\t\t\t}else if(password == null || password == \"\") {\r\n");
      out.write("\t\t\t\tlayer.alert(\"密码不为空\");\r\n");
      out.write("\t\t\t}else {\r\n");
      out.write("\t\t\t\t$(\"#loginForm\").submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}); \r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
