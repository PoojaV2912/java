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
<a href="loan.jsp" style="color:white">Loan</a>
</nav>
<h1> Loan Information.............</h1>
<div style="background-color: rgb(219, 240, 181)" height: 55vh; width: 50vh;">
<form action="loan" method="post">
<div class="mb-3">
Name: <input type="text" class="from-control" placeholder="Name " name="name">
</div><br>


<div class="mb-3">
Amount : <input type="text" class="from-control" placeholder=Amount name="amount">
</div><br>


<div class="mb-3">
Working : <input type="text" class="from-control" placeholder="Working" name="working">
</div><br>

<div class="mb-3">
Interest : <input type="text" class="from-control" placeholder="Interest" name="interest">
</div><br>

<div class="mb-3">
Surety : <input type="text" class="from-control" placeholder="Surety" name="surety">
</div><br>

<div class="mb-3">
Company : <input type="text" class="from-control" placeholder="Company" name="company">
</div><br>

<div class="mb-3">
Loan Tenure : <input type="text" class="from-control" placeholder="Loan Tenure" name="loanTenure">
</div><br>

<div class="mb-3">
Loan Type : <input type="text" class="from-control" placeholder="Loan Type" name="loanType">
</div><br>


<div class="mb-3">
Accept the Terms : <input type="text" class="from-control" placeholder="Accept the Terms" name="accepttheTerms">
</div><br>


<div style="text-align: center;">
<input type="Submit" value="save" class="btn btn-primary" />
</form>

</div>
</form>
</body>
</html>


