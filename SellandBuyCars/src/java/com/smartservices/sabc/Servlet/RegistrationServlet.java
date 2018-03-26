/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.Servlet;

import com.smartservices.sabc.DAO.CustomerDAO;
import com.smartservices.sabc.DAOImpl.CustomerDAOImpl;
import com.smartservices.sabc.entities.Custinfo;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "RegistrationServlet", urlPatterns = {"/register"})
public class RegistrationServlet extends HttpServlet {

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
            int custid;
            String fname;
            String lname;
            int mob;
            String email;
            String addr;
            String username;
            String password;
            custid = Integer.parseInt(request.getParameter("custid"));
            fname = request.getParameter("fname");
            lname = request.getParameter("lname");
            addr=request.getParameter("addr");
            mob = Integer.parseInt(request.getParameter("mob"));
            email = request.getParameter("email");
            username = request.getParameter("username");
            password = request.getParameter("password");
            CustomerDAO customerDAO = new CustomerDAOImpl();
            int count = customerDAO.addCustomer(new Custinfo(custid,fname,lname,addr,mob,email,username,password));
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
    }

   
