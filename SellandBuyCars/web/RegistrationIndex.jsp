<%-- 
    Document   : regitationIndex
    Created on : Mar 18, 2018, 10:21:20 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Form</title>
    </head>
    <body>
       <div class="container">
  
  <form class="form-horizontal" action="registration">
       <div class="form-group">
      <label class="control-label col-sm-2" for="fname">First Name:</label>
      <div class="col-sm-10">
        <input type="fname" class="form-control" id="username" placeholder="Enter First Name" name="fname">
      </div>
    </div>
       <div class="form-group">
      <label class="control-label col-sm-2" for="lname">Last name:</label>
      <div class="col-sm-10">
        <input type="lname" class="form-control" id="lname" placeholder="Enter Last Name" name="lname">
      </div>
    </div>
       <div class="form-group">
      <label class="control-label col-sm-2" for="addr">Address:</label>
      <div class="col-sm-10">
          <input type="textbox" class="form-control" id="address" placeholder="Enter Address" name="address">     </div>
    </div>
       <div class="form-group">
      <label class="control-label col-sm-2" for="email">Email:</label>
      <div class="col-sm-10">
        <input type="email" class="form-control" id="email" placeholder="Enter Email" name="Email">
      </div>
    </div>
       <div class="form-group">
      <label class="control-label col-sm-2" for="mobile">Mobile:</label>
      <div class="col-sm-10">
        <input type="number" class="form-control" id="mobile" placeholder="Enter Mobile No" name="mobile">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="username">Username:</label>
      <div class="col-sm-10">
        <input type="username" class="form-control" id="username" placeholder="Enter Username" name="username">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Password:</label>
      <div class="col-sm-10">          
        <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
      </div>
    </div>
   
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
  </form>
</div>
    </body>
</html>
<%@include file="footer.jsp" %>