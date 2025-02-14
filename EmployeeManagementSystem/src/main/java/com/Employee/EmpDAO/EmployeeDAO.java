package com.Employee.EmpDAO;

import java.util.List;

import com.Employee.EmpDTO.EmployeeDTO;


public interface EmployeeDAO {
	
	 void addUser(EmployeeDTO emp);
	 
	 List<EmployeeDTO> getAllEmps();
	 
	 EmployeeDTO getUserById(int empId);
	 
	 void updateUser(EmployeeDTO emp);
	 
	 void deleteUser(int empId);
}
