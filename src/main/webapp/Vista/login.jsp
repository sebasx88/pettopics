<%-- 
    Document   : login
    Created on : 17 abr 2023, 20:51:35
    Author     : dadim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro</h1>
        <form>
            <table
                <tr><td>Nombre Usuario </td><td><input type="textt" name="usuario"></td></tr>
                <tr><td>Password </td><td><input type="password" name="password"></td></tr>
                <tr><td>Email</td><td><input type="text" name="email"></td></tr>
                <tr><td>Telefono </td><td><input type="number" name="telefono"></td></tr>
                <tr><td></td><td><input type="submit" name="registro"></td></tr>
            </table>
        </form>
    </body>
</html>
