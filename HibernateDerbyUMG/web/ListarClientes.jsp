<%-- 
    Document   : ListarClientes
    Created on : 5/10/2019, 08:40:02 AM
    Author     : C-Lo 12
--%>

<%@page import="java.util.List"%>
<%@page import="edu.umg.ventas.dao.Customer"%>
<%@page import="edu.umg.venta.logic.AccessHelp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado Ejemplo</h1>
        <table>
            <tr><td>ID</td><td>NOMBRE</td><td>CIUDAD</td><td>TELEFONO</td></tr>
            <%
                AccessHelp helper = new AccessHelp();
                List<Customer> listCustomer = helper.getClientes();
                for(Customer c : listCustomer){
            %>
            <tr><td><%=c.getCustomerId()%></td>
                <td><%=c.getName()%></td><td><%=c.getCity()%></td>
                <td><%=c.getPhone()%></td>
            </tr>
            <%
                }
            %>
            
        </table>
            <a href='index.html'>Agregar Cliente</a>
    </body>
</html>
