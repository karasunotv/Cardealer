<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
body{
background-image: url(images/bg.jpg)
}
title{
text-align: center;
}
.sheet {
text-align:center;
color: #C4FFFE;
font-size: 26px;
}
.sheet1 {
text-align: center;
color: #01FEB9;
font-size: 48px;
}

</style>
<title>Report Sheet</title>
</head>
<body>
<!-- String fName, String lName, String auto, String price,String transDate -->
 <div class="sheet1" >
 Report Sheet
 <br>
 <br>
</div>
 
 <div class="sheet" >
 <!--  ${myReportList} -->
 <c:forEach items="${myReportList}" var="report">
 	<br> Transaction Date : ${report.transDate}
 	<br>First Name : ${report.fName}
 	<br>Last Name : ${report.lName}
 	<br> Car : ${report.auto}
 	<br> Cost : ${report.price}
 	<br>
 	<br>
 	</c:forEach>

 </div>
</body>
</html>