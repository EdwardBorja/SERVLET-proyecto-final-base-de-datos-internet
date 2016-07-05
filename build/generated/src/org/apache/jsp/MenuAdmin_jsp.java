package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class MenuAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\" class=\"no-js\">\n");
      out.write("    <head>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #tb5 {\n");
      out.write("\tborder:2px solid #456879;\n");
      out.write("\tborder-radius:15px;\n");
      out.write("\theight: 30px;\n");
      out.write("\twidth: 320px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#regis {\n");
      out.write("  \n");
      out.write(" \n");
      out.write("  font-family: Arial Black;\n");
      out.write("  //color: #FFFFFF;\n");
      out.write("  font-size: 23px;\n");
      out.write("  padding: 6px 50px 30px 350px;\n");
      out.write(" \n");
      out.write("}\n");
      out.write("\n");
      out.write("#btn {\n");
      out.write("  background: #3498db;\n");
      out.write("  background-image: -webkit-linear-gradient(top, #3498db, #2980b9);\n");
      out.write("  background-image: -moz-linear-gradient(top, #3498db, #2980b9);\n");
      out.write("  background-image: -ms-linear-gradient(top, #3498db, #2980b9);\n");
      out.write("  background-image: -o-linear-gradient(top, #3498db, #2980b9);\n");
      out.write("  background-image: linear-gradient(to bottom, #3498db, #2980b9);\n");
      out.write("  -webkit-border-radius: 20;\n");
      out.write("  -moz-border-radius: 20;\n");
      out.write("  border-radius: 28px;\n");
      out.write("  font-family: Arial Black;\n");
      out.write("  color: #ffffff;\n");
      out.write("  font-size: 20px;\n");
      out.write("  padding: 6px 50px 6px 50px;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("            \n");
      out.write("   #bg{\n");
      out.write("    position:fixed;\n");
      out.write("    top:0;\n");
      out.write("    left:0;\n");
      out.write("    z-index:-1;\n");
      out.write("   }\n");
      out.write(" </style>\n");
      out.write(" <script> \n");
      out.write(" window.onload = function() {\n");
      out.write(" \n");
      out.write("    function bgadj(){\n");
      out.write("             \n");
      out.write("        var element = document.getElementById(\"bg\");\n");
      out.write("         \n");
      out.write("        var ratio =  element.width / element.height;   \n");
      out.write("         \n");
      out.write("        if ((window.innerWidth / window.innerHeight) < ratio){\n");
      out.write("         \n");
      out.write("            element.style.width = 'auto';\n");
      out.write("            element.style.height = '100%';\n");
      out.write("             \n");
      out.write("            <!-- si la imagen es mas ancha que la ventana la centro -->\n");
      out.write("            if (element.width > window.innerWidth){\n");
      out.write("             \n");
      out.write("                var ajuste = (window.innerWidth - element.width)/2;\n");
      out.write("                 \n");
      out.write("                element.style.left = ajuste+'px';\n");
      out.write("             \n");
      out.write("            }\n");
      out.write("         \n");
      out.write("        }\n");
      out.write("        else{  \n");
      out.write("         \n");
      out.write("            element.style.width = '100%';\n");
      out.write("            element.style.height = 'auto';\n");
      out.write("            element.style.left = '0';\n");
      out.write(" \n");
      out.write("        }\n");
      out.write("         \n");
      out.write("    }\n");
      out.write("<!-- llamo a la función bgadj() por primera vez al terminar de cargar la página -->\n");
      out.write("    bgadj();\n");
      out.write("    <!-- vuelvo a llamar a la función  bgadj() al redimensionar la ventana -->\n");
      out.write("    window.onresize = function() {\n");
      out.write("        bgadj();\n");
      out.write(" \n");
      out.write("    }\n");
      out.write("  \n");
      out.write(" \n");
      out.write("}\n");
      out.write("  </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <img id=\"bg\" src=\"Azul.jpg\"  alt=\"background\" /> \n");
      out.write("     \n");
      out.write("        <div class=\"page-container\"  style=\"text-align:center;\">\n");
      out.write("\n");
      out.write("  <h1 align=\"CENTER\"><FONT FACE=\"arial\" SIZE=30 COLOR=\"WHITE\">Bienvenido administrador</FONT></h1>\n");
      out.write("           \n");


//out.println("<script>alert('An alert message');</script>");
Class.forName("com.mysql.jdbc.Driver");
Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/titulacion", "root", "123");
 
Statement Estamento = conexion.createStatement();
ResultSet rs = Estamento.executeQuery("select codigo_alumno,nombre,correo,telefono,modalidad,ingreso,egreso,promedio,estado,registro from alumno order by codigo_alumno desc");

out.println("<table border=1 aling=center bgcolor=white style=font-size:15px >");

out.println("<tr><th>Codigo de estudiante</th><th>Nombre</th><th>Correo</th><th>Telefono</th><th>Modalidad de titulacion</th><th>Fecha de ingreso</th><th>Fecha de egreso</th><th>Promedio</th><th>Fecha de registro</th><th>Estado del tramite</th></tr>");

while (rs.next()) {

out.println("<tr>");
        

    out.println("<td>");    

        out.println(rs.getString("codigo_alumno"));

        out.println("</td><td>");

        out.println(rs.getString("nombre"));

        out.println("</td><td>");

        out.println(rs.getString("correo"));
        
        out.println("</td><td>");

        out.println(rs.getString("telefono"));
        
        out.println("</td><td>");

        out.println(rs.getString("modalidad"));
        
        out.println("</td><td>");

        out.println(rs.getString("ingreso"));
        
        out.println("</td><td>");

        out.println(rs.getString("egreso"));
        
        out.println("</td><td>");

        out.println(rs.getString("promedio"));
        
        out.println("</td><td>");

        
         out.println(rs.getString("registro"));
        
        out.println("</td><td>");

        out.println(rs.getString("estado"));
        
        

    out.println("</td>");

out.println("</tr>");

}

out.println("</table>");

rs.close();
Estamento.close();
conexion.close();


      out.write("\n");
      out.write("             \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          <form action=\"Modificar\" method=\"post\">\n");
      out.write("          <table>\n");
      out.write("              <tr> <th> <h1><FONT FACE=\"arial\" SIZE=5 COLOR=\"WHITE\">Cambiar estado del tramite a</FONT></th>\n");
      out.write("              <th>     \n");
      out.write("              </h1> <select id=\"campotexto\" name=\"estate\">\n");
      out.write("                         <option value=\"En proceso\">En proceso</option>\n");
      out.write("                         <option value=\"Aceptado\">Aceptado</option>\n");
      out.write("                         <option value=\"Terminado\">Terminado</option>\n");
      out.write("          \n");
      out.write("                        </select> \n");
      out.write("              </th> \n");
      out.write("          <th> <h1><FONT FACE=\"arial\" SIZE=5 COLOR=\"WHITE\">Al alumno con el codigo</FONT></h1></th>\n");
      out.write("            \n");
      out.write("          <th>  <input  id=\"codigo\" type=\"text\" name=\"codigo\"  class=\"password\" placeholder=\"Codigo\" require=\"llenar campo\"></th>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          <th>\n");
      out.write("          \n");
      out.write("          <input type=\"submit\" value=\"Cambiar estado\" name=\"Cestado\" />\n");
      out.write("         \n");
      out.write("          </th>\n");
      out.write("                 \n");
      out.write("              </tr> \n");
      out.write("              \n");
      out.write("          </table>\n");
      out.write("            \n");
      out.write("         </form>\n");
      out.write("           \n");
      out.write("          </div>\n");
      out.write("<form action=\"Busqueda.jsp\">\n");
      out.write(" <input type=\"submit\" value=\"Busquedas de informacion\" name=\"Cerrar\" />\n");
      out.write(" \n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<br> <br>\n");
      out.write("\n");
      out.write("<form action=\"index.html\">\n");
      out.write(" <input type=\"submit\" value=\"Salir\" name=\"Cerrar\" />\n");
      out.write(" \n");
      out.write("</form>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
