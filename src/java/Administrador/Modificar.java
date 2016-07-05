/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Administrador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
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
@WebServlet(name = "Modificar", urlPatterns = {"/Modificar"})
public class Modificar extends HttpServlet {
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
            out.println("<title>Servlet Modificar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Modificar at " + request.getContextPath() + "</h1>");
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
       
         String Codigo,Estado,Elimina;
         
         Codigo=request.getParameter("codigo");
         Estado=request.getParameter("estate");
         Elimina=request.getParameter("elimina");
          
         if(Codigo.equals("")){
         
             try {
            stmt = cn.createStatement();
          
             stmt.executeUpdate("DELETE  from alumno  WHERE( `codigo_alumno`='"+Elimina+ "')");
             response.sendRedirect("MenuAdmin.jsp");
     
        }
        catch( SQLException e ) {
            e.printStackTrace();
        //    out.println("No se eliminó,ingresa el numero de cliente");
     
        }
             
             
         }else{
         
         try {
            stmt = cn.createStatement();
          
             stmt.executeUpdate("UPDATE alumno set `estado`='"+Estado+"' WHERE( `codigo_alumno`='"+Codigo+ "')");
             response.sendRedirect("MenuAdmin.jsp");
     
        }
        catch( SQLException e ) {
            e.printStackTrace();
        //    out.println("No se eliminó,ingresa el numero de cliente");
     
        }
         
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
