package com.hrApp;

import java.time.LocalDate;

public class Order {

	private String orerNo;
	private LocalDate orderDate;
	private double orderAmount;

	public Order(String orderNo, LocalDate orderDate, double orderAmount){
		setOrderAmount(orderAmount);
		setOrerNo(orderNo);
		setOrderDate(orderDate);
	}
	
	public String getOrerNo() {
		return orerNo;
	}

	public void setOrerNo(String orerNo) {
		this.orerNo = orerNo;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

}
