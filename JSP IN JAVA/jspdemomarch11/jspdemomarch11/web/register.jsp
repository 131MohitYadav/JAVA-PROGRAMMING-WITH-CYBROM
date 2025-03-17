<%-- 
    Document   : register
    Created on : 12 Mar, 2025, 8:28:26 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Registration Form</title>
    </head>
    <body>
       <form action="saveuser.jsp">
            <table  width="60%">
                <tr>
                    <td>UID: </td>
                    <td><input type="text" name="uid"></td>
                </tr>
                 <tr>
                    <td>NAME: </td>
                    <td><input type="text" name="name"></td>
                </tr>
                 <tr>
                    <td>USERNAME: </td>
                    <td><input type="text" name="un"></td>
                </tr>
                 <tr>
                    <td>Password: </td>
                    <td><input type="password" name="ps"></td>
                </tr>
                 <tr>
                    <td>Email: </td>
                    <td><input type="text" name="email"></td>
                </tr>
                 <tr>
                    <td>Mobile: </td>
                    <td><input type="text" name="mobile"></td>
                </tr>
                 
                 <tr>
                     <td>&nbsp;</td>
                     <td><input type="submit" value="Register "></td>
                </tr>
            </table>
        </form>
    </body>
</html>
