/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ram.controller;

import com.ram.bean.StudentBean;
import com.ram.dao.StudentDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class AddController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddController</title>");            
            out.println("</head>");
            out.println("<body>");
            int sid=Integer.parseInt(request.getParameter("sid"));
            String name=request.getParameter("name");
            String enroll=request.getParameter("enroll");
            int p=Integer.parseInt(request.getParameter("p"));
            int m=Integer.parseInt(request.getParameter("m"));
            int c=Integer.parseInt(request.getParameter("c"));
            int h=Integer.parseInt(request.getParameter("h"));
            int e=Integer.parseInt(request.getParameter("e"));
            out.println("<h1> " + sid + "</h1>");
            out.println("<h1> " + name+ "</h1>");
            out.println("<h1> " + enroll + "</h1>");
            out.println("<h1> " + p + "</h1>");
            out.println("<h1> " + c + "</h1>");
            out.println("<h1> " +m+ "</h1>");
            out.println("<h1> " + h + "</h1>");
            out.println("<h1> " + e + "</h1>");
            //step3: Create Object of StudentBean
            StudentBean sb=new StudentBean();
            //step4: Set all data into studentBean object
            sb.setC(c);
            sb.setE(e);
            sb.setEnroll(enroll);
            sb.setH(h);
            sb.setName(name);
            sb.setM(m);
            sb.setP(p);
            sb.setSid(sid);
            
            //Step5: Create an Object of StudentDAO
            StudentDAO sd=new StudentDAO();
            int r=sd.addStudent(sb);
            if(r>0){
                out.println("Student Added Success");
                response.sendRedirect("ViewStudent");
            }else{
                System.out.println("Student Not Added");
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
