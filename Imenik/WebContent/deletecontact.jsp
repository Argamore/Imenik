<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>eeMenik | Kontakt lista</title>
    <link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>
<link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css'>
<link rel='stylesheet prefetch' href='http://cdnjs.cloudflare.com/ajax/libs/jquery.bootstrapvalidator/0.5.0/css/bootstrapValidator.min.css'>

 </head>
 <jsp:include page="header.jsp"></jsp:include>
 <body>
<div class="container">

    <form class="well form-horizontal" action="delete" method="post">
<fieldset>

<!-- Form Name -->
<legend>Obrisati kontakt</legend>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label">Ime</label>  
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input type="text" class="form-control" id="name" name="name"
						value="${contact.name }" />
    </div>
  </div>
</div>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label" >Prezime</label> 
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input type="text" class="form-control" id="lastname"
						name="lastname" value="${contact.lastname}">
    </div>
  </div>
</div>

<!-- Text input-->
       <div class="form-group">
  <label class="col-md-4 control-label">E-Mail</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
  <input type="email" class="form-control" id="email" name="email"
						value="${contact.email}">
    </div>
  </div>
</div>


<!-- Text input-->
       
<div class="form-group">
  <label class="col-md-4 control-label">Telefon</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
  <input type="text" class="form-control" id="phone" name="phone"
						value="${contact.phone}">
						<input type="hidden" name="id"
				value="${contact.contactId}">
    </div>
  </div>
</div>
<!-- Poruka -->
<div id="success_msg" style="display:none" class="alert alert-success" role="alert">Kontakt obrisan <i class="glyphicon glyphicon-thumbs-up"></i></div>

<!-- Dugme -->
<div class="form-group">
  <label class="col-md-4 control-label"></label>
  <div class="col-md-4">
    <button onClick="pokaziPorukuu()" type="submit" class="btn btn-warning" >Obrisati? <span class="glyphicon glyphicon-remove"></span></button>
    <script>
    function pokaziPorukuu() {
    	   document.getElementById('success_msg').style.display = "block";
    	}
    </script>
  </div>
</div>

</fieldset>
</form>
</div>
</body>
</html>