/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.Servlet;

import com.smartservices.sabc.DAO.CarDAO;
import com.smartservices.sabc.DAOImpl.CarDAOImpl;
import com.smartservices.sabc.entities.Carinfo;
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
 * @author Dell
 */
@WebServlet(name = "editCarServlet", urlPatterns = {"/editCarServlet"})
public class editCar extends HttpServlet {

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
             
             int carid;
           
            String action = request.getParameter("action");
            
            carid = Integer.parseInt(request.getParameter("carid"));
            CarDAO CarDAO = new CarDAOImpl();
            int count = 0;
            if(action.equals("Save Changes")){
               String Model;
               String Name;
               String Type;
               int Amount;
               Model = request.getParameter("model");
               Name = request.getParameter("name");
               Type = request.getParameter("type");
               Amount=Integer.parseInt(request.getParameter("amount"));
                
                count = CarDAO.updateCar(carid,new Carinfo(Model,Name,Type,Amount));
                }
            else if(action.equals("Delete")){
                count = CarDAO.deleteCar(carid);
            }
             RequestDispatcher rd = null;
            if(count>0){
               rd = request.getRequestDispatcher("carlist.view");
            }
            else{
                rd = request.getRequestDispatcher("editCar.jsp?carid="+carid);
            }
            rd.include(request,response);
        }
    }
        }
    

   
