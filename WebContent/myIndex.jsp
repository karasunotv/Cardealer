<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Serge's Boujee Cars</title><!-- This website is dedicated to my friend Serge -->
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="assets/css/main.css" />
</head>
<body>
here
<div id="wrapper">

				<!-- Header -->
					<header id="header">
						<span class="avatar"><img src="images/avatar.jpg" alt="" /></span>
						<h1>Welcome to the best car dealer, west of the Mississippi. <br><strong>Serge's Cars</strong>
						</h1>
					</header>

				<!-- Main -->
					<section id="main">

						<!-- NEED TO ADD ACTION,KEYS -->
							<section class="thumbnails">
								 <div>
								
									<c:forEach items="${carList}" var="car">
									<a href="carDetails?id=${car.id}">
										<img src="${car.pickImage}" alt="" />
										<h3>${car.auto}</h3><br> Click for more info
									</a>
									</c:forEach>
								</div>
								<div>
								
									<c:forEach items="${carList1}" var="car">
									<a href="carDetailsTwo?id=${car.id}">
										<img src="${car.pickImage}" alt="" />
										<h3>${car.auto}</h3><br> Click for more info
									</a>
									</c:forEach>
								</div>
								<div>
								
									<c:forEach items="${carList2}" var="car">
									<a href="carDetailsThree?id=${car.id}">
										<img src="${car.pickImage}" alt="" />
										<h3>${car.auto}</h3><br> Click for more info
									</a>
									</c:forEach>
								</div>
								<div>
								
									<!--<a href="reportSheetDetails?id=${report.id}">-->
									<a href="reportSheetDetails">
										<img src="images/thumbs/reports.jpg" alt="" />
									</a>
										<h3>${report.auto}</h3><br> Click for report sheet
									</a>
								
								</div>
							</section>
							
							

					</section>

				<!-- Footer -->
					<footer id="footer">
						<p>&copy; Untitled. All rights reserved.</p>
					</footer>

			</div>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
		
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/main.js"></script>
								
</body>
</html>