package com.Employee.EmployeeServlet;

import java.io.IOException;
import java.util.List;

import com.Employee.EmpDAO.EmployeeDAO;
import com.Employee.EmpDAO.EmployeeDAOImplemetation;
import com.Employee.EmpDTO.EmployeeDTO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Setting annotation to configuring servlet to jsp file 
 */

@WebServlet("/viewEmp")
public class ViweEmployeeServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("ViewEmployeeServlet.doGet()");
		
		/**
		 * Call DAO to retrieve all employee
		 */
		EmployeeDAO empDao = new EmployeeDAOImplemetation();	//Initialize your DAO
		List<EmployeeDTO> empList = empDao.getAllEmps();
		
		/**
		 * Set the retrieved list in request scope
		 */
		
		req.setAttribute("empList", empList);
		
		/**
		 * Forward to a JSP page to display the employee
		 */
		
		req.getRequestDispatcher("./viewEmp.jsp").forward(req, resp);
	}
}
