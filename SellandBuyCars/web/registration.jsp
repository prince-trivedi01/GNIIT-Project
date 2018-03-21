



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
         cust.addCustomer() ;
         
        }
        catch(Exception e)
        {
            out.println("Exception occured");
        }
        %>
        
    </body>
</html>
