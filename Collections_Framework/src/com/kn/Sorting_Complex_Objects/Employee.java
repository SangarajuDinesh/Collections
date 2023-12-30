package com.kn.Sorting_Complex_Objects;

public class Employee
{
	int emp_id;
	String emp_name;
	double salary;
	
	public Employee(int emp_id, String emp_name, double salary) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.salary = salary;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", salary=" + salary + "]";
	}
	
	
}
