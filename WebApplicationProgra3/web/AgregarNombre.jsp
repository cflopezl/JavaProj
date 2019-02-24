<%-- 
    Document   : AgregarNombre
    Created on : 23/02/2019, 05:24:06 PM
    Author     : C-Lo 12
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="IngresoDatos">
            <input type="text" id="nombre" name="nombre" /><br />
            <input type="submit"  value="Agregar Nombre" />
        </form>
    </body>
    
        <script type="text/javascript">
            document.getElementById("nombre").focus();  
        </script>
</html>
