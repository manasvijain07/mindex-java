
/**
 * This class represents POJO for Compensation.
 * A Compensation has the following fields: employee, salary, and effectiveDate.
 * This class also have getters and setters for the above mentioned fields
 */

package com.mindex.challenge.data;

public class Compensation {

	private Employee employee;
	private int salary;
	private String effectiveDate;
	
	public Employee getEmployee() {
		return employee;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getEffectiveDate() {
		return effectiveDate;
	}
	
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
}
