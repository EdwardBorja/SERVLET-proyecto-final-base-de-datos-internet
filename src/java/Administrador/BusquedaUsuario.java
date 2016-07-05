/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Administrador;

import static java.awt.SystemColor.window;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edward
 */
@WebServlet(name = "BusquedaUsuario", urlPatterns = {"/BusquedaUsuario"})
public class BusquedaUsuario extends HttpServlet {
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
            
            out.println("<title>Servlet Busqueda</title>");            
            out.println("</head>");
            out.println("<body>");
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
 

    response.setContentType("text/html;charset=UTF-8");

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            
       
            out.println("<title>Servlet Busqueda</title>");            
            out.println("</head>");
            out.println("<body background=Azul.jpg>");
          
          
    String Modalidad= request.getParameter("modalidad");
    String promedio= request.getParameter("promedio");
    String Nombre= request.getParameter("nombre");
    String Estado= request.getParameter("tramite");
    String Codigo= request.getParameter("codigo");
    
    
  try {
       
      PreparedStatement ps2,ps3,ps4,ps5;
      String query,query2,query3,query4,query5;
      
      if(promedio.equals("")&&Nombre.equals("")&&Estado.equals("Selecciona el estado")&&Codigo.equals("")){
      out.println("<h1 align=CENTER><FONT FACE=arial SIZE=30 COLOR=WHITE>Alumnos con modalidad de titulacion por  "+Modalidad+"</FONT></h1>");

      query = "SELECT * FROM alumno where `modalidad`='"+Modalidad+"'";
      PreparedStatement ps = cn.prepareStatement(query);
      ResultSet rs1=ps.executeQuery(query);
     
       
      
           
      out.println("<TABLE Border=1 bgcolor=white style=font-size:15px ><TR>");
      out.println("<th>Codigo</th><th>Nombre</th><th>Correo</th><th>Telefono</th><th>Modalidad de titulacion</th><th>Fecha de ingreso</th><th>Fecha de egreso</th><th>promedio</th><th>Fecha de registro</th><th>Estado del tramite</th></TR>");
      while(rs1.next()){

      out.println("<TR>");
      out.println("<TD>"+rs1.getString(1)+"</TD>");
      out.println("<TD>"+rs1.getString(3)+"</TD>");
      out.println("<TD>"+rs1.getString(4)+"</TD>");
      out.println("<TD>"+rs1.getString(5)+"</TD>");
      out.println("<TD>"+rs1.getString(6)+"</TD>");
      out.println("<TD>"+rs1.getString(7)+"</TD>");
      out.println("<TD>"+rs1.getString(8)+"</TD>");
      out.println("<TD>"+rs1.getString(9)+"</TD>");
     // out.println("<TD>"+rs1.getString(10)+"</TD>");
      out.println("<TD>"+rs1.getString(12)+"</TD>");
      out.println("<TD>"+rs1.getString(11)+"</TD>");
      out.println("</TR>");
     

          }
    out.println("</TABLE></CENTER>");
    }
     if(Nombre.equals("")&&Modalidad.equals("Selecciona la modalidad")&&Estado.equals("Selecciona el estado")&&Codigo.equals("")){
     out.println("<h1 align=CENTER><FONT FACE=arial SIZE=30 COLOR=WHITE>Alumnos con promedio de egreso de  "+promedio+"</FONT></h1>");

     query2 = "SELECT * FROM alumno where `promedio`='"+promedio+"'"; 
     ps2 = cn.prepareStatement(query2);
     ResultSet rs2=ps2.executeQuery(query2);
    

            
      out.println("<TABLE Border=1 bgcolor=white style=font-size:15px ><TR>");
      out.println("<th>Codigo</th><th>Nombre</th><th>Correo</th><th>Telefono</th><th>Modalidad de titulacion</th><th>Fecha de ingreso</th><th>Fecha de egreso</th><th>promedio</th><th>Fecha de registro</th><th>Estado del tramite</th></TR>");

           while(rs2.next()){

      out.println("<TR>");
      out.println("<TD>"+rs2.getString(1)+"</TD>");
      out.println("<TD>"+rs2.getString(3)+"</TD>");
      out.println("<TD>"+rs2.getString(4)+"</TD>");
      out.println("<TD>"+rs2.getString(5)+"</TD>");
      out.println("<TD>"+rs2.getString(6)+"</TD>");
      out.println("<TD>"+rs2.getString(7)+"</TD>");
      out.println("<TD>"+rs2.getString(8)+"</TD>");
      out.println("<TD>"+rs2.getString(9)+"</TD>");
      //out.println("<TD>"+rs2.getString(10)+"</TD>");
      out.println("<TD>"+rs2.getString(12)+"</TD>");
      out.println("<TD>"+rs2.getString(11)+"</TD>");
      out.println("</TR>");
      
      
          }
           out.println("</TABLE></CENTER>");
     }
     
     
     if(promedio.equals("")&&Modalidad.equals("Selecciona la modalidad")&&Estado.equals("Selecciona el estado")&&Codigo.equals("")){
     out.println("<h1 align=CENTER><FONT FACE=arial SIZE=30 COLOR=WHITE>Alumnos </FONT></h1>");

         if (Nombre.equals("")) {
             
          response.sendRedirect("Busqueda.jsp");
         }else{
             
     query3 = "SELECT * FROM alumno where nombre like '%"+Nombre+"%' "; 
     ps3 = cn.prepareStatement(query3);
     ResultSet rs3=ps3.executeQuery(query3);
    
    out.println("<TABLE Border=1 bgcolor=white style=font-size:15px ><TR>");
    out.println("<th>Codigo</th><th>Nombre</th><th>Correo</th><th>Telefono</th><th>Modalidad de titulacion</th><th>Fecha de ingreso</th><th>Fecha de egreso</th><th>promedio</th><th>Fecha de registro</th><th>Estado del tramite</th></TR>");

      while(rs3.next()){
     

      out.println("<TR>");
      out.println("<TD>"+rs3.getString(1)+"</TD>");
      out.println("<TD>"+rs3.getString(3)+"</TD>");
      out.println("<TD>"+rs3.getString(4)+"</TD>");
      out.println("<TD>"+rs3.getString(5)+"</TD>");
      out.println("<TD>"+rs3.getString(6)+"</TD>");
      out.println("<TD>"+rs3.getString(7)+"</TD>");
      out.println("<TD>"+rs3.getString(8)+"</TD>");
      out.println("<TD>"+rs3.getString(9)+"</TD>");
     // out.println("<TD>"+rs3.getString(10)+"</TD>");
      out.println("<TD>"+rs3.getString(12)+"</TD>");
      out.println("<TD>"+rs3.getString(11)+"</TD>");
      out.println("</TR>");
      
      
          }
     out.println("</TABLE></CENTER>");
         }
         
      }
      
       if(promedio.equals("")&&Modalidad.equals("Selecciona la modalidad")&&Nombre.equals("")&&Codigo.equals("")){
     out.println("<h1 align=CENTER><FONT FACE=arial SIZE=30 COLOR=WHITE>Alumnos con estado del tramite "+Estado+"</FONT></h1>");

     query4 = "SELECT * FROM alumno where estado like '%"+Estado+"%' "; 
     ps4 = cn.prepareStatement(query4);
     ResultSet rs4=ps4.executeQuery(query4);
     
     out.println("<TABLE Border=1 bgcolor=white style=font-size:15px ><TR>");
     out.println("<tr><th>Codigo</th><th>Nombre</th><th>Correo</th><th>Telefono</th><th>Modalidad de titulacion</th><th>Fecha de ingreso</th><th>Fecha de egreso</th><th>promedio</th><th>Fecha de registro</th><th>Estado del tramite</th></TR>");

     while(rs4.next()){
            
      
      out.println("<TR>");
      out.println("<TD>"+rs4.getString(1)+"</TD>");
      out.println("<TD>"+rs4.getString(3)+"</TD>");
      out.println("<TD>"+rs4.getString(4)+"</TD>");
      out.println("<TD>"+rs4.getString(5)+"</TD>");
      out.println("<TD>"+rs4.getString(6)+"</TD>");
      out.println("<TD>"+rs4.getString(7)+"</TD>");
      out.println("<TD>"+rs4.getString(8)+"</TD>");
      out.println("<TD>"+rs4.getString(9)+"</TD>");
    //  out.println("<TD>"+rs4.getString(10)+"</TD>");
      out.println("<TD>"+rs4.getString(12)+"</TD>");
      out.println("<TD>"+rs4.getString(11)+"</TD>");
   //   out.println("<br>");
      out.println("</TR>");
      
      
          }
     out.println("</TABLE></CENTER>");
     
      }
     
       
       if(promedio.equals("")&&Modalidad.equals("Selecciona la modalidad")&&Nombre.equals("")&&Estado.equals("Selecciona el estado")){
     out.println("<h1 align=CENTER><FONT FACE=arial SIZE=30 COLOR=WHITE>Alumno con codigo "+Codigo+"</FONT></h1>");

     query5 = "SELECT * FROM alumno where codigo_alumno='"+Codigo+"' "; 
     ps5 = cn.prepareStatement(query5);
     ResultSet rs5=ps5.executeQuery(query5);
     
     out.println("<TABLE Border=1 bgcolor=white style=font-size:15px ><TR>");
     out.println("<tr><th>Codigo</th><th>Nombre</th><th>Correo</th><th>Telefono</th><th>Modalidad de titulacion</th><th>Fecha de ingreso</th><th>Fecha de egreso</th><th>promedio</th><th>Fecha de registro</th><th>Estado del tramite</th></TR>");

     while(rs5.next()){
            
      
      out.println("<TR>");
      out.println("<TD>"+rs5.getString(1)+"</TD>");
      out.println("<TD>"+rs5.getString(3)+"</TD>");
      out.println("<TD>"+rs5.getString(4)+"</TD>");
      out.println("<TD>"+rs5.getString(5)+"</TD>");
      out.println("<TD>"+rs5.getString(6)+"</TD>");
      out.println("<TD>"+rs5.getString(7)+"</TD>");
      out.println("<TD>"+rs5.getString(8)+"</TD>");
      out.println("<TD>"+rs5.getString(9)+"</TD>");
    //  out.println("<TD>"+5s4.getString(10)+"</TD>");
      out.println("<TD>"+rs5.getString(12)+"</TD>");
      out.println("<TD>"+rs5.getString(11)+"</TD>");
   //   out.println("<br>")5
      out.println("</TR>");
      
      
          }
     out.println("</TABLE></CENTER>");
     
      }
     
     
        } catch (SQLException e) {
    
        } finally {
  
      
            out.println("<form action=Busqueda.jsp>");
            out.println("<input type=submit value=Atras name=Cerrar/>");
            out.println("</form>");
            
            out.println("</body>");
            out.println("</html>");
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
