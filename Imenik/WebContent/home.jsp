<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>eeMenik | Home</title>
<link rel="stylesheet" href="\Imenik/assets/css/bootstrap.css">
<link rel="stylesheet" href="\Imenik/assets/css/bootstrap.min.css">
<link rel="stylesheet" href="\Imenik/assets/css/bootstrapValidator.min.css">
<link rel="stylesheet" href="\Imenik/assets/css/bootstrap-theme.min.css">
  <script src="\Imenik/assets/js/jquery.min.js"></script>
  <script src="\Imenik/assets/js/bootstrap.min.js"></script>
  <script src="\Imenik/assets/js/bootstrapvalidator.min.js"></script>
  <script src="\Imenik/assets/js/index.js"></script>
<script src="http://s.codepen.io/assets/libs/modernizr.js" type="text/javascript"></script>

 </head>
 <jsp:include page="assets/header.jsp"></jsp:include>
 <body>
<div class="container">

    <form class="well form-horizontal" action="addContact" method="post"  id="contact_form">
<fieldset>

<!-- Form Name -->
<legend>Dodaj kontakt</legend>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label">Ime</label>  
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input  name="name" placeholder="Ime" class="form-control"  type="text">
    </div>
  </div>
</div>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label" >Prezime</label> 
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input name="lastname" placeholder="Prezime" class="form-control"  type="text">
    </div>
  </div>
</div>

<!-- Text input-->
       <div class="form-group">
  <label class="col-md-4 control-label">E-Mail</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
  <input name="email" placeholder="E-Mail" class="form-control"  type="text">
    </div>
  </div>
</div>


<!-- Text input-->
       
<div class="form-group">
  <label class="col-md-4 control-label">Telefon</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
  <input name="phone" placeholder="0038761234567" class="form-control" type="text">
    </div>
  </div>
</div>
<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label"></label>
  <div class="col-md-4">
    <button onClick="dodan()" type="submit" class="btn btn-warning" >Dodaj</button>
    <script>
function dodan() {
    alert("Kontakt uspješno dodan!");
}
</script>
  </div>
</div>

</fieldset>
</form>
</div>

<div class="container"></div> 
 </body>