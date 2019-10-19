/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umg.logic;

import edu.umg.dao.ShopopingCart;
import edu.umg.dao.ShoppingProducto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author C-Lo 12
 */
public class ShoppingServlet extends HttpServlet {
    private final String NOMBRE_CARRETILLA ="cart";
    
    private void addProducto(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //1. recibir los datos del cliente
        String codigo = request.getParameter("codigo");
        String nombre = request.getParameter("nombre");
        double precio = Double.parseDouble(request.getParameter("precio"));
        int cantidad = Integer.parseInt(request.getParameter("cantidad"));
        
        //2. crear objeto ShoppingProducto
        ShoppingProducto shProducto = new ShoppingProducto(codigo,nombre,
                precio,cantidad);
        
        //3. Agregarlo al ShoppingCart
        HttpSession session = request.getSession(true);
        ShopopingCart cart = (ShopopingCart)session.getAttribute(NOMBRE_CARRETILLA);
        if (cart == null)
            cart = new ShopopingCart();
        cart.add(shProducto);
        
        //4. Persistir objeto ShoppingCart
        session.setAttribute(NOMBRE_CARRETILLA, cart);
        
        //5. Pintar html respuesta
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ShoppingServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>El producto fue agregado</h1>");
            out.println("<a href='Carretilla.html'>Regresar</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    private void showCarretilla(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //1. obtener objeto ShoppingCart de variable de sesion
        HttpSession session = request.getSession(true);
        ShopopingCart cart = (ShopopingCart)session.getAttribute(NOMBRE_CARRETILLA);

        //2. recorrer el arreglo para pintar la carretilla de productos
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ShoppingServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Productos de la Carretilla</h1>");
            out.println("<table border='1px'>"
                    + "<tr><td>Codigo</td><td>Nombre</td><td>Precio</td><td>Cantidad</td></tr>");
            for(ShoppingProducto producto : cart.getShoppingProducto()){
                out.println("<tr><td>"+producto.getProducto().getCodigo()+"</td>"
                        +"<td>"+producto.getProducto().getNombre()+"</td>"
                        +"<td>"+producto.getProducto().getPrecio()+"</td>"
                        +"<td>"+producto.getCantidad()+"</td></tr>");
            }
            out.println("</table>");
            out.println("<a href='Carretilla.html'>Regresar</a>");
            out.println("</body>");
            out.println("</html>");
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
        String opcion = request.getParameter("opcion");
        if(opcion.equals("add"))
            addProducto(request,response);
        else{
            //showCarretilla(request, response);
            RequestDispatcher rd=request.getRequestDispatcher("ShowCart.jsp");
            rd.forward(request,response);
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
