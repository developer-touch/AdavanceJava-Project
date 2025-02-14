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
@WebServlet("/addEmps")
public class AddEmployeeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 System.out.println("AddEmployeeServlet.doPost()");
		
		/**
		 * Retrieve parameter form the request 
		 */
		String empName   = req.getParameter("empName");
		String empAdd    = req.getParameter("empAdd");
		Long   empPhno   = Long.parseLong(req.getParameter("empPhno"));
		double empSalary = Double.parseDouble(req.getParameter("empSalary"));
		String empUser   = req.getParameter("empUser");
		String empDept   = req.getParameter("empDept");
		
		/**
		 * Creating Employee Object
		 */
		EmployeeDTO emp = new EmployeeDTO();
		
		emp.setEmpName(empName);
		emp.setEmpAdd(empAdd);
		emp.setEmpPhno(empPhno);
		emp.setEmpSalary(empSalary);
		emp.setEmpUser(empUser);
		emp.setEmpDept(empDept);
		
		/**
		 * Call EmployeeDAO to add the emp to the Database
		 */
		
		EmployeeDAO empDao = new EmployeeDAOImplemetation();
		empDao.addUser(emp);
		
		/**
		 * Redirect back to a success page or show confirmation 
		 */
		
		resp.sendRedirect("index.jsp"); //redirect to the main page
	}
}
