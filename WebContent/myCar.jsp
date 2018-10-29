<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
div{

margin:20%;
font-size: 36px;
text-align: center;
color: #ccffff;

}

img {

    margin-top: auto;
    margin-left: auto;
    margin-right: auto;
}
body{
background-image: url(images/bg.jpg);
}
.sold{
color:#ff0000;
font-size: 50px;
text-align: center;

}

</style>
<title>${myCar.auto}</title>
</head>
<body>

<!-- add ccs and  = getting stuff from the session -->
<div>
	<img src="${myCar.pickImage}" alt="" style="width:125%">
	<br>
	<br>
	<c:if test="${myCar.sold}">
		Sold
	</c:if>
	<br>
	<br>
	${myCar.auto}
	<br>
	<br>
	<br>Manufacture Name : ${myCar.manufactureName}
	<br>Date of Purchase : ${myCar.purchaseDate}
	<br>Odometer : ${myCar.odometer} Km
	<br>Price : ${myCar.price}
	<br>Make : ${myCar.make}
	<br>Model : ${myCar.model}
	<br>Year : ${myCar.year}
	</div>
	
</body>
</html>