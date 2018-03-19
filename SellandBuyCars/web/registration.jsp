<%-- 
    Document   : registration
    Created on : Mar 18, 2018, 10:34:58 PM
    Author     : Dell
--%>

<%@page import="com.smartservices.sabc.entities.Custinfo"%>
<%@page import="com.smartservices.sabc.DAOImpl.CustomerDAOImpl"%>
<%@page import="com.smartservices.sabc.DAO.CustomerDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <%@page import="java.sql.*" %>
 <%@include file="CustomerDAO.java" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>registration</title>
    </head>
    <body>
        <% 
        String firstname=request.getParameter("fname");
        String lastname=request.getParameter("lname");
       
        String address=request.getParameter("address");
        int mob=Integer.parseInt(request.getParameter("phone"));
        String email=request.getParameter("email");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        try
        {
         CustomerDAO cust = new CustomerDAOImpl() ;
         cust.addCustomer(Custinfo custinfos) ;
         
        }
        catch(Exception e)
        {
            out.println("Exception occured");
        }
        %>
        
    </body>
</html>
