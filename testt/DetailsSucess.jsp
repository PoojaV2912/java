<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.io.*,java.util.*,javax.servlet.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>X-workz</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<nav class="navbar" style="background-color: black; color:white">
		<h2 >X-workz</h2>
		
		<button type="submit" ><a href="index.jsp">Home</a></button>
		
	</nav>
	<h1>Bakery Information Successfully</h1>
	<%-- SiNO : ${items.sino}<br>
	 Fname : ${collect.fname}<br>
	Lname : ${items.lname}<br>
	Mname : ${items.mname}<br>
	Email : ${items.email}<br>
	Gender  : ${items.gender}<br>
	ContactNo  : ${items.contactno}<br>
	Area  : ${items.area}<br>
	DistrictDropDown  : ${items.districtdropdown}<br>
	StateDropDown  : ${items.statedropdown}<br>
	 Pincode  : ${items.pincode}  <br> --%>
	<jsp:useBean id="now" class="java.util.Date"/>
	Total of ${collect.fname} collect is ${(collect.lname*collect.fname)-(collet.mname/100*(collect.lname*collect.fname))}.
<br>
	<%Date date=new Date();
 out.print(date.toString());%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
</body>
</html>