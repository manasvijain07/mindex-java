
/**
 * This class represents a POJO for ReportingStructure
 * It has 2 data members - employee and numberOfReports
 *
 */

package com.mindex.challenge.data;

public class ReportingStructure {
	
	private Employee employee;
	private int numberOfReports;
	
	// getters and setters for employee
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	// getters and setters for numberOfReports
	public int getNumberOfReports() {
		return numberOfReports;
	}
	public void setNumberOfReports(int numberOfReports) {
		this.numberOfReports = numberOfReports;
	}

}
