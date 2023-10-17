<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewpoint" content="width=device-width, intial-scale=1">
<title>X-workz</title>
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>

<nav class="navbar" style="background-color: black;">
<h3 style="color: white">X-workz</h3>
<a href="LoginSuccess.jsp" style="color:white">LoginSuccess</a>
</nav>
<h1> Login Information.............</h1>
<div style="background-color: rgb(219, 240, 181)" height: 55vh; width: 50vh;">
<form action="save" method="post">
<h2 style="color:green">${addressSuccess}</h2>
<div class="mb-3">
No: <input type="text" class="from-control" placeholder="Number " name="no">
</div><br>


<div class="mb-3">
Street : <input type="text" class="from-control" placeholder=Street name="street">
</div><br>


<div class="mb-3">
City : <input type="text" class="from-control" placeholder="City" name="city">
</div><br>

<div class="mb-3">
State : <input type="text" class="from-control" placeholder="State" name="state">
</div><br>

<div class="mb-3">
Country : <input type="text" class="from-control" placeholder="Country" name="country">
</div><br>

<input type="Submit" value="save" class="btn btn-primary" />
</form>

</div>
</form>
</body>
</html>


