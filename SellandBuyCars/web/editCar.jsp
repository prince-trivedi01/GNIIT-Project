<%-- 
    Document   : editCar
    Created on : Mar 26, 2018, 12:32:25 PM
    Author     : Dell
--%>


<%@page import="com.smartservices.sabc.DAOImpl.CarDAOImpl"%>
<%@page import="com.smartservices.sabc.entities.Carinfo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<p>
    
<form action="editcar.do" method="get">
<!--            Car ID :<input type="text" name="carid" />
            <br/>-->
<%
Carinfo car = new CarDAOImpl().getCarByID(Integer.parseInt(request.getParameter("carid")));
request.setAttribute("Carinfo",car);
%>
<input type="hidden" name="carid" value="${car.carId}" />
            Car Model :<input type="text" name="model" value="${car.Model}" />
            <br/>
            Name :<input type="text" name="name" value="${car.Name}" />
            <br/>
            Type :<input type="text" name="type" value="${car.type}"/>
            <br/>
            Amount :<input type="text" name="amount" value="${car.amount}"/>
            <br/>
            <input type="submit" name="action" value="Save Changes" />
            <input type="submit" name="action"  value="Delete" />
        </form>
   </p>
<%@include file="footer.jsp" %>