<%-- 
    Document   : ShowCart
    Created on : 19/10/2019, 12:06:31 PM
    Author     : C-Lo 12
--%>

<%@page import="edu.umg.dao.ShoppingProducto"%>
<%@page import="edu.umg.dao.ShopopingCart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
            ShopopingCart carretilla;
        %>
            <table border="1" cellspacing="0">
            <tr>
                <td>CODIGO</td>
                <td>NOMBRE</td>
                <td>PRECIO</td>
                <td>CANTIDAD</td>
             </tr>
             <%
                 carretilla=(ShopopingCart)session.getAttribute("cart");
                 for(ShoppingProducto p : carretilla.getShoppingProducto()){
             %>
             <tr>
                <td><%=p.getProducto().getCodigo()%></td>
                <td><%=p.getProducto().getNombre()%></td>
                <td><%=p.getProducto().getPrecio()%></td>
                <td><%=p.getCantidad()%></td>
             </tr>
             <%
                 }
             %>
            </table>
            <a href='Carretilla.html'>Regresar</a>
    </body>
</html>
