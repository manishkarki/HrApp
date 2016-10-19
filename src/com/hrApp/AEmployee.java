package com.hrApp;

import java.time.LocalDate;

public abstract class AEmployee {

	String empId;

	public void print() {
		System.out.println("EmpId:"+empId+" type::"+this.getClass().getName());
	}

	public AEmployee(String empId) {
		this.empId = empId;
	}

	public PayCheck calcCompensation(int month, int year) {
		DateRange dr = new DateRange(LocalDate.of(year, month, 1), LocalDate.of(year, month, 28));
		double totalGrossPay = calGrossPay(dr);
		return new PayCheck(dr, totalGrossPay);
	}

	public abstract double calGrossPay(DateRange dr);
}
