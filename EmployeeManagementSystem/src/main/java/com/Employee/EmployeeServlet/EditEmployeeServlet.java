package com.Employee.EmployeeServlet;

import java.io.IOException;

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

@WebServlet("/editEmp")
public class EditEmployeeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("EditServlet.doGet()");
		
		/**
		 * Retrieve employee ID from request
		 */
		
		int empId = Integer.parseInt(req.getParameter("empId"));
		
		System.out.println();
		
		/**
		 * Call the DAO to fetch employee details by ID
		 */
		
		EmployeeDAO empDao = new EmployeeDAOImplemetation();	//Initialize your DAO
		EmployeeDTO emp = empDao.getUserById(empId);
		
		/**
		 * Set employee object in request scope
		 */
		req.setAttribute("emp", emp);
		
		System.out.println(emp);
		
		/**
		 * Forward to a JSP page for editing 
		 */
		
		req.getRequestDispatcher("editEmp.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		/**
		 * Retrieve updated employee details from the form
		 */
		
		int    empId     = Integer.parseInt(req.getParameter("empId"));
		String empName   = req.getParameter("empName");
		String empAdd    = req.getParameter("empAdd");
		Long   empPhno   = Long.parseLong(req.getParameter("empPhno"));
		double empSalary = Double.parseDouble(req.getParameter("empSalary"));
		String empUser   = req.getParameter("empUser");
		String empDept   = req.getParameter("empDept");
		
		/**
		 * Create a new employee object
		 */
		
		EmployeeDTO updateEmp = new EmployeeDTO();
		
		updateEmp.setEmpName(empName);
		updateEmp.setEmpAdd(empAdd);
		updateEmp.setEmpPhno(empPhno);
		updateEmp.setEmpSalary(empSalary);
		updateEmp.setEmpUser(empUser);
		updateEmp.setEmpDept(empDept);
		
		/**
		 * Call DAO to update the employee
		 */
		
		EmployeeDAO empDao = new EmployeeDAOImplemetation();	//Initialize your DAO
		empDao.updateUser(updateEmp);
		
		/**
		 * Redirect back to view users page or show confirmation
		 */
		
		resp.sendRedirect("viewEmp");	//redirect to view all employee page
	}
}
