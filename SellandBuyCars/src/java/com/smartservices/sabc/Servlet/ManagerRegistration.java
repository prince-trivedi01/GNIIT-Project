/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.Servlet;

import com.smartservices.sabc.DAO.ShowroomManDAO;
import com.smartservices.sabc.DAOImpl.ShowroomManDAOImpl;
import com.smartservices.sabc.entities.Showroomman;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Prince
 */
@WebServlet(name = "ManagerRegistration", urlPatterns = {"/manregister"})
public class ManagerRegistration extends HttpServlet {

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
            int srmid;
            String fname;
            String lname;
            int mob;
            String email;
            String dateofbirth;
            String username;
            String password;
            srmid = Integer.parseInt(request.getParameter("srm_Id"));
            fname = request.getParameter("fname");
            lname = request.getParameter("lname");
           
            mob = Integer.parseInt(request.getParameter("mob"));
            email = request.getParameter("email");
            dateofbirth = request.getParameter("dateofbirth");
            username = request.getParameter("username");
            password = request.getParameter("password");
           ShowroomManDAO ShowroommanDAO = new ShowroomManDAOImpl();
            int count = ShowroommanDAO.addShowroomman(new Showroomman(srmid,fname,lname,mob,dateofbirth,email,username,password));
             RequestDispatcher rd = null;
            if(count>0){
               rd = request.getRequestDispatcher("homepage.jsp");
            }
            else{
                rd = request.getRequestDispatcher("regitrationIndex.jsp");
            }
            rd.forward(request,response);
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
