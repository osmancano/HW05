/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-01-18 03:52:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class changeUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <title>TIY, HW05</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("            function validateForm() {\n");
      out.write("                var x = document.forms[\"MyForm\"][\"username\"].value;\n");
      out.write("                if (x == \"\") {\n");
      out.write("                    alert(\"Name must be filled out\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("    </script>\n");
      out.write("    <style>\n");
      out.write("        /* Remove the navbar's default margin-bottom and rounded borders */\n");
      out.write("        .navbar {\n");
      out.write("            margin-bottom: 0;\n");
      out.write("            border-radius: 0;\n");
      out.write("            background-color: green;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Set height of the grid so .sidenav can be 100% (adjust as needed) */\n");
      out.write("        .row.content {height: 450px}\n");
      out.write("\n");
      out.write("\n");
      out.write("        /* Set black background color, white text and some padding */\n");
      out.write("        footer {\n");
      out.write("            background-color: green;\n");
      out.write("            color: white;\n");
      out.write("            padding: 15px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* On small screens, set height to 'auto' for sidenav and grid */\n");
      out.write("        @media screen and (max-width: 767px) {\n");
      out.write("            .sidenav {\n");
      out.write("                height: auto;\n");
      out.write("                padding: 15px;\n");
      out.write("            }\n");
      out.write("            .row.content {height:auto;}\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("            <a class=\"navbar-brand\" href=\"home.jsp\"><img src=\"imgs/TIY.png\" style=\"width:40px;\"></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"aboutUs.jsp\">About Us</a></li>\n");
      out.write("                <li class=\"active\"><a href=\"changeUser.jsp\">Change User</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li><a href=\"/logout\">Welcome&nbsp;<span class=\"badge\">");
      out.print(request.getSession().getAttribute("user"));
      out.write("</span>&nbsp;<span class=\"glyphicon glyphicon-log-out\"></span>Log Out</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<div class=\"container-fluid text-center\">\n");
      out.write("    <div class=\"row content\">\n");
      out.write("        <div class=\"col-sm-12 text-left\">\n");
      out.write("            <h2>Change Username Form:</h2>\n");
      out.write("            <form class=\"form-horizontal\" action=\"/changeUserName\" method=\"post\" name=\"MyForm\" onsubmit=\"return validateForm()\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"control-label col-sm-2\" for=\"username\">Enter New Username:</label>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"username\" name=\"username\" placeholder=\"Enter username\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"col-sm-offset-2 col-sm-2\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-success\">Change User Name</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            ");

                String result = (String)request.getAttribute("result");
                if(result!=null){
      out.write("\n");
      out.write("            <div class=\"alert alert-success\">\n");
      out.write("                <strong>");
      out.print(result);
      out.write("</strong>\n");
      out.write("            </div>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<footer class=\"container-fluid text-center\">\n");
      out.write("    <p>TIY, all Rights Reserved</p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
