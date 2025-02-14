<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>View Employee</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	</head>
	<body>
		<div class="container mt-5">
			<div>
				<p class="text-dark" style="font-size: 40px; text-align: center;">View All Employee Details Record</p>
			</div>
			<a href = "index.jsp" class="btn btn-primary btn-lg h2 text-dark">Go to index </a>	
			<table border = "1" class="table w- table-bordered table-striped"> 
				<thead>
					<tr class="table-dark">
						<th class="text-dark">Id</th>
						<th class="text-dark">Name</th>
						<th class="text-dark">Address</th>
						<th class="text-dark">Phone</th>
						<th class="text-dark">Salary</th>
						<th class="text-dark">Username</th>
						<th class="text-dark">Department</th>   
						<th class="text-dark">Edit</th>
						<th class="text-dark">Delete</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="emp" items= "${empList}">
						<tr>  
							<td>${emp.empId}</td>
							<td>${emp.empName}</td>
							<td>${emp.empAdd}</td>
							<td>${emp.empPhno}</td>
							<td>${emp.empSalary}</td>
							<td>${emp.empUser}</td>
							<td>${emp.empDept}</td>
							<td><a href="editEmp?empId=${emp.empId}" class="btn btn-outline-primary text-center w-75">Edit</a></td>
							<td><a href="deleteEmp?empId=${emp.empId}" class="btn btn-outline-primary text-center w-75">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	</body>
</html>