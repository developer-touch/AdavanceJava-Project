package com.Employee.EmpDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Employee.ConnectionFactory.ConnectionFactory;
import com.Employee.EmpDTO.EmployeeDTO;

public class EmployeeDAOImplemetation implements EmployeeDAO {

	@Override
	public void addUser(EmployeeDTO emp) {

		try (Connection con = ConnectionFactory.getConnection();
				PreparedStatement ps = con.prepareStatement(
						"INSERT INTO employee_dtls (EMP_NAME,EMP_ADD,EMP_PHNO,EMP_SALARY,EMP_USERNAME,EMP_DEPT)"
								+ " VALUES (?,?,?,?,?,?)")) {

			ps.setString(1, emp.getEmpName());
			ps.setString(2, emp.getEmpAdd());
			ps.setLong(3, emp.getEmpPhno());
			ps.setDouble(4, emp.getEmpSalary());
			ps.setString(5, emp.getEmpUser());
			ps.setString(6, emp.getEmpDept());

			ps.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<EmployeeDTO> getAllEmps() {
		List<EmployeeDTO> empList = new ArrayList<EmployeeDTO>();

		try (Connection con = ConnectionFactory.getConnection();
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("SELECT * FROM employee_dtls");) {

			while (rs.next()) {
				EmployeeDTO empDto = new EmployeeDTO();
				empDto.setEmpId(rs.getInt("EMP_ID"));
				empDto.setEmpName(rs.getString("EMP_NAME"));
				empDto.setEmpAdd(rs.getString("EMP_ADD"));
				empDto.setEmpPhno(rs.getLong("EMP_PHNO"));
				empDto.setEmpSalary(rs.getDouble("EMP_SALARY"));
				empDto.setEmpUser(rs.getString("EMP_USERNAME"));
				empDto.setEmpDept(rs.getString("EMP_DEPT"));

				empList.add(empDto);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return empList;
	}

	@Override
	public EmployeeDTO getUserById(int empId) {

		EmployeeDTO emp = null;

		try (Connection con = ConnectionFactory.getConnection();
				PreparedStatement ps = con.prepareStatement("SELECT * FROM employee_dtls WHERE emp_id = ?");) {

			ps.setInt(1, empId);

			try (ResultSet rs = ps.executeQuery()) {

				if (rs.next()) {
					emp = new EmployeeDTO();

					emp.setEmpId(rs.getInt("EMP_ID"));
					emp.setEmpName(rs.getString("EMP_NAME"));
					emp.setEmpAdd(rs.getString("EMP_ADD"));
					emp.setEmpPhno(rs.getLong("EMP_PHNO"));
					emp.setEmpSalary(rs.getDouble("EMP_SALARY"));
					emp.setEmpUser(rs.getString("EMP_USERNAME"));
					emp.setEmpDept(rs.getString("EMP_DEPT"));
				}
			}
		}

		catch (SQLException se) {
			se.printStackTrace();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return emp;
	}

	@Override
	public void updateUser(EmployeeDTO emp) {

		try (Connection con = ConnectionFactory.getConnection();
				PreparedStatement ps = con
						.prepareStatement("UPDATE employee_dtls SET EMP_NAME = ?, EMP_PHNO = ?, EMP_SALARY = ?"
								+ "EMP_USERNAME = ?, EMP_DEPT = ? WHERE EMP_ID = ?");) {

			ps.setString(1, emp.getEmpName());
			ps.setString(2, emp.getEmpAdd());
			ps.setLong(3, emp.getEmpPhno());
			ps.setDouble(4, emp.getEmpSalary());
			ps.setString(5, emp.getEmpUser());
			ps.setString(6, emp.getEmpDept());

			ps.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteUser(int empId) {

		try (Connection con = ConnectionFactory.getConnection();
				PreparedStatement ps = con.prepareStatement("DELETE FROM employee_dtls WHERE EMP_ID = ?");) {

			ps.setInt(1, empId);

			ps.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}