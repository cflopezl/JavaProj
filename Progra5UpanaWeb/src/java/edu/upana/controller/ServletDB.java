/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upana.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author C-Lo 12
 */
public class ServletDB extends HttpServlet {
    Connection conn;

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        try {
            //1. cargar la clase del driver
            Class.forName("org.apache.derby.jdbc.ClientDriver"); 
            //2. crear la conexión
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
        } catch (Exception e) {
            System.out.println("Error db "+e.getMessage());
        }
   }

    @Override
    public void destroy() {
        super.destroy(); //To change body of generated methods, choose Tools | Templates.
        try {
            conn.close();
        } catch (Exception e) {
        }
        
    }
     
    
        
    
    
    
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
            out.println("<title>Servlet ServletDB</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Listado de Clientes</h1>");
            try {
             //3. crear objeto statement
            Statement st = conn.createStatement();
            //4. mostrar todos los registros de la tabla Customer
            String query = "SELECT * FROM customer";
            ResultSet rs = st.executeQuery(query);
            int i=1;
            while(rs.next()){
                out.println("<h3>"+(i++)+". ID="+rs.getInt(1)+", NOMBRE="+rs.getString("NAME")+", CIUDAD="+rs.getString("CITY")+"</h3>");
            }
        } catch (Exception e) {
            System.out.println("error db "+e.getMessage());
        }
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
        processRequest(request, response);
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
