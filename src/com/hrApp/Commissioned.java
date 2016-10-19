package com.hrApp;

import java.util.ArrayList;

public class Commissioned extends AEmployee {

	private double baseSalary;
	private double commission;
	private ArrayList<Order> orders = new ArrayList<>();

	public Commissioned(String empId, double baseSalary, double commission) {
		super(empId);
		this.baseSalary = baseSalary;
		this.commission = commission;
	}

	@Override
	public double calGrossPay(DateRange dr) {
		double gross = 0;
		double orderCommission = 0;
		for(Order o: orders){
			orderCommission += o.getOrderAmount()* commission;
		}
		gross += baseSalary + orderCommission;
		return gross;
	}

	public void addOrders(Order o) {
		orders.add(o);
	}

}
