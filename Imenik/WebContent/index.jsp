<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>eeMenik</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<!--[if lte IE 8]><script src="js/ie/html5shiv.js"></script><![endif]-->
		<link rel="stylesheet" href="css/main.css" />
		<!-- <link rel="stylesheet" href="css/bootstrap.css" /> -->
		<!--[if lte IE 8]><link rel="stylesheet" href="css/ie8.css" /><![endif]-->
		<!--[if lte IE 9]><link rel="stylesheet" href="css/ie9.css" /><![endif]-->
</head>
	<body id="top">
	<!-- LOGIN BOX -->
	<div id="popupbox"> 
		<form name="login" id="login" action="login" method="post">
		Username:
		<input name="username" type="text" size="14" />
		Password:
		<input name="password" type="password" size="14" /><br></br>
		<input type="submit" name="submit" class="button special" value="PRIJAVA"/><br></br>
		<a href="javascript:login('hide');" class="button">ZATVORI</a>
		</form>
	</div> 
<!-- REGISTER BOX -->
	<div id="popupboxreg"> 
		<form name="register" id="register" action="create" method="post">
		Username:
		<input name="username" type="text" size="14" />
		Password:
		<input name="password" type="password" size="14" /><br></br>
		<input type="submit" name="submit" class="button special" value="REGISTRUJ ME"/><br></br>
		<a href="javascript:register('hide');" class="button">ZATVORI</a>
		</form>
	</div> 

		<!-- Header -->
			<header id="header">
				<div class="content">
					<h1><a href="#">eeMenik</a></h1>
					<p>Jednostavan. Brz. Vaš online adresar!<br />
					Design / Development: <a href="https://github.com/Argamore">Sefer "Argamore" Kuduzović</a></p>
					<ul class="actions">
						<li><a href="javascript:login('show');" class="button special icon fa-user">PRIJAVA</a></li>
						<li><a href="javascript:register('show');" class="button icon fa-user-plus">REGISTRACIJA</a></li>
						<li><a href="#one" class="button icon fa-chevron-down scrolly">INFORMACIJE</a></li>
					</ul>
				</div>
				<div class="image phone"><div class="inner"><img src="images/screen.jpg" alt="" /></div></div>
			</header>

		<!-- One -->
			<section id="one" class="wrapper style2 special">
				<header class="major">
					<h2>Imenik je rađen kao projekat na BILD-IT Advanced treningu<br /></h2>
				</header>
				<ul class="icons major">
					<li><span class="icon fa-book"><span class="label">JAVA</span></span></li>
					<li><span class="icon fa-database"><span class="label">SQL</span></span></li>
					<li><span class="icon fa-desktop"><span class="label">HTML5</span></span></li>
				</ul>
			</section>

		<!-- Two -->
			<section id="two" class="wrapper">
				<div class="inner alt">
					<section class="spotlight">
						<div class="image"><img src="images/pic01.jpg" alt="" /></div>
						<div class="content">
							<h3>JAVA Enterprise Edition</h3>
							<p>Za back-end soluciju se koristio programski jezik JAVA<br/></p>
						</div>
					</section>
					<section class="spotlight">
						<div class="image"><img src="images/pic02.jpg" alt="" /></div>
						<div class="content">
							<h3>HTML5 + CSS3 + SASS</h3>
							<p>Web-stranica je kompatibilna sa svim uređajima<br/>Responsive design FTW!</p>
						</div>
					</section>
					<section class="spotlight">
						<div class="image"><img src="images/pic03.jpg" alt="" /></div>
						<div class="content">
							<h3>MySQL</h3>
							<p>Web-imenik koristi MySQL sistem za upravljanje bazom podataka</p>
						</div>
					</section>
					<section class="special">
						<ul class="icons labeled">
							<li><span class="icon fa-refresh"><span class="label">Servlets / JSP</span></span></li>
							<li><span class="icon fa-cloud"><span class="label">GIThub</span></span></li>
							<li><span class="icon fa-code"><span class="label">MVC Pattern</span></span></li>
							<li><span class="icon fa-desktop"><span class="label">EL / JSTL</span></span></li>
						</ul>
					</section>
				</div>
			</section>

		<!-- Three -->
			<section id="three" class="wrapper style2 special">
					<div class="image">
					<a href="http://www.mozemo.ba" target="_blank" title="BILD-IT">
					<img src="images/picbild.jpg"></img></a>
					</div>
			</section>
		<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>