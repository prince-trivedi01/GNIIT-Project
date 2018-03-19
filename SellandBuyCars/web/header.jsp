<%-- 
    Document   : header
    Created on : 18 Mar, 2018, 5:43:58 PM
    Author     : Prince
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Header</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
         <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
         <style>
             
            
body {
  height: 100%;
  /* The html and body elements cannot have any padding or margin. */
}

/* Wrapper for page content to push down footer */
#wrap {
  min-height: 100%;
  height: 100%;
  /* Negative indent footer by its height */
  margin: 0 auto -82px 0;
  /* Pad bottom by footer height */
  padding: 0 0 80px 0;
}



             
             
         </style>
    </head>
    <body>
      <!-- Wrap all page content here -->
      <div class="header" >
          
          <p>Sell and Buy Cars</p>
          
          
      </div>
  
  <!-- Fixed navbar -->
  <div class="navbar navbar-default navbar-fixed-top">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
           
        <a class="navbar-brand" href="homepage.jsp">Sell & Buy Cars</a>
      </div>
      <div class="collapse navbar-collapse">
        <ul class="nav navbar-nav">
          <li class="active"><a href="#">Home</a></li>
          <li><a href="#about">About</a></li>
          <li><a href="#contact">Contact</a></li>
          
         
          <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Cars <b class="caret"></b></a>
            <ul class="dropdown-menu">
              <li><a href="#">Buy Cars</a></li>
              <li><a href="#">Sell Cars</a></li>
             
            </ul>
            <li><a href="login.jsp">Login</a></li>
            <li><a href="#">Sign Up</a></li>
            
          
          
        </ul>
          
      </div>
    </div>
 
  
 


 </body>
</html>



































