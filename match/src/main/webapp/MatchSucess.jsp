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
		<button type="submit" ><a href="MatchSucess.jsp">MatchSuccess</a></button>
		
	</nav>
	<h1>Match Details....</h1>
	<h5> Data saved Successfully</h5>
		
	Tournament Name : ${plays.name}<br>
	Hosting Country : ${plays.country}<br>
	Match Date : ${plays.date}<br>
	Team 1 : ${plays.team1}<br>
	Team 2 : ${plays.team2}<br>
	Team 1 Captain Name : ${plays.team1CName}<br>
	Team 2 Captain Name : ${plays.team2CName}<br>
	Umpire Name : ${plays.umpireName}<br>
	Stadium name= ${plays.stadiumName}<br>
	Third Umpire Name : ${plays.thirdUmpireName}<br>
	Stadium Capacity : ${plays.stadiumCapacity}<br>	
</body>
</html>