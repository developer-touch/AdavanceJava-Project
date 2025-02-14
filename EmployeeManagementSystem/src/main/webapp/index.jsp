<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
			<meta charset="ISO-8859-1">
			<title>Home Page</title>
			<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	</head>
	<body>
		<div class="container mt-5">
			<div class="jumbotron">
				<h1 class="display-4">
					Welcome to Employee Management System!
				</h1>
				
				<p class="lead">
					This is a simple application to manage employees
				</p>
				
				<hr class="my-4">
				
				<p>Please select an operation</p>
				
				<p class="lead">
					<a class="btn btn-primary btn-lg" href="addEmp.jsp" role="button">Add Employee</a>
					<a class="btn btn-primary btn-lg" href= "viewEmp" role="button">View Employee</a>
				</p>
			</div>
		</div>
		<!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
		
	</body>
</html>