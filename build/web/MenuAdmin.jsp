<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : MenuAdmin
    Created on : 11/11/2015, 12:35:34 PM
    Author     : edward
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es" class="no-js">
    <head>
        <style type="text/css">
            #tb5 {
	border:2px solid #456879;
	border-radius:15px;
	height: 30px;
	width: 320px;
}

#regis {
  
 
  font-family: Arial Black;
  //color: #FFFFFF;
  font-size: 23px;
  padding: 6px 50px 30px 350px;
 
}

#btn {
  background: #3498db;
  background-image: -webkit-linear-gradient(top, #3498db, #2980b9);
  background-image: -moz-linear-gradient(top, #3498db, #2980b9);
  background-image: -ms-linear-gradient(top, #3498db, #2980b9);
  background-image: -o-linear-gradient(top, #3498db, #2980b9);
  background-image: linear-gradient(to bottom, #3498db, #2980b9);
  -webkit-border-radius: 20;
  -moz-border-radius: 20;
  border-radius: 28px;
  font-family: Arial Black;
  color: #ffffff;
  font-size: 20px;
  padding: 6px 50px 6px 50px;
  text-decoration: none;
}
            
   #bg{
    position:fixed;
    top:0;
    left:0;
    z-index:-1;
   }
 </style>
 <script> 
 window.onload = function() {
 
    function bgadj(){
             
        var element = document.getElementById("bg");
         
        var ratio =  element.width / element.height;   
         
        if ((window.innerWidth / window.innerHeight) < ratio){
         
            element.style.width = 'auto';
            element.style.height = '100%';
             
            <!-- si la imagen es mas ancha que la ventana la centro -->
            if (element.width > window.innerWidth){
             
                var ajuste = (window.innerWidth - element.width)/2;
                 
                element.style.left = ajuste+'px';
             
            }
         
        }
        else{  
         
            element.style.width = '100%';
            element.style.height = 'auto';
            element.style.left = '0';
 
        }
         
    }
<!-- llamo a la función bgadj() por primera vez al terminar de cargar la página -->
    bgadj();
    <!-- vuelvo a llamar a la función  bgadj() al redimensionar la ventana -->
    window.onresize = function() {
        bgadj();
 
    }
  
 
}
  </script>
    </head>
    <body>
        
        
        <img id="bg" src="Azul.jpg"  alt="background" /> 
     
        <div class="page-container"  style="text-align:center;">

  <h1 align="CENTER"><FONT FACE="arial" SIZE=30 COLOR="WHITE">Bienvenido administrador</FONT></h1>
           <%@page import="java.sql.*" %>
<%

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

%>
             
          
          
          <form action="Modificar" method="post">
          <table>
              <tr> <th> <h1><FONT FACE="arial" SIZE=5 COLOR="WHITE">Cambiar estado del tramite a</FONT></th>
              <th>     
              </h1> <select id="campotexto" name="estate">
                         <option value="En proceso">En proceso</option>
                         <option value="Aceptado">Aceptado</option>
                         <option value="Terminado">Terminado</option>
          
                        </select> 
              </th> 
          <th> <h1><FONT FACE="arial" SIZE=5 COLOR="WHITE">Al alumno con el codigo</FONT></h1></th>
            
          <th>  <input  min="0" max="0" id="codigo" type="number" name="codigo"  class="password" placeholder="Codigo" require="llenar campo">
          
          
          <input type="submit" value="Cambiar estado" name="Cestado" />
         
         
          </th>
          <tr>
              <td>
                <h1><FONT FACE="arial" SIZE=5 COLOR="WHITE">Eliminar alumno con codigo</FONT></h1>  
              </td>   
              <td><input min="0" max="0" id="elimina" type="number" name="elimina"  class="elimina" placeholder="Codigo" require="llenar campo">
              <input type="submit" value="Eliminar" name="Eliminar" />
              </td>
          </tr>
          
          
                 
              
              
          </table>
            
         </form>
           
          </div>
<form action="Busqueda.jsp">
 <input type="submit" value="Busquedas de informacion" name="Cerrar" />
 
</form>

<br> <br>

<form action="index.html">
 <input type="submit" value="Salir" name="Cerrar" />
 
</form>
    </body>
</html>