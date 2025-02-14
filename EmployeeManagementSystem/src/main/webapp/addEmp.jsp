<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Add User</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	</head>
	<body>
		<div class="container mt-5">
			<h2>Add Employee</h2>
			
			<form action="addEmps" method ="post">
			
				<div class="form-group" >
					<label for="Name">Name:</label>
					<input type="text" class="form-control" id="empName" name = "empName" required>
				</div>
				
				<div class="form-group">
					<label for="Address">Address:</label>
					<input type="text" class="form-control" id="empAdd" name = "empAdd" required>
				</div>
				
				<div class="form-group"> 
					<label for="Phone">Phone:</label>
					<input type="number" class="form-control" id="empPhno" name = "empPhno" required>
				</div>
				
				<div class="form-group">
					<label for="Salary">Salary:</label>
					<input type="number" class="form-control" id="empSalary" name = "empSalary" required>
				</div>
				
				<div class="form-group">
					<label for="Username">Username:</label>
					<input type="text" class="form-control" id="empUser" name = "empUser" required>
				</div>
				
				<div class="form-group">
					<label for="Dept">Department:</label>
					<input type="text" class="form-control" id="empDept" name = "empDept" required>
				</div>
				
				
					<button type="submit" class="btn btn-primary btn-lg w-100">Add Employee</button>
				
			</form>
		</div>
		<!-- Bootstrap JS and dependencies -->
	    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
	    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	</body>
</html>