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
        <li class="active"><a href="#">Home</a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">Opcije<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="listcontacts.jsp">Lista kontakata</a></li>
          </ul>
        </li>
      </ul>
      <form class="navbar-form navbar-left" role="search" action="search" method="get">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="Kontakt pretraga" name="name">
				</div>
				<button type="submit" class="btn btn-default">Submit</button>
			</form>
	<form class="navbar-form navbar-right"><a href="logout" class="btn btn-danger">Logout</a>
	</form>
	<p class="navbar-text navbar-right">
				Signed in as: <b>${user.username}</b>
			</p>
    </div>
  </div>
</nav>