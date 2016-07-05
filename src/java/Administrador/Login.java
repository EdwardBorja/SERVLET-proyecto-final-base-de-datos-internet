package Administrador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.HeadlessException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author edward
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    Administrador.Conector cc = new Administrador.Conector();
         Connection cn = cc.conexion();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("</head>");
            out.println("<body background=Azul.jpg>");
           
          
         out.println("</body>");
         out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       PrintWriter out = response.getWriter();
       String Codigo,Contraseña;
       Codigo=request.getParameter("code");
       Contraseña=request.getParameter("userpass"); 
     

Statement stmt;
ResultSet rs;


try{ 

stmt = cn.createStatement();
rs = stmt.executeQuery("SELECT codigo_alumno,contra,tipo FROM cuentas WHERE (codigo_alumno ='" + Codigo + "' and contra='" + Contraseña +"')");


if(rs!=null){
    
if(rs.next()){
    
   // String names = rs.getString("nombre");
   // String tipo = rs.getString("Tipo");
 
    switch (rs.getString("tipo")) {
        case "administrador":
            
           
       
            response.sendRedirect("MenuAdmin.jsp");
            break;
            
    
            
       
case "usuario":

      out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("</head>");
            out.println("<body background=white>");
           
          
       
out.println("<h1 align=CENTER><FONT FACE=arial SIZE=30 COLOR=BLACK>Bienvenido Usuario " + Codigo + "</FONT></h1>");


rs = stmt.executeQuery("select codigo_alumno,nombre,registro,modalidad,estado from alumno WHERE (`codigo_alumno`='" + Codigo + "')");

out.println("<table border=1 align=center bgcolor=white>");

out.println("<tr><th>Codigo</th><th>Nombre</th><th>Modalidad</th><th>Registro del tramite</th><th>Estado del tramite</th></tr>");

while (rs.next()) {

out.println("<tr>");
        

    out.println("<td>");    

        out.println(rs.getString("codigo_alumno"));

        out.println("</td><td>");

        out.println(rs.getString("nombre"));

        out.println("</td><td>");

        out.println(rs.getString("modalidad"));
        
        out.println("</td><td>");

        out.println(rs.getString("registro"));
        
        out.println("</td><td>");

        out.println(rs.getString("estado"));

    out.println("</td>");

out.println("</tr>");

}

out.println("</table>");
            out.println("<form action=index.html>");
            out.println("<input type=submit value=Salir name=Cerrar/>");
            out.println("</form>");
          out.println("</body>");
         out.println("</html>");
            break; 
            
        
            
    } 
    

}else{
    
    out.println("Usuario o contraseña invalidas");
    //response.sendRedirect("index.html");
 
}

}

rs.close();


       }catch(SQLException | HeadlessException ex){
       }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
