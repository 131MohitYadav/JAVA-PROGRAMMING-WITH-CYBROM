<%-- 
    Document   : p7
    Created on : 11 Mar, 2025, 8:40:29 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
      
        int sqr(int x){
            return x*x;
        }
        %>
        <h1>Square : <%=sqr(6) %></h1>
    </body>
</html>
