<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Update Employee</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	</head>
	<body>
	<div class="container mt-5">
			<h2>Edit Employee</h2>
			
			<form action="editEmp" method = "post" style="background-color: rgba(0.2,0.3,0.4,0.11);">
				<div class="form-group">
					<input type="hidden" name="empId" value="${emp.empId}">
					
					<div class="form-group">
						<label for="Name">Name:</label>
						<input type="text" class="form-control" id="empName"  class="form-cobtrol" name = "empName" value="${emp.empName}"required>
					</div>
					
					<div class="form-group">
						<label for="Address">Address:</label>
						<input type="text" class="form-control" id="empAdd" name = "empAdd" value="${emp.empAdd}" required>
					</div>
					
					<div class="form-group">
						<label for="Phone">Phone:</label>
						<input type="number" class="form-control" id="empPhno" name = "empPhno" value="${emp.empPhno}" required>
					</div>
					
					<div class="form-group">
						<label for="Salary">Salary:</label>
						<input type="number" class="form-control" id="empSalary" name = "empSalary" value="${emp.empSalary}" required>
					</div>
					
					<div class="form-group">
						<label for="Username">Username:</label>
						<input type="text" class="form-control" id="empUser" name = "empUser" value="${emp.empUser}" required>
					</div>
					
					<div class="form-group">
						<label for="Dept">Department:</label>
						<input type="text" class="form-control" id="empDept" name = "empDept" value="${emp.empDept}" required>
					</div>
					
					<div class="mb-3">
						<button type="submit" class="btn btn-primary btn-lg w-100">Update  Employee</button>
					</div>
					
				</div>
			</form>
		</div>
		
		<!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	</body>
</html>