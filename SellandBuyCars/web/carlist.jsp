<%-- 
    Document   : carlist
    Created on : Mar 26, 2018, 11:35:29 AM
    Author     : Dell
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<h2>List of Cars</h2>
<table border="1">
    <thead >
    <th>Car id</th>
    <th>Model</th>
    <th>Name</th>
    <th>Type</th>
    <th>Amount</th>
    </thead>
    <tbody>
        <%--<c:if test="not employeeList equals  null" var="emp">--%>
        <c:forEach  var="car" items="${carList}">
        <tr>
            <td><c:out value="${car.carId}"/></td>
            <td><c:out value="${car.Model}"/></td>
            <td><c:out value="${car.Name}"/></td>
            <td><c:out value="${car.Type}"/></td>
            <td><c:out value="${car.Amount}"/></td>
            <td>Details</td>
            <td>Edit</td>
            <td>Delete</td>
            
        </tr>
        </c:forEach>
        <%--</c:if>--%>
        <c:if test="carList equals  null" var="car">
            <%out.println("No record");%>
        </c:if>
    </tbody>
    
</table>
   
<%@include file="footer.jsp" %>

