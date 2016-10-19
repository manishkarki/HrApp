package com.hrApp;

public class Hourly extends AEmployee {

	private double hourlyWages;
	private double hoursPerWeek;

	public Hourly(String empId, double hourlyWages, double hoursPerWeek) {
		super(empId);
		this.hourlyWages = hourlyWages;
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	public double calGrossPay(DateRange dr) {
		return hourlyWages * hoursPerWeek * 4;
	}

}
