package service;

import Exception.EmployeeException;
import model.Employee;

public interface EmployeePService {
	public void readEPayrollData(Employee employeePayroll) throws EmployeeException;

	public void writePayrollData() throws EmployeeException;
}
