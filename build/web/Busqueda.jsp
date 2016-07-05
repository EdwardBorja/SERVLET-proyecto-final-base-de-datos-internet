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

#tabla{
    
   
  border-collapse: separate;
  border-spacing: 20px 5px;

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

  <h1 align="CENTER"><FONT FACE="arial" SIZE=30 COLOR="WHITE">Consultas de informacion</FONT></h1>
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
             
          
          
          <form action="BusquedaUsuario" method="post">
          
          
              <table id="tabla" >
             
            <tr> 
                <td>  
                    <h1><FONT FACE="arial" SIZE=5 COLOR="WHITE">Buscar por modalidad :<br> 
                 <select required id="campotexto" name="modalidad">
                <option> Selecciona la modalidad </option>
                <option value="tesis">Tesis</option>
                <option value="tesina">Tesina</option>
                <option value="informe">Informe</option>
                <option value="excelencia">Exelencia</option>
                <option value="promedio">Por promedio</option>

                 </select> 
                   <input type="submit" value="Buscar" name="buscamodo" /></font></h1>     
              </FONT></h1>   
                   
                </td>
              
              <td>
                  
                  <h1><FONT FACE="arial" SIZE=5 COLOR="WHITE">Promedio de egreso : <br> <input id="campotexto"  min="0" max="0" type="number" name="promedio"  class="promedio"  > <input type="submit" value="Buscar" name="buscapromedio" /></font></h1>
              </td>
              
               <td>
                  
                   <h1><FONT FACE="arial" SIZE=5 COLOR="WHITE">Buscar por nombre :<br> <input id="campotexto" type="text" name="nombre"  class="promedio"  > <input type="submit" value="Buscar" name="buscanombre" /></font></h1>
              </td>
              
              <td>  
                    <h1><FONT FACE="arial" SIZE=5 COLOR="WHITE">Buscar por estado del tramite :<br> 
                 <select id="campotexto" name="tramite">
                <option> Selecciona el estado </option>
                <option value="En proceso">En proceso</option>
                <option value="Aceptado">Aceptado</option>
                <option value="Terminado">Terminado</option>
                <option value="Pendiente">Pendiente</option>

                 </select> 
                   <input type="submit" value="Buscar" name="buscatramite" /></font></h1>     
              </FONT></h1>
                   
                </td>
              </tr>
            
              <tr>
                  <td>
                   <h1><FONT FACE="arial" SIZE=5 COLOR="WHITE">Buscar por Codigo :<br> <input id="campotexto" type="number"  min="0" max="6" name="codigo"  class="codigo"  > <input type="submit" value="Buscar" name="buscacodigo" /></font></h1>

                  </td>   
                  
                  
              </tr>
           

             
          
          
         
                 
              
          </table>
            
         </form>
           
          </div>


<form action="MenuAdmin.jsp">
 <input type="submit" value="Regresar al menu" name="Cerrar" />
 
</form>
<br><br>
<form action="index.html">
 <input type="submit" value="Salir" name="Cerrar" />
 
</form>
    </body>
</html>