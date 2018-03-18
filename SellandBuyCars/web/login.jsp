<%-- 
    Document   : login
    Created on : 18 Mar, 2018, 5:48:02 PM
    Author     : Prince
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="result.jsp">
            
            <b> Username : </b>
            <input type="text" name="username" value="" size="10" />
            <br>
            <b> Password : </b>
            <input type="password" name="password" value="" size="10" />    
            <br>
            <input type="submit" value="login"  />
            
            
            
        </form>
        
        
        
        
    </body>
</html>
<%@include file="footer.jsp"%>