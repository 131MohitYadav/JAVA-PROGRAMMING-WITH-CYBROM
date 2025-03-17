<%-- 
    Document   : save
    Created on : 12 Mar, 2025, 7:46:43 PM
    Author     : Admin
--%>

<%@page import="com.ram.dao.StudentDAO"%>
<%@page import="com.ram.bean.StudentBean"%>
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
        int sid=Integer.parseInt(request.getParameter("sid"));
        String name=request.getParameter("name");
        String enroll=request.getParameter("enroll");
        int  p=Integer.parseInt(request.getParameter("p"));
        int  c=Integer.parseInt(request.getParameter("c"));
        int  m=Integer.parseInt(request.getParameter("m"));
        int  h=Integer.parseInt(request.getParameter("h"));
        int  e=Integer.parseInt(request.getParameter("e"));
        //step2: Create object of StudentBean
        StudentBean sb=new StudentBean();
        //step3: set data into bean
        sb.setC(c);
        sb.setE(e);
        sb.setEnroll(enroll);
        sb.setH(h);
        sb.setM(m);
        sb.setName(name);
        sb.setSid(sid);
        sb.setP(p);
        //step4: Create object of StudentDAO class
        StudentDAO sd=new StudentDAO();
        int r=sd.addStudent(sb);
        if(r>0){
            out.println("Student Added Success");
            response.sendRedirect("viewstudent.jsp");
        }else{
            out.println("<h1><font color='red'>Student Not Added Please Try again....</h1>");
            RequestDispatcher rd=request.getRequestDispatcher("addstudent.jsp");
            rd.include(request, response);
        }
        %>
        <%--
        <h1>SID : <%=sid %></h1>
        <h1>NAME: <%=name %></h1>
        <h1>ENROLL: <%=enroll %></h1>
        <h1>P : <%=p %></h1>
        <h1>C : <%=c %></h1>
        <h1>M : <%=m %></h1>
        <h1>H : <%=h %></h1>
        <h1>E : <%=e %></h1>
        --%>
    </body>
</html>
