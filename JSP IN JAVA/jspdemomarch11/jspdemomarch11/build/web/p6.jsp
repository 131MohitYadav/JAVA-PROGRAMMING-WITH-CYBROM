<%-- 
    Document   : p6
    Created on : 11 Mar, 2025, 8:33:38 PM
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
        <%
        int num1=Integer.parseInt(request.getParameter("n1"));
        int num2=Integer.parseInt(request.getParameter("n2"));
        
        int num3=num1+num2;
        
        %>
        <h1> Addition  : <%=num3 %></h1>
    </body>
</html>
