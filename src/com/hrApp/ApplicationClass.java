package com.hrApp;

import java.time.LocalDate;
import java.util.LinkedList;

public class ApplicationClass {

	public static void main(String[] args) {
		AEmployee salaried = new Salaried("sala123", 20000);
		AEmployee hourly = new Hourly("ho12", 20, 48);
		AEmployee commission = new Commissioned("co1", 6000, 7.0);
		LinkedList<AEmployee> employees = new LinkedList<>();
		employees.add(salaried);
		employees.add(commission);
		employees.add(hourly);
		for(AEmployee ae : employees){
			if(ae instanceof Commissioned){
				Commissioned commiss = (Commissioned)ae;
				commiss.addOrders(new Order("Or12a",LocalDate.of(2015, 10, 20),120));
				commiss.addOrders(new Order("Or13a",LocalDate.of(2015, 10, 24),100));
				commiss.addOrders(new Order("Or14a",LocalDate.of(2015, 10, 21),70));
			}
		}
	}
}
