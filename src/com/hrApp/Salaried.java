package com.hrApp;

public class Salaried extends AEmployee {

	private double salary;

	public Salaried(String empId, double salary) {
		super(empId);
		this.salary = salary;
	}

	@Override
	public double calGrossPay(DateRange dr) {
		return salary;

	}

}
