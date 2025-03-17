<%-- 
    Document   : p2
    Created on : 11 Mar, 2025, 8:14:39 PM
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
        //step1: Fetch data from the request
        String name=request.getParameter("name");
        //step2: print result
        out.println("Welcome : "+name);
        
        %>
 
    </body>
</html>
