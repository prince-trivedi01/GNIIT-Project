<%-- 
    Document   : header
    Created on : 18 Mar, 2018, 5:43:58 PM
    Author     : Prince
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
  <title>header</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="homepage.jsp">Sell&Buy Cars</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Cars <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Buy Cars</a></li>
          <li><a href="#">Sell Cars</a></li>
          <li><a href="#">TestDrive Cars</a></li>
        </ul>
      </li>
      <li><a href="#">About Us</a></li>
      <li><a href="contact.jsp">Contact</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
        <li><a href="registration.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
  


</body>
</html>
