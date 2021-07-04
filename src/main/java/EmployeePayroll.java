
/**
 * Purpose:Employee Payroll Service
 * @author sanyukta nirmal
 * @version 1.0
 * @since 28/06/2021
 * 
 */

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Exception.EmployeeException;
import model.Employee;
import service.EmployeePService;

public class EmployeePayroll {
	private static final Logger LOG = LogManager.getLogger(EmployeePService.class);
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws EmployeeException {
		Employee employeePayrollService = new Employee();
		((EmployeePService) employeePayrollService).readEPayrollData(readPayrollData());
		((EmployeePService) employeePayrollService).writePayrollData();
	}

	/**
	 * read employee payroll data
	 * 
	 * @return employeePayroll
	 */
	private static Employee readPayrollData() {
		Employee employeePayroll = new Employee();
		LOG.debug("Enter Employee id");
		int id = scanner.nextInt();
		employeePayroll.setId(id);
		LOG.debug("Enter Employee name");
		String name = scanner.next();
		employeePayroll.setName(name);
		LOG.debug("Enter Employee salary");
		Double salary = scanner.nextDouble();
		employeePayroll.setSalary(salary);
		return employeePayroll;
	}
}
