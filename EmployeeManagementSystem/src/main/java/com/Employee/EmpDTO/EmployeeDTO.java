package com.Employee.EmpDTO;

/**
 * Employee POJO Class
 */
public class EmployeeDTO {
	
	private int 	empId;
	private String 	empName;
	private String 	empAdd;
	private Long 	empPhno;
	private double 	empSalary;
	private String 	empUser;
	private String 	empDept;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}

	public Long getEmpPhno() {
		return empPhno;
	}

	public void setEmpPhno(Long empPhno) {
		this.empPhno = empPhno;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpUser() {
		return empUser;
	}

	public void setEmpUser(String empUser) {
		this.empUser = empUser;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
}
