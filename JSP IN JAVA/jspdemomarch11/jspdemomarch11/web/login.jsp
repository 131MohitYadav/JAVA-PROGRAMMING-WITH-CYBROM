<%-- 
    Document   : login
    Created on : 12 Mar, 2025, 8:38:21 PM
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
        <form action="logincontrol.jsp">
            <table  width="60%">
               
                 <tr>
                    <td>USERNAME: </td>
                    <td><input type="text" name="un"></td>
                </tr>
                 <tr>
                    <td>PASSWORD: </td>
                    <td><input type="password" name="ps"></td>
                </tr>
                
                 <tr>
                     <td>&nbsp;</td>
                     <td><input type="submit" value="Login"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
