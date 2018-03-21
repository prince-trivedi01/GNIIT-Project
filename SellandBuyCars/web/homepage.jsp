<%-- 
    Document   : homepage
    Created on : 19 Mar, 2018, 2:57:31 PM
    Author     : Prince
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>

<!DOCTYPE html>
<html>
   <head>
  <title>Homepage</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
   
  .carousel-inner img {
      width: 100%; /* Set width to 100% */
      margin: auto;
      min-height:200px;
  }

  /* Hide the carousel text when the screen is less than 600 pixels wide */
  @media (max-width: 600px) {
    .carousel-caption {
      display: none; 
    }
  }
  </style>
</head>
<body>



<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
          <img class="img-responsive" src="img/car.jpg" alt="car" >
        <div class="carousel-caption">
          <h3>BUY</h3>
          
        </div>      
      </div>

      <div class="item">
          <img class="img-responsive" src="img/car2.jpg" alt="car2" >
        <div class="carousel-caption">
          <h3>SELL</h3>
         
        </div>      
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>
  
<div class="container text-center">    
  <h3>What We Do</h3><br>
  <div class="row">
    <div class="col-sm-4">
        <img src="img/polo.jpg" class="img-responsive" style="width:100%" alt="swift">
      <p>POLO</p>
    </div>
    <div class="col-sm-4"> 
        <img src="img/tiago.jpg" class="img-responsive" style="width:100%" alt="second">
      <p>TATA TIAGO</p>    
    </div>
    <div class="col-sm-4">
      <div class="well">
       <p>Some text..</p>
      </div>
      <div class="well">
       <p>Some text..</p>
      </div>
    </div>
  </div>
</div><br>


</body>
</html>
<%@include file="footer.jsp" %>
