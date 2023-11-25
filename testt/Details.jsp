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
<a href="index.jsp" style="color:white">Home</a><br>
<a href="Details.jsp" style="color:white">Details</a>
</nav>
<h1> Details Information.............</h1>
<div style="background-color: rgb(219, 240, 181)" height: 55vh; width: 50vh;">
<form action="bakery" method="post">

<div class="mb-3">
  SiNo: <input type="text" class="from-control" placeholder="siNo " name="siNo">
</div><br>

<div class="mb-3">
  Fname: <input type="text" class="from-control" placeholder="F Name " name="Fname">
</div><br>


<div class="mb-3">
 Lname : <input type="text" class="from-control" placeholder="l Name" name="Lname">
</div><br>

<div class="mb-3">
  Mname: <input type="text" class="from-control" placeholder="M Name " name="Mname">
</div><br>

<div class="mb-3">
  Email: <input type="text" class="from-control" placeholder=" email " name="Email">
</div><br>

<div class="mb-3">
  Gender: <input type="text" class="from-control" placeholder="gender " name="Gender">
</div><br>

<div class="mb-3">
  ContactNo: <input type="text" class="from-control" placeholder="contactNo " name="ContactNo">
</div><br>

<div class="mb-3">
  Area: <input type="text" class="from-control" placeholder="area " name="Area">
</div><br>

<div class="mb-3">
  DistrictDropDown: <input type="text" class="from-control" placeholder="districtDropDown " name="districtDropDown">
</div><br>

<div class="mb-3">
  StateDropDown: <input type="text" class="from-control" placeholder="stateDropDown " name="stateDropDown">
</div><br>

<div class="mb-3">
  Pincode: <input type="text" class="from-control" placeholder="pincode " name="pincode">
</div><br>


<div>
    

<div style="text-align: center;">
<input type="Submit" value="save" class="btn btn-success"/>
</div>

</form>

</div>
</body>
</html>


