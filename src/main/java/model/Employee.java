package model;


public class Employee {
	public int id;
	public String name;
	public Double salary;

	public void EmployeePayroll() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeePayroll [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}