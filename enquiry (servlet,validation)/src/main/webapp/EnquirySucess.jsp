<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
		<button  type="submit" style="margin-left: 160vh"><a href="index.jsp">Home</a></button>
		<button type="submit" ><a href="EnquirySucess.jsp">EnquirySuccess</a></button>
		
	</nav>
	<h1>Match Details....</h1>
	<h5> Data saved Successfully</h5>
		
	 Name : ${chair.name}<br>
	mobileNo : ${chair.mobileNo}<br>
	eMail : ${chair.email}<br>
	dob : ${chair.dob}<br>
	location : ${chair.location}<br>

	
</body>
</html>