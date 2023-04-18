<%-- 
    Document   : index
    Created on : 17 abr 2023, 10:48:43
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
        <div class="container">
        <h1 align="center" class="display-1">petTopics</h1>
        <img src="img/petTopics.png" class="rounded mx-auto d-block" alt="..."><br>
            <a href="ServletControlador?accion=listar">Listar animales</a><br>
            <a href="ServletControlador?accion=ingresar">Ingresar</a>
        </div>
    </body>
</html>
