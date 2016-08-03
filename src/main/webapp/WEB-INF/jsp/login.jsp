<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="header.jsp" %>
<!doctype html>
<html>
<head>
    <title> login</title>
	 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<style>
body{

background-color : powderblue;
}
</style>
<div class="modal-dialog">
<div class="modal-content">
<div class="modal-header">
  <h1 class="text-center">Login</h1>
  </div>
  <div class="modal-body">
  <form class="col-md-12 center-block">
  <div class="form-group">
  <input type="text" class="form-control input-lg" placeholder="Id">
  </div>
  <div class="form-group">
  <input type="text" class="form-control input-lg" placeholder="Username">
  </div>
  <div class="form-group">
    <input type="password" class="form-control input-lg" placeholder="Passsword">
	</div>
	<div class="form-group">
	  <input type="submit" class="btn btn-block btn-lg btn-primary" value="Login">
	  <span class="pull-right"><a href="#">Register</a></span><span><a href="#">Forgot Passsword</a></span>
	</div>
	</form>
	<div class="modal-footer">
	<div class="col-md-12">
	     <button class="btn">Cancel</button>
	</div>
	</div>
</div>
</div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>