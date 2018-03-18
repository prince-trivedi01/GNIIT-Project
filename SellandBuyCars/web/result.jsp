<%-- 
    Document   : result
    Created on : 18 Mar, 2018, 5:53:21 PM
    Author     : Prince
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String s1=request.getParameter("username");
            String s2=request.getParameter("password");
            if((s1.equals("admin"))&&(s2.equals("admin")))
            {
                out.println("Access Granted");
            }
            else
            {
                out.println("Access Denied");
            }
                    
                    %>
    </body>
</html>
