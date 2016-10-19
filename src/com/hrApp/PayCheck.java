package com.hrApp;

public class PayCheck {

	private double grossPay;
	private DateRange payPeriod;
	private final double fica = 0.23;
	private final double state = 0.05;
	private final double local = 0.01;
	private final double medicare = 0.03;
	private final double socialSecurity = 0.03;

	public void print() {
		System.out.println("NetPay:"+ getNetPay());
	}

	public PayCheck(DateRange dr, double totalGross) {
		payPeriod = dr;
		grossPay = totalGross;
	}

	public double getNetPay() {
		double netPay;
		netPay = grossPay - (fica*grossPay+ state* grossPay + local*grossPay + medicare * grossPay + socialSecurity * grossPay);
		return netPay;
	}

	public DateRange getPayPeriod() {
		return payPeriod;
	}
}
