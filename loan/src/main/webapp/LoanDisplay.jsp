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
<h3 style ="color: white">X-workz</h3>
<a href="index.jsp" style="color:white">Home</a><br>
<a href="loan.jsp" style="color:white">Loan</a>
</nav>


<h1 align="center">Day Saved Sucessfully...........</h1>
<h3>Name : ${name }</h3>
<h3>Amount  : ${amount }</h3>
<h3>Working : ${working }</h3>
<h3>Interest  : ${interest }</h3>
<h3>Surety  : ${surety }</h3>
<h3>Company  : ${company }</h3>
<h3>Loan Tenure  : ${loanTenure  }</h3>
<h3>Loan Type  : ${loanType  }</h3>
<h3>Accept the Terms  : ${accepttheTerms }</h3>

</body>
</html>

