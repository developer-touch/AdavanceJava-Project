package com.Employee.EmployeeServlet;

import java.io.IOException;

import com.Employee.EmpDAO.EmployeeDAO;
import com.Employee.EmpDAO.EmployeeDAOImplemetation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Setting annotation to configuring servlet to jsp file 
 */

@WebServlet("/deleteEmp")
public class DeleteEmployeeServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("DeleteUserServlet.doGet()");
		
		/**
		 * Retrieve employee ID from request
		 */
		
		int empId = Integer.parseInt(req.getParameter("empId"));
		
		/**
		 * Call DAO to delete the employee
		 */
		
		EmployeeDAO empDao = new EmployeeDAOImplemetation();
		empDao.deleteUser(empId);
		
		/**
		 * Redirect back to view employee page or show confirmation
		 */
		
		resp.sendRedirect("viewEmp"); //redirect to view all users page 
	}
}
