<%-- 
    Document   : listar.jsp
    Created on : 17 abr 2023, 22:08:42
    Author     : dadim
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.animales"%>
<%@page import="Dao.animalesDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <title>Animales</title>
    </head>
    <body>
        <h1 align="center" class="display-1" >Animales</h1>
        <div class="container">
            <table class="table">
            
               <%
                animalesDAO an = new animalesDAO();                
                List<animales> list = an.listar();
                System.out.println("list " + list.toString());
                Iterator<animales> iter = list.iterator();
                
                %>
                
                 <thead>
                        <tr>
                         <%  
                                animales ani = null;
                                while(iter.hasNext()){
                                    ani= iter.next();
                                    out.println("<th scope='row'><img src='"+ani.getImg()+"'/></th>");
                                    
                                }
                        %>
                        </tr>
                 </thead>
                 <tbody>
                    <tr>
                        <%  
                                animales ani2 = null;
                                Iterator<animales> iter2 = list.iterator();
                                while(iter2.hasNext()){
                                    ani2= iter2.next();
                                    out.println("<th class='text-center' scope='row'>"+ani2.getTipoAnimal()+"</th>");
                                }
                        %>                        
                    </tr>
                </tbody>            
        </table>
        </div>
    </body>
</html>
