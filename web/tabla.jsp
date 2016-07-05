<%-- 
    Document   : tabla
    Created on : 11/11/2015, 09:06:43 AM
    Author     : edward
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="BusquedaUsuario">
        <input type="text" name="nombre">
        <input type="submit" name="enviar">
        </form>
        
        <%@page import="java.sql.*" %>
        
<%
    
    
String Nombre;
Nombre=request.getParameter("nombre");
//out.println("<script>alert('An alert message');</script>");
Class.forName("com.mysql.jdbc.Driver");
Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/titulacion", "root", "123");
 
Statement Estamento = conexion.createStatement();
ResultSet rs = Estamento.executeQuery("select codigo_alumno,nombre,modalidad,estado from alumno");

out.println("<table border=1>");

out.println("<tr><th>Codigo</th><th>Nombre</th><th>Modalidad</th><th>Estado del tramite</th></tr>");

while (rs.next()) {

out.println("<tr>");
        

    out.println("<td>");    

        out.println(rs.getString("codigo_alumno"));

        out.println("</td><td>");

        out.println(rs.getString("nombre"));

        out.println("</td><td>");

        out.println(rs.getString("modalidad"));
        
        out.println("</td><td>");

        out.println(rs.getString("estado"));

    out.println("</td>");

out.println("</tr>");

}

out.println("</table>");

rs.close();
Estamento.close();
conexion.close();

%>
    </body>
</html>
