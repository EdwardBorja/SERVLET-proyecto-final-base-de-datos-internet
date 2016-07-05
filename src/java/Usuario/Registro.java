/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Usuario;

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

/**
 *
 * @author edward
 */
@WebServlet(name = "Registro", urlPatterns = {"/Registro"})
public class Registro extends HttpServlet {
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
            out.println("<title>Servlet Registro</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Registro at " + request.getContextPath() + "</h1>");
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
      
       
         Statement stmt=null;
       
         String Codigo,Contraseña,Nombre,Correo,Telefono,Modalidad,Ingreso,Egreso,Promedio,Archivo,Estado,Tipo,Registro;
         
         Codigo=request.getParameter("codigo");
         Contraseña=request.getParameter("userpass");
         Nombre=request.getParameter("nombre");
       
         Correo=request.getParameter("correo");
         Telefono=request.getParameter("telefono");
         Modalidad=request.getParameter("modalidad");
         Ingreso=request.getParameter("ingreso");
         Egreso=request.getParameter("egreso");
         Promedio=request.getParameter("promedio");
         Archivo=("archivo");
         Registro=request.getParameter("Registro");
         Tipo=("usuario");    
         Estado=("Pendiente");  
       
       
       //  if (Codigo.equals("")||Contraseña.equals("")||Nombre.equals("")||Correo.equals("")||
         //    Telefono.equals("")||Modalidad.equals("")||Ingreso.equals("")||Egreso.equals("")||Promedio.equals("")) {
             // out.println("Hay campos vacios");
             
        
   //}

// response.sendRedirect("Registrarse.html");
        
           
       
         
         try {
            

            stmt = cn.createStatement();
          
            //Aqui verifica si existe
             ResultSet rs; rs = stmt.executeQuery("SELECT codigo_alumno FROM cuentas WHERE (codigo_alumno ='" + Codigo + "')");
           
            if(!rs.next()){
                
               
                      
stmt.executeUpdate("INSERT INTO alumno VALUES ( '" + Codigo + "','" + Contraseña + "','" + Nombre + "','" + Correo + "','" + Telefono + "','" + Modalidad + "','" + Ingreso + "','" + Egreso + "','" + Promedio + "'"
        + ",'" + Archivo + "','" + Estado + "','" + Registro + "')");
          

stmt.executeUpdate("INSERT INTO cuentas VALUES ( '" + Codigo + "','" + Contraseña + "','" + Tipo + "')");

response.sendRedirect("index.html");
             
             
            }else{// out.println("Ya existe");
              
                response.sendRedirect("Registrarse.html");
            }
            
            
        }
        catch( SQLException e) {
            e.printStackTrace();
            
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
