<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- NAVIGACIJA -->
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="\Imenik/index.jsp">eeMenik</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Početna</a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">Kontakt<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Dodaj kontakt</a></li>
            <li><a href="#">Edituj kontakt</a></li>
            <li><a href="#">Izbriši kontakt</a></li>
          </ul>
        </li>
      </ul>
      <form class="navbar-form navbar-left" role="search" action="search" method="get">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="Pretraži kontakte" name="name">
				</div>
				<button type="submit" class="btn btn-default">Submit</button>
        <a href="logout" class="btn btn-danger">Logout</a>
			</form>
    </div>
  </div>
</nav>